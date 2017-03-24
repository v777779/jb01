package ch.ex42.access.func;

import ch.ex42.access.Ball;
import ch.ex42.access.Mill;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by V1 on 23.03.2017.
 */
public class FnClass {
    // накапливает результат обработки  возвращает <T>
    public static <T> T reduce(Iterable<T> seq, Combiner<T> combiner) {
        Iterator<T> it = seq.iterator();
        if (it.hasNext()) {
            T result = it.next(); // получить первый элемент

            while (it.hasNext()) { // все остальные тработать Combiner<T,T>
                result = combiner.combine(result, it.next()); // открутить все элементы друг с другом
            }
            return result; // один или результат обработки нескольких it.next()
        }
        return null; // пустая последовательность
    }

    // обрабатывает последовательность функцией возвращает Collector<T> внутри объекта накопитель
    public static <T> Collector<T> forEach(Iterable<T> seq, Collector<T> func) {

        for (T t : seq) {
            func.function(t); // обработать методом function все объекты
        }
        return func; // вернуть Collector<T> func внутри объекта может быть свой накопитель
    }

    // создать список обработанных результатов
    public static <R, T> List<R> transform(Iterable<T> seq, UnaryFunction<R, T> func) {

        List<R> listResult = new ArrayList<R>();
        for (T t : seq) {
            listResult.add(func.function(t)); // перебрать все результаты и обработку в список
        }
        return listResult;  // выгрузить список
    }

    // создать список отфильтрованных результатов
    public static <T> List<T> filter(Iterable<T> seq, UnaryPredicate<T> pred) {

        List<T> listResult = new ArrayList<T>();
        for (T t : seq) {
            if (pred.test(t)) {
                listResult.add(t); // перебрать все результаты
            }
        }
        return listResult;  // выгрузить список
    }

    // реализация Ball
    // операция сложения
   public static class BallAdder implements Combiner<Ball> {
        @Override
        public Ball combine(Ball x, Ball y) {
            return new Ball(x.get() + y.get());
        }
    }

    // операция вычитания
    public static class BallSubtracter implements Combiner<Ball> {
        @Override
        public Ball combine(Ball x, Ball y) {
            return new Ball(x.get() - y.get());
        }
    }

     // операция сравнения  >
    public static class GreaterThan <T extends Comparable<T>> implements UnaryPredicate<T> {
        private T bound;

        public GreaterThan(T bound) {
            this.bound = bound;
        }

        @Override
        public boolean test(T x) {
            return x.compareTo(bound) > 0; // сравнение дает число [-1 0 +1] и результат > 0 дает true or false
        }
    }

    // операция умножения
    public static class MultBallCollector implements  Collector<Ball>{  // обработчик с накопителем результата
        private Ball ball = new Ball(1);

        @Override
        public Ball function(Ball x) {  // UnaryFunction<T>
            ball.set( ball.get()*x.get());
            return new Ball(ball.get());
        }
        @Override
        public Ball result() { // Collector<T>
            return new Ball(ball.get());
        }
    }
    public static class IncBall implements  UnaryFunction<Ball,Ball>{  // обработчик с накопителем результата
        @Override
        public Ball function(Ball x) {
            return new Ball(x.get()+1);
        }
    }


    // реализация Mill
    // операция сложения
    public static class MillAdder implements Combiner<Mill> {
        @Override
        public Mill combine(Mill x, Mill y) {
            return new Mill(x.get() + y.get());
        }
    }

    // операция вычитания
    public static class MillSubtracter implements Combiner<Mill> {
        @Override
        public Mill combine(Mill x, Mill y) {
            return new Mill(x.get() - y.get());
        }
    }

     // операция умножения
    public static class MultMillCollector implements  Collector<Mill>{  // обработчик с накопителем результата
        private Mill ball = new Mill(1);

        @Override
        public Mill function(Mill x) {  // UnaryFunction<T>
            ball.set( ball.get()*x.get());
            return new Mill(ball.get());
        }
        @Override
        public Mill result() { // Collector<T>
            return new Mill(ball.get());
        }
    }

}
