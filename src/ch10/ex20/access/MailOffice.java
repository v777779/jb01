package ch.ex20.access;

/**
 * Created by V1 on 15-Feb-17.
 */
public class MailOffice {
     private class MailDest implements IDestination { // статический вложенный класс
        private String label;

        public MailDest(String label) {
            this.label = label;
        }

        @Override
        public String getLabel() {
            return label;
        }


        private class HighLevel implements IEntry{  // вложенный класс
            private int valueY = 75;
            public void g(){
                System.out.println("Func.g.ValueY."+valueY);
            }

            @Override
            public String toString() {
                return "HighLevel{" + "valueY=" + valueY +  '}';
            }
        }

        @Override
        public IEntry getEntry() {  // создать экземпляр
            return new HighLevel();
        }

        @Override
        public String toString() {
            return "MailDest{" +
                    "label='" + label + '\'' +
                    '}';
        }
    } // static ParcelDest

    public IDestination getClassDest(String s) {
        return new MailDest(s);
    }

}
