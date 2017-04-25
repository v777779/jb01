package ch19.ex08.exercise.office;

import lib.utils.Enums;

import java.util.Iterator;

/**
 * Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 19-Apr-17.
 */
public class Mail2 {  // обычный класс
    private static long counter = 0;
    private long id = counter++;

    enum GeneralDelivery {YES, NO1, NO2, NO3, NO4, NO5}

    enum Scannability {UNSCANNABLE, YES1, YES2, YES3, YES4}

    enum Readability {ILLEGIBLE, YES1, YES2, YES3, YES4}

    enum Address {INCORRECT, OK1, OK2, OK3, OK4, OK5, OK6}

    enum ReturnAddress {MISSING, OK1, OK2, OK3, OK4, OK5, OK6}

    enum ForwardAddress {MISSING, OK1, OK2, OK3, OK4, OK5, OK6}

    GeneralDelivery generalDelivery;
    Scannability scannability;
    Readability readability;
    Address address;
    ReturnAddress returnAddress;
    ForwardAddress forwardAddress;

    public String details() {
        return toString() +
                ", General Delivery :" + generalDelivery +
                ", Address Scannability:" + scannability +
                ", Address Readability :" + readability +
                ", Address Address :" + address +
                ", Return Address :" + returnAddress +
                ", Forward Address :" + forwardAddress;

    }

    public static Mail2 randomMail() {
        Mail2 m = new Mail2();
        m.generalDelivery = Enums.random(GeneralDelivery.values());
        m.scannability = Enums.random(Scannability.values());
        m.readability = Enums.random(Readability.values());
        m.address = Enums.random(Address.values());
        m.returnAddress = Enums.random(ReturnAddress.values());
        m.forwardAddress = Enums.random(ForwardAddress.values());
        return m;
    }

    public static Iterable<Mail2> generator(final int count) {
        return new Iterable<Mail2>() {
            int n = count; // число писем на просмотр

            @Override
            public Iterator<Mail2> iterator() {
                return new Iterator<Mail2>() {
                    @Override
                    public boolean hasNext() {
                        return n-- > 0;
                    }

                    @Override
                    public Mail2 next() {
                        return randomMail();
                    }
                };
            }
        };
    }

    @Override
    public String toString() {
        return "Mail2 " + id;
    }
}
