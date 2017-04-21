package ch20.ex01.codeb;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 20-Apr-17.
 */
@SimulatingNull(id = 21, description = "description", count = 1L)
public class CodeB {

    //@SimulatingNull(id=21, count= 125L)
    public static void app() {
        System.out.println("\n====CODE_B===");
        System.out.println("\nAnnotation Elements Class Level Check\n");
// простая аннотация запись чтение на уровне класса
        SimulatingNull sn = CodeB.class.getAnnotation(SimulatingNull.class);
        System.out.println(sn.annotationType().getSimpleName()+":"+sn.id()+":"+sn.description()+":"+
                           sn.count()+":"+sn.value().getSimpleName());


    }
}
