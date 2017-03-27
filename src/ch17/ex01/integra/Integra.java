package ch17.ex01.integra;

import lib.generate.GenRnd;
import lib.generate.GenSeq;
import lib.utils.MapData;

import java.util.Map;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Integra {
    public static void app() {
        System.out.println("\n====INTEGRA===");
        System.out.println("\nGenerator w Map Check\n");

        System.out.println("MapData IGenerator<Pairs<K,V>:");
        Map<Integer,String> aMap = new MapData<Integer, String>(new Letters(),11);
        System.out.println(aMap);

        System.out.println("\nMapData IGenerator<Char>, IGenerator<String>:");
        Map<Character,String> bMap = new MapData<>(new GenSeq.GenChar(), new GenRnd.GenStr(3),11);
        System.out.println(bMap);

        System.out.println("\nMapData IGenerator<Char>, Value<String>:");
        Map<Character,String> cMap = new MapData<>(new GenSeq.GenChar(), "Value",6);
        System.out.println(cMap);


        System.out.println("\nMapData Iterable<Integer>, IGenerator<String>:");
        Map<Integer,String> dMap = new MapData<>(new Letters(), new GenRnd.GenStr(3));  // итератор на 8 значений
        System.out.println(dMap);

        System.out.println("\nMapData Iterable<Integer>, Value<String>:");
        Map<Integer,String> eMap = new MapData<>(new Letters(), "Value");  // итератор на 8 значений
        System.out.println(eMap);


        System.out.println("\nStatic Methods Demo:");

        System.out.println("\nMapData IGenerator<Pairs<K,V>:");
        Map<Integer,String> fMap = MapData.get(new Letters(),11);
        System.out.println(fMap);

        System.out.println("\nMapData IGenerator<Char>, IGenerator<String>:");
        Map<Character,String> gMap = MapData.get(new GenSeq.GenChar(), new GenRnd.GenStr(3),11);
        System.out.println(gMap);

        System.out.println("\nMapData IGenerator<Char>, Value<String>:");
        Map<Character,String> hMap = MapData.get(new GenSeq.GenChar(), "Value",6);  // сгенерить методом
        System.out.println(hMap);

        System.out.println("\nMapData Iterable<Integer>, IGenerator<String>:");
        Map<Integer,String> iMap = MapData.get(new Letters(), new GenRnd.GenStr(3));  // итератор на 8 значений
        System.out.println(iMap);

        System.out.println("\nMapData Iterable<Integer>, Value<String>:");
        Map<Integer,String> kMap = MapData.get(new Letters(), "Value");  // итератор на 8 значений
        System.out.println(kMap);


    }
}
