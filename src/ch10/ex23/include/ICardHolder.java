package ch.ex23.include;


/**
 * Created by V1 on 16-Feb-17.
 */
public interface ICardHolder {
    static ICard getCardVisa() {
        return new CardVisa();
    }

    static ICard getCardMaster() {
        return new CardMaster();
    }

    static ICard getCardVTB() {
        return new CardHolder().new CardVTB();// создание закрытого класса
    }

    static ICard getCardSB() {
        return new CardHolder().new CardSB();// создание закрытого класса
    }

    class CardVisa implements ICard {
        @Override
        public void insert() {
        }

        @Override
        public void status() {
            System.out.println("Card.Visa.status");
        }

        @Override
        public void extract() {
        }

        @Override
        public void processing() {

        }
    }

    class CardMaster implements ICard {
        @Override
        public void insert() {
        }

        @Override
        public void status() {
            System.out.println("Card.MasterCard.status");
        }

        @Override
        public void extract() {
        }

        @Override
        public void processing() {
        }
    }


    class CardHolder {
        private class CardVTB implements ICard {
            @Override
            public void insert() {
            }

            @Override
            public void status() {
                System.out.println("Card.VTB24.status");
            }

            @Override
            public void extract() {
            }

            @Override
            public void processing() {

            }
        }

        private class CardSB implements ICard {
            @Override
            public void insert() {
            }

            @Override
            public void status() {
                System.out.println("Card.SberBank.status");
            }

            @Override
            public void extract() {
            }

            @Override
            public void processing() {
            }
        }
    }
}
