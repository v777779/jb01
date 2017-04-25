package ch19.ex08.exercise.office;

/**
 * Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 19-Apr-17.
 */
public class PostOffice2 {
    enum MailHandler implements IHandler<Mail2> {
        GENERAL_DELIVERY {
            @Override
            public boolean handle(Mail2 m) {
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
        },
        MACHINE_SCAN {
            @Override
            public boolean handle(Mail2 m) {
                switch (m.scannability) {
                    case UNSCANNABLE:
                        return false;
                    default:
                        switch (m.address) {
                            case INCORRECT:
                                return false;
                            default:
                                System.out.println("using general delivery for " + m);
                                return true;
                        }
                }
            }
        },
        VISUAL_INSPECTION {
            @Override
            public boolean handle(Mail2 m) {
                switch (m.readability) {
                    case ILLEGIBLE:
                        return false;
                    default:
                        switch (m.address) {
                            case INCORRECT:
                                return false;
                            default:
                                System.out.println("using general delivery for " + m);
                                return true;
                        }
                }
            }
        },
        RETURN_TO_SENDER {
            @Override
            public boolean handle(Mail2 m) {
                switch (m.returnAddress) {
                    case MISSING:
                        return false;
                    default:
                        System.out.println("Returning " + m + " to sender");
                        return true;
                }
            }
        },
        FORWARD_SENDING {
            @Override
            public boolean handle(Mail2 m) {
                switch (m.forwardAddress) {
                    case MISSING:
                        return false;
                    default:
                        System.out.println("Forwarding " + m + " to sender");
                        return true;
                }
            }
        }
    }

    static void handle(Mail2 m) {
        for (MailHandler handler : MailHandler.values()) {
            if (handler.handle(m)) {
                return;
            }
        }
        System.out.println(m + " is undeliverable letter");
    }

    public static void check() {
        for (Mail2 mail : Mail2.generator(5)) {
            System.out.println(mail.details());
            handle(mail);
            System.out.println("=====");
        }
    }
}
