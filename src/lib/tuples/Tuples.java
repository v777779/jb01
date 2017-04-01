package lib.tuples;

/**
 * Created by V1 on 14-Mar-17.
 */
public class Tuples {
    public static class TwoTuple<A, B> implements Comparable<TwoTuple<A, B>> {
        private A first;
        private B second;

        public TwoTuple(A first, B second) {
            this.first = first;
            this.second = second;
        }

        public A getFirst() {
            return first;
        }

        public B getSecond() {
            return second;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof TwoTuple)) return false;

            TwoTuple<A, B> twoTuple = (TwoTuple<A, B>) o;

            if (first != null ? !first.equals(twoTuple.getFirst()) : twoTuple.getFirst() != null) return false;
            return second != null ? second.equals(twoTuple.getSecond()) : twoTuple.getSecond() == null;
        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public int compareTo(TwoTuple<A, B> o) {  // здесь нет наследования поэтому не нужно проверять класс объекта
            int cmp = ((Comparable<A>) first).compareTo(o.getFirst());   // вот так сравнение с Generic<T>
            if (cmp != 0) {
                return cmp; // вернуть результат сравнения
            }
            return ((Comparable<B>) second).compareTo(o.getSecond()); // вернуть результат сравнения
        }

        @Override
        public String toString() {
            return "TwoTuple{" + getFirst() + " " + getSecond() +
                    '}';
        }
    }

    public static class ThreeTuple<A, B, C> implements Comparable<ThreeTuple<A, B, C>> {
        private TwoTuple<A, B> tuple;
        private C third;

        public ThreeTuple(A first, B second, C third) {
            tuple = new TwoTuple<A, B>(first, second);
            this.third = third;
        }

        public A getFirst() {
            return tuple.getFirst();
        }

        public B getSecond() {
            return tuple.getSecond();
        }

        public C getThird() {
            return third;
        }

        public TwoTuple<A, B> getTuple() {
            return tuple;
        }


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof ThreeTuple)) return false;

            ThreeTuple<A, B, C> that = (ThreeTuple<A, B, C>) o;

            if (tuple != null ? !tuple.equals(that.getTuple()) : that.getTuple() != null) return false;
            return third != null ? third.equals(that.getThird()) : that.getThird() == null;
        }

        @Override
        public int hashCode() {
            int result = tuple != null ? tuple.hashCode() : 0;
            result = 31 * result + (third != null ? third.hashCode() : 0);
            return result;
        }

        @Override
        public int compareTo(ThreeTuple<A, B, C> o) {
            int cmp = tuple.compareTo(o.getTuple());   // вот так сравнение с Generic<T>
            if (cmp != 0) {
                return cmp; // вернуть результат сравнения
            }
            return ((Comparable<C>) third).compareTo(o.getThird()); // вернуть результат сравнения
        }

        @Override
        public String toString() {
            return "ThreeTuple{" + getFirst() + " " + getSecond() + " " +
                    getThird() +
                    '}';
        }

    }

    public static class FourTuple<A, B, C, D> implements Comparable<FourTuple<A, B, C, D>> {

        ThreeTuple<A, B, C> tuple;
        public D fourth;

        public FourTuple(A first, B second, C third, D fourth) {
            tuple = new ThreeTuple(first, second, third);
            this.fourth = fourth;
        }

        public ThreeTuple<A, B, C> getTuple() {
            return tuple;
        }

        public A getFirst() {
            return tuple.getFirst();
        }

        public B getSecond() {
            return tuple.getSecond();
        }

        public C getThird() {
            return tuple.getThird();
        }

        public D getFourth() {
            return fourth;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof FourTuple)) return false;

            FourTuple<A, B, C, D> fourTuple = (FourTuple<A, B, C, D>) o;

            if (tuple != null ? !tuple.equals(fourTuple.getTuple()) : fourTuple.getTuple() != null) return false;
            return fourth != null ? fourth.equals(fourTuple.getFourth()) : fourTuple.getFourth() == null;
        }

        @Override
        public int hashCode() {
            int result = tuple != null ? tuple.hashCode() : 0;
            result = 31 * result + (fourth != null ? fourth.hashCode() : 0);
            return result;
        }

        @Override
        public int compareTo(FourTuple<A, B, C, D> o) {
            int cmp = tuple.compareTo(o.getTuple());   // вот так сравнение с Generic<T>
            if (cmp != 0) {
                return cmp; // вернуть результат сравнения
            }
            return ((Comparable<D>) fourth).compareTo(o.getFourth()); // вернуть результат сравнения
        }


        @Override
        public String toString() {
            return "FourTuple{" + getFirst() + " " + getSecond() + " " +
                    getThird() + " " + getFourth() +
                    '}';
        }
    }

    public static class FiveTuple<A, B, C, D, E> implements Comparable<FiveTuple<A, B, C, D, E>> {
        FourTuple<A, B, C, D> tuple;
        E fifth;

        public FiveTuple(A first, B second, C third, D fourth, E fifth) {
            tuple = new FourTuple<>(first, second, third, fourth);
            this.fifth = fifth;
        }

        public A getFirst() {
            return tuple.getFirst();
        }

        public B getSecond() {
            return tuple.getSecond();
        }

        public C getThird() {
            return tuple.getThird();
        }

        public D getFourth() {
            return tuple.getFourth();
        }

        public E getFifth() {
            return fifth;
        }

        public FourTuple<A, B, C, D> getTuple() {
            return tuple;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof FiveTuple)) return false;

            FiveTuple<A, B, C, D, E> fiveTuple = (FiveTuple<A, B, C, D, E>) o;

            if (tuple != null ? !tuple.equals(fiveTuple.getTuple()) : fiveTuple.getTuple() != null) return false;
            return fifth != null ? fifth.equals(fiveTuple.getFifth()) : fiveTuple.getFifth() == null;
        }

        @Override
        public int hashCode() {
            int result = tuple != null ? tuple.hashCode() : 0;
            result = 31 * result + (fifth != null ? fifth.hashCode() : 0);
            return result;
        }

        @Override
        public int compareTo(FiveTuple<A, B, C, D, E> o) {
            int cmp = tuple.compareTo(o.getTuple());   // вот так сравнение с Generic<T>
            if (cmp != 0) {
                return cmp; // вернуть результат сравнения
            }
            return ((Comparable<E>) fifth).compareTo(o.getFifth()); // вернуть результат сравнения
        }


        @Override
        public String toString() {
            return "FiveTuple{ [" + getFirst() + "] [" + getSecond() + "] [" +
                    getThird() + "] [" + getFourth() + "] [" + getFifth() +
                    "] }";
        }

    }

    public static class SixTuple<A, B, C, D, E, F> implements Comparable<SixTuple<A, B, C, D, E, F>> {
        FiveTuple<A, B, C, D, E> tuple;
        F sixth;

        public SixTuple(A first, B second, C third, D fourth, E fifth, F sixth) {
            tuple = new FiveTuple<>(first, second, third, fourth, fifth);
            this.sixth = sixth;
        }

        public A getFirst() {
            return tuple.getFirst();
        }

        public B getSecond() {
            return tuple.getSecond();
        }

        public C getThird() {
            return tuple.getThird();
        }

        public D getFourth() {
            return tuple.getFourth();
        }

        public E getFifth() {
            return tuple.getFifth();
        }

        public F getSixth() {
            return sixth;
        }

        public FiveTuple<A, B, C, D, E> getTuple() {
            return tuple;
        }


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof SixTuple)) return false;

            SixTuple<A, B, C, D, E, F> sixTuple = (SixTuple<A, B, C, D, E, F>) o;

            if (tuple != null ? !tuple.equals(sixTuple.getTuple()) : sixTuple.getTuple() != null) return false;
            return sixth != null ? sixth.equals(sixTuple.getSixth()) : sixTuple.getSixth() == null;
        }

        @Override
        public int hashCode() {
            int result = tuple != null ? tuple.hashCode() : 0;
            result = 31 * result + (sixth != null ? sixth.hashCode() : 0);
            return result;
        }

        @Override
        public int compareTo(SixTuple<A, B, C, D, E, F> o) {
            int cmp = tuple.compareTo(o.getTuple());   // вот так сравнение с Generic<T>
            if (cmp != 0) {
                return cmp; // вернуть результат сравнения
            }
            return ((Comparable<F>) sixth).compareTo(o.getSixth()); // вернуть результат сравнения
        }

        @Override
        public String toString() {
            return "SixTuple{ " + getFirst() + " " + getSecond() + " " +
                    getThird() + " " + getFourth() + " " + getFifth() + " " +
                    getSixth() + " }";
        }

    }


    public static <A, B> TwoTuple<A, B> tuple(A a, B b) {
        return new TwoTuple<A, B>(a, b);
    }

    public static <A, B, C> ThreeTuple<A, B, C> tuple(A a, B b, C c) {
        return new ThreeTuple<>(a, b, c);
    }

    public static <A, B, C, D> FourTuple<A, B, C, D> tuple(A a, B b, C c, D d) {
        return new FourTuple<A, B, C, D>(a, b, c, d);
    }

    public static <A, B, C, D, E> FiveTuple<A, B, C, D, E> tuple(A a, B b, C c, D d, E e) {
        return new FiveTuple<A, B, C, D, E>(a, b, c, d, e);
    }

    public static <A, B, C, D, E, F> SixTuple<A, B, C, D, E, F> tuple(A a, B b, C c, D d, E e, F f) {
        return new SixTuple<A, B, C, D, E, F>(a, b, c, d, e, f);
    }

}
