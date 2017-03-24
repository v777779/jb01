package ch10.ex02.local;

/**
 * Created by V1 on 14-Feb-17.
 */
public class Sequence {
    private Object[] items; // ссылка пустая на массив ссылок Object
    private int next = 0;
    private Sequence pLink = this;

    public class Selector implements ISelector { // inner class
        private int index = 0;

        @Override
        public boolean checkEnd() {     // проверяет последний это элемент или нет
            return (index == items.length);
        }

        @Override
        public Object getCurrent() {    // вытаскивает текущий объект
            if (checkEnd()) return null; // не даем упороть индекс
            return items[index];
        }

        @Override
        public void nextIndex() {
            if (index < items.length) {
                index++;
            }
        }

       public  void showLinks() {
           System.out.println("Selector showlinks");
            System.out.println("Inner class link:" + this);
           System.out.println("Inner class link:" + Selector.this);
            System.out.println("Ext Class link  :" + pLink);
           System.out.println("Ext Class link  :" + Sequence.this);

        }

    }

    public Sequence(int size) {
        items = new Object[size]; // создали массив пустых ссылок
    }

    public void add(Object o) {
        if (next < items.length) {
            items[next++] = o;  // прописали новую ссылку в массиве на объект
        }
    }

    public  void showLinks() {
        System.out.println("Sequence showlinks");
//        System.out.println("Inner class link:" +    new);
        System.out.println("Ext Class link    :" + this);
   }

    public Selector getInner() {
        return new Selector();
    }

}
