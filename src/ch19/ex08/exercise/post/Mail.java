package ch19.ex08.exercise.post;

import lib.utils.Enums;

import java.util.Iterator;

/**
 * Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 19-Apr-17.
 */
public class Mail {  // обычный класс
    private static long counter = 0;
    private long id = counter++;

    enum GeneralDelivery {YES, NO1, NO2, NO3, NO4, NO5}

    enum Scannability {UNSCANNABLE, YES1, YES2, YES3, YES4}

    enum Readability {ILLEGIBLE, YES1, YES2, YES3, YES4}

    enum Address {INCORRECT, OK1, OK2, OK3, OK4, OK5, OK6}

    enum ReturnAddress {MISSING, OK1, OK2, OK3, OK4, OK5, OK6}

    enum RegionAddress {LOCA, LOCB, LOCC, OK1, OK2, OK3}

    GeneralDelivery generalDelivery;
    Scannability scannability;
    Readability readability;
    Address address;
    ReturnAddress returnAddress;
    RegionAddress regionAddress;

    private String regDecode() {
        switch (regionAddress) {
            case LOCA:
                return "LocationA";
            case LOCB:
                return "LocationB";
            case LOCC:
                return "LocationC";
            default:
                return "Local Office";
        }
    }

    public String details() {
        return toString() +
                ", General Delivery :" + generalDelivery +
                ", Address Scannability:" + scannability +
                ", Address Readability :" + readability +
                ", Address Address :" + address +
                ", PostOffice2 :" + regDecode()+
                ", Return Address :" + returnAddress;
    }

    public static Mail randomMail() {
        Mail m = new Mail();
        m.generalDelivery = Enums.random(GeneralDelivery.values());
        m.scannability = Enums.random(Scannability.values());
        m.readability = Enums.random(Readability.values());
        m.address = Enums.random(Address.values());
        m.returnAddress = Enums.random(ReturnAddress.values());
        m.regionAddress = Enums.random(RegionAddress.values());
        return m;
    }

    public static Iterable<Mail> generator(final int count) {
        return new Iterable<Mail>() {
            int n = count; // число писем на просмотр

            @Override
            public Iterator<Mail> iterator() {
                return new Iterator<Mail>() {
                    @Override
                    public boolean hasNext() {
                        return n-- > 0;
                    }

                    @Override
                    public Mail next() {
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
