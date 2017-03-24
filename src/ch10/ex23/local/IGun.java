package ch.ex23.local;

/**
 * Created by V1 on 16-Feb-17.
 */
public interface IGun {
    void shoot();
    void charge();
    void service();

    ICart getCart();

    static ICart getCartStatic() {
        return new Gun().new Magazine().new Cartridge();
    }

    class Gun implements IGun {

        @Override
        public void shoot() {
            System.out.println("Gun.shoot");
        }

        @Override
        public void charge() {
            System.out.println("Gun.charge");
        }

        @Override
        public void service() {
            System.out.println("Gun.service");
        }

        @Override
        public ICart getCart() {
            return new Magazine().new Cartridge();  // создаем картридж
        }

        private class Magazine {
            private int nCart = 30;  // число патронов

            private String getNCart() {
                return "Magazine." + nCart;
            }

            private class Cartridge implements ICart{
                private String caliber = "7.62";

                public String getCaliber() {
                    return "Cartridge." + caliber;
                }
                public void show() {
                    charge();
                    shoot();
                    System.out.println(getNCart());
                    System.out.println(getCaliber());
                    System.out.println();
                }
            }

        }


    }


}
