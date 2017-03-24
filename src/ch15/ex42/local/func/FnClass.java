package ch15.ex42.local.func;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

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

    // реализация
    // операция сложения
   public static class IntegerAdder implements Combiner<Integer> {
        @Override
        public Integer combine(Integer x, Integer y) {
            return x + y;
        }
    }

    // операция вычитания
    public static class IntegerSubtracter implements Combiner<Integer> {
        @Override
        public Integer combine(Integer x, Integer y) {
            return x - y;
        }
    }

    // операция сложения
    public static class BigDecimalAdder implements Combiner<BigDecimal> {
        @Override
        public BigDecimal combine(BigDecimal x, BigDecimal y) {
            return x.add(y);
        }
    }

    // операция сложения
    public static class BigIntegerAdder implements Combiner<BigInteger> {
        @Override
        public BigInteger combine(BigInteger x, BigInteger y) {
            return x.add(y);
        }
    }

    // операция сложения
    public static class AtomicLongAdder implements Combiner<AtomicLong> {
        @Override
        public AtomicLong combine(AtomicLong x, AtomicLong y) {
            return new AtomicLong(x.addAndGet(y.get()));
        }
    }

    // операция ULP
    public static class BigDecimalUlp implements UnaryFunction<BigDecimal,BigDecimal> {
        @Override
        public BigDecimal function(BigDecimal x) {
            return x.ulp();
        }
    }

    // операция сравнения  >
    public static class GreaterThan <T extends Comparable<T>> implements UnaryPredicate<T>{
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
    public static class MulIntCollector implements  Collector<Integer>{  // обработчик с накопителем результата
        private Integer value = 1;

        @Override
        public Integer function(Integer x) {  // UnaryFunction<T>
            value *= x;
            return value;
        }
        @Override
        public Integer result() { // Collector<T>
            return value;
        }
    }

}
