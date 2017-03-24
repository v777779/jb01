//: net/mindview/util/MapData.java
// A Map filled with data using a generator object.
package ch15.ex40.access.pets;

import lib.pets.Pair;
import lib.utils.IGenerator;

import java.util.LinkedHashMap;

public class MapData<K,V> extends LinkedHashMap<K,V> {
  // A single Pair IGenerator:
  public MapData(IGenerator<lib.pets.Pair<K,V>> gen, int quantity) {
    for(int i = 0; i < quantity; i++) {
      lib.pets.Pair<K,V> p = gen.next();
      put(p.key, p.value);
    }
  }
  // Two separate Gens:
  public MapData(IGenerator<K> genK, IGenerator<V> genV,
                 int quantity) {
    for(int i = 0; i < quantity; i++) {
      put(genK.next(), genV.next());
    }
  }
  // A key IGenerator and a single value:
  public MapData(IGenerator<K> genK, V value, int quantity){
    for(int i = 0; i < quantity; i++) {
      put(genK.next(), value);
    }
  }
  // An Iterable and a value IGenerator:
  public MapData(Iterable<K> genK, IGenerator<V> genV) {
    for(K key : genK) {
      put(key, genV.next());
    }
  }
  // An Iterable and a single value:
  public MapData(Iterable<K> genK, V value) {
    for(K key : genK) {
      put(key, value);
    }
  }
  // Generic convenience methods:
  public static <K,V> MapData<K,V>
  map(IGenerator<Pair<K,V>> gen, int quantity) {
    return new MapData<K,V>(gen, quantity);
  }
  public static <K,V> MapData<K,V>
  map(IGenerator<K> genK, IGenerator<V> genV, int quantity) {
    return new MapData<K,V>(genK, genV, quantity);
  }
  public static <K,V> MapData<K,V>
  map(IGenerator<K> genK, V value, int quantity) {
    return new MapData<K,V>(genK, value, quantity);
  }
  public static <K,V> MapData<K,V>
  map(Iterable<K> genK, IGenerator<V> genV) {
    return new MapData<K,V>(genK, genV);
  }
  public static <K,V> MapData<K,V>
  map(Iterable<K> genK, V value) {
    return new MapData<K,V>(genK, value);
  }
} ///:~
