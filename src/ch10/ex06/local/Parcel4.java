package ch10.ex06.local;

/**
 * Created by V1 on 15-Feb-17.
 */
public class Parcel4 {
    private class PContents implements IContents {  // внутренний скрытый класс с интерфейсом
        private int value = 11;

        @Override
        public int getValue() {
            return value;
        }
    }

    protected class PDestination implements IDestination {
        public PDestination(String label) {
            this.label = label;
        }

        private String label;

        @Override
        public String getLabel() {
            return label;
        }

    }

    public IContents getPContents() {  // получить ссылку на объект внутреннего класса
        return new PContents();
    }

    public IDestination getPDestination(String label) {
        return  new PDestination(label);
    }
}
