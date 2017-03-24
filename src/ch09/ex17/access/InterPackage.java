package ch09.ex17.access;

import java.util.Random;

/**
 * Created by V1 on 14-Feb-17.
 */
public interface InterPackage {
    int VALUE_PKG = 15;
    int INTERFACE_ID = GenClass.genValue();  // только одно значение на интерфейс всего один раз за запуск программы
    int VALUE_RND = (new Random()).nextInt(100);



}
