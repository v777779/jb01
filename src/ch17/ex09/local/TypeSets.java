package ch17.ex09.local;

import java.util.Set;

/**
 * Created by V1 on 28-Mar-17.
 */
public class TypeSets {
    public static <T> Set<T> fill(Set<T> set,Class<T> type) {  // <T> это типы семейства SetType{}
        try {
            for (int i = 0; i < 10; i++) {
                set.add(type.getConstructor(int.class).newInstance(i));  // создается методом Reflection
            }

        } catch (Exception e) {
            throw new RuntimeException();
        }

        return set;  // набор Set<> с типом объекта SetType, HashType или TreeType
    }

    public static <T> void check(Set<T> set,Class<T> type) {  // <T> это типы семейства SetType{}
        fill(set,type);  // одно и то же несколько раз
        fill(set,type);
        fill(set,type);
        System.out.println(set);
    }

    public static void check(Set<SetType> set) {  // <T> это типы семейства SetType{}
        System.out.println("Set<SetType> Check "+set.getClass().getSimpleName()+":");
        fill(set);  // одно и то же несколько раз
        fill(set);
        fill(set);
        System.out.println(set);
    }

    public static void checkHash(Set<HashType> set) {  // <T> это типы семейства SetType{}
        System.out.println("Set<HashType> Check "+set.getClass().getSimpleName()+":");
        fillHash(set);  // одно и то же несколько раз
        fillHash(set);
        fillHash(set);
        System.out.println(set);
    }

    public static void checkTree(Set<TreeType> set) {  // <T> это типы семейства SetType{}
        System.out.println("Set<TreeType> Check "+set.getClass().getSimpleName()+":");
        fillTree(set);  // одно и то же несколько раз
        fillTree(set);
        fillTree(set);
        System.out.println(set);
    }

    public static Set<SetType> fill(Set<SetType> set) {  // <T> это типы семейства SetType{}
        for (int i = 0; i < 10; i++) {
            set.add(new SetType(i));  // создается напрямую
        }
        return set;                         // набор Set<SetType>
    }

    public static Set<HashType> fillHash(Set<HashType> set) {  // <T> это типы семейства SetType{}
            for (int i = 0; i < 10; i++) {
                set.add(new HashType(i));  // создается напрямую
            }
        return set;                         // набор Set<HashType>
    }

    public static Set<TreeType> fillTree(Set<TreeType> set) {  // <T> это типы семейства SetType{}
        for (int i = 0; i < 10; i++) {
            set.add(new TreeType(i));  // создается напрямую
        }
        return set;                     // набор Set<TreeType>
    }

}
