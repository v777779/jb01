package ch15.ex11.local;

import lib.pets.*;

import java.util.*;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    public static Map<Person,List<?extends Pet>> f(Map<Person,List<?extends Pet>> m) {
        return m;
    }

    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nGeneric Auto Detect Check\n");
// ускорение с autodetect
        Map<String,Integer> map = New.map();
        Map<Person, List<?extends Pet>> map2 = New.map();
        List<Double> list = New.list();
        Set<String> set = New.set();
        Queue<Integer> queue = New.queue();

// по умолчанию уже работает справа ничего писать не нужно
        Map<String,Integer> hmap = new HashMap<>();
        Map<Person, List<?extends Pet>> hmap2 = new HashMap<>();
        List<Double> alist = new ArrayList<>();
        Set<String> hset = new HashSet<>();
        Queue<Integer> queue2 = new LinkedList<>();
// вызов расширения как результата работы метода
        Map<Person,List<?extends Pet>> fmap = f(New.map());  // все работает
        fmap.put(new Person("Katty"),new ArrayList<>(Arrays.asList(new Pug(), new Mutt())));
        fmap.put(new Person("Jimmy"),new ArrayList<>(Arrays.asList(new Mouse(), new Hamster())));
        fmap.put(new Person("Teddy"),new ArrayList<>(Arrays.asList(new Cymr())));
        System.out.println(fmap);

// вызов расширения как результата работы метода
        Map<Person,List<?extends Pet>> nmap = f(new HashMap<>());  // по умолчанию
        nmap.put(new Person("Lizzy"),new ArrayList<>(Arrays.asList(new Pug(), new Mutt())));
        nmap.put(new Person("Sophie"),new ArrayList<>(Arrays.asList(new Hamster())));
        nmap.put(new Person("Mikle"),new ArrayList<>(Arrays.asList(new Manx())));
        System.out.println(nmap);


    }
}
