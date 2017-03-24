package ch.ex23.access;

/**
 * Created by V1 on 14-Feb-17.
 */
public class Sequence {
    private Object[] items; // ссылка пустая на массив ссылок Object
    private int next = 0;


    public class Selector implements ISelector { //  внутренний класс перебирает объекты в прямом порядке


        @Override
        public boolean checkEnd() {             // проверяет последний это элемент или нет
            validNext();
            return (Sequence.this.next == (items.length - 1));
        }

        @Override
        public Object getCurrent() {            // вытаскивает текущий объект
            validNext();
            return items[Sequence.this.next];
        }

        @Override
        public void nextIndex() {
            if (!checkEnd()) {
                Sequence.this.next++;                    // останавливаемся на items.length-1
            }


        }
    }

    public ISelector getReverse() {
        return new ISelector() {

            @Override
            public boolean checkEnd() {
                validNext();
                return (Sequence.this.next  == 0);
            }

            @Override
            public Object getCurrent() {
                validNext();
                return items[Sequence.this.next ];
            }

            @Override
            public void nextIndex() {
                if (!checkEnd()) {
                    Sequence.this.next --;
                }

            }
        };
    }


    public Sequence(int size) {
        items = new Object[size];   // создали массив пустых ссылок
        initSequence();             // и тут же проинициализировали
    }

    private void validNext() {
        if (Sequence.this.next < 0 || Sequence.this.next >= items.length) {
            Sequence.this.next = 0;
        }
    }

    public void add(Object o) {
        if (next < items.length) {
            items[next++] = o;  // прописали новую ссылку в массиве на объект
        }
    }

    public void initSequence() {
        for (int i = 0; i < items.length; i++) {
            add(Integer.toString(i));  // добавить 10 объектов типа Integer
        }
    }

    public Selector getForward() {
        return new Selector();
    }

    public void play(ISelector s){
        for (int i = 0; i < items.length+5 ; i++) {
            System.out.print(s.getCurrent()+".");
            s.nextIndex();
        }
        System.out.println();
    }


}
