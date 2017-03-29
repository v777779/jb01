package ch17.ex10.access;

import lib.ball.Ball;
import lib.ball.GenRnd;
import lib.generate.Gen;
import lib.utils.Range;

import java.util.*;

/**
 * Created by V1 on 29-Mar-17.
 */
public class CheckSorted {
    public static void app() {
        List<String> list = new ArrayList(Arrays.asList("one two three four five six seven eight".split(" ")));
        System.out.println(list);

        SortedList sl = new SortedList(list);
        System.out.println(sl);
        String low = sl.first();
        String high = sl.last();
        System.out.println(low);
        System.out.println(high);
        Iterator<String> it = sl.iterator();
        for (int i = 0; i < sl.size(); i++) {
            String s = it.next();
            if (i == 3) {
                low = s;
            }
            if (i == 7) {
                high = s;
            }
        }
        System.out.println(low);
        System.out.println(high);

        SortedList sb = sl.subSet(low, high);
        SortedList sb2 = sl.headSet(high);
        SortedList sb3 = sl.tailSet(low);
        System.out.println(sb);
        System.out.println(sb2);
        System.out.println(sb3);

    }

    public static void app2() {
        List<String> list = new ArrayList(Arrays.asList("one two three four five six seven eight".split(" ")));
        SortedLinked<String> st = new SortedLinked(list);
        System.out.println("\napp2():");
        System.out.println(list);

//        public SortedLinked<T> subSet(T fromElement, T toElement) {
        System.out.println("subSet :"+st.subSet("three","six"));
//        public SortedLinked<T> headSet(T toElement) {
        System.out.println("headSet:"+st.headSet("six"));
//        public SortedLinked<T> tailSet(T fromElement) {
        System.out.println("tailSet:"+st.tailSet("six"));
//        public T first() {
        System.out.println("first()    :"+st.first());
//        public T last() {
        System.out.println("last()     :"+st.last());
//        public int size() {
        System.out.println("size()     :"+st.size());
//        public boolean isEmpty() {
        System.out.println("isEmpty()  :"+st.isEmpty());
//        public boolean contains(Object o) {
        System.out.println("conatins() :"+st.contains("four"));
//        public Iterator<T> iterator() {
        System.out.print("iterator     :");
        for (String s : st) {
            System.out.print("it:"+s+" ");
        }
        System.out.println();
//        public Object[] toArray() {
        Object[] objects = st.toArray();
        System.out.println("toArray Obj[]:"+Arrays.toString(objects));
//        public <T1> T1[] toArray(T1[] a) {
        String[] strings = st.toArray(new String[0]);
        System.out.println("toArray T[]  :"+Arrays.toString(strings));
//        public boolean add(T t) {
        st.add("eleven");
        System.out.println("add()        :"+st);
//        public boolean remove(Object o) {
        st.remove("five");
        System.out.println("remove()     :"+st);
//        public boolean containsAll(Collection<?> c) {
        List<String> sList = new ArrayList<>(list.subList(3,6));
        System.out.println("conatinsAll():"+st.containsAll(sList));
//        public boolean addAll(Collection<? extends T> c) {
        List<String> bList = new ArrayList<>(Arrays.asList("the", "number","phone", "duty", "call"));
        st.addAll(bList);
        System.out.println("addAll()     :"+st);
//        public boolean retainAll(Collection<?> c) {
        st.retainAll(bList);
        System.out.println("retainAll()  :"+st);
//        public boolean removeAll(Collection<?> c) {
        st.removeAll(bList);
        System.out.println("removeAll()  :"+st);
//        public void clear() {
        st.addAll(sList);
        System.out.println("addAll()     :"+st);
        st.clear();
        System.out.println("clear()      :"+st);

        System.out.println("sort()       :");

        List<String> cList = new ArrayList<>(list);
        System.out.println(cList);
        Collections.sort(cList,st.comparator());
        System.out.println(cList);


        List<Ball> list2 = new ArrayList(Arrays.asList(Gen.getArray(Ball.class, new GenRnd(),10)));
        SortedLinked<Ball> stb = new SortedLinked<>(list2);
        Collections.sort(list2, stb.comparator());
        System.out.println(list2);

        List<Double> dList = Range.rangeDoubleList(10);
        SortedLinked<Double> stDouble = new SortedLinked<>(dList);
        System.out.println(dList);
        Collections.sort(dList, stDouble.comparator());
        System.out.println(dList);



    }

}
