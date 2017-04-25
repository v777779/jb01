package ch19.ex09.exercise.post;

import java.util.EnumMap;
import java.util.Map;

import static ch19.ex09.exercise.post.PostOffice.MailHandler.*;

/**
 * Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 19-Apr-17.
 */
public class PostOffice {
    enum MailHandler {
        GENERAL_DELIVERY, MACHINE_SCAN, VISUAL_INSPECTION, RETURN_TO_SENDER
    }
    static EnumMap<MailHandler, IHandler<Mail>> enumMap;

    static {
        enumMap = getMap();
    }

    private static EnumMap<MailHandler, IHandler<Mail>> getMap() {
        EnumMap<MailHandler, IHandler<Mail>> enumMap = new EnumMap<MailHandler, IHandler<Mail>>(MailHandler.class);
        enumMap.put(GENERAL_DELIVERY, new IHandler<Mail>() {
            @Override
            public boolean handle(Mail m) {
                switch (m.generalDelivery) {
                    case YES:
                        switch (m.address) {
                            case INCORRECT:
                                return false;
                            default:
                                System.out.println("using general delivery for " + m);
                                return true;
                        }
                    default:
                        return false;
                }
            }
        });
        enumMap.put(MACHINE_SCAN, new IHandler<Mail>() {
            @Override
            public boolean handle(Mail m) {
                switch (m.scannability) {
                    case UNSCANNABLE:
                        return false;
                    default:
                        switch (m.address) {
                            case INCORRECT:
                                return false;
                            default:
                                System.out.println("Delivering " + m + " automatically");
                                return true;
                        }
                }
            }
        });
        enumMap.put(VISUAL_INSPECTION, new IHandler<Mail>() {
            @Override
            public boolean handle(Mail m) {
                switch (m.readability) {
                    case ILLEGIBLE:
                        return false;
                    default:
                        switch (m.address) {
                            case INCORRECT:
                                return false;
                            default:
                                System.out.println("Delivering " + m + " normally");
                                return true;
                        }
                }
            }
        });
        enumMap.put(RETURN_TO_SENDER, new IHandler<Mail>() {
            @Override
            public boolean handle(Mail m) {
                switch (m.returnAddress) {
                    case MISSING:
                        return false;
                    default:
                        System.out.println("Returning " + m + " to sender");
                        return true;
                }
            }
        });

        return enumMap;
    }

    static void handle(Mail m) {
        for (Map.Entry<MailHandler, IHandler<Mail>> entry : enumMap.entrySet()) {
            if (entry.getValue().handle(m)) {
                return;
            }
        }
        System.out.println(m + " is undeliverable letter");
    }

    public static void check() {
        for (Mail mail : Mail.generator(10)) {
            System.out.println(mail.details());
            handle(mail);
            System.out.println("*****************");
        }
    }
}
