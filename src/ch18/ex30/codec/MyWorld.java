package ch18.ex30.codec;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 16-Apr-17.
 */
public class MyWorld {
    public static void check() {
        House house = new House();
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Bosco dog",house));
        animals.add(new Animal("Ralph hamster",house));
        animals.add(new Animal("Molly cat",house));

        System.out.println("animals:"+animals);

        try {

            System.out.println("\nSerialiaze list to stream 1:");
            ByteArrayOutputStream bOut = new ByteArrayOutputStream();
            ObjectOutputStream sOut = new ObjectOutputStream(bOut);
            sOut.writeObject(animals); // сохранить список объектов ссылающихся на House
            sOut.writeObject(animals); // сохранить повторно список объектов

            System.out.println("Serialiaze list to stream 2:");
            ByteArrayOutputStream bOut2 = new ByteArrayOutputStream();
            ObjectOutputStream sOut2 = new ObjectOutputStream(bOut2);
            sOut2.writeObject(animals); // сохранить список объектов ссылающихся на House

            System.out.println("DeSerialiaze list from stream 1:");

            ObjectInputStream sIn = new ObjectInputStream(new ByteArrayInputStream(bOut.toByteArray()));
            List<Animal> animals1 = (List<Animal>)sIn.readObject(); // восстановить список объектов ссылающихся на House
            List<Animal> animals2 = (List<Animal>)sIn.readObject(); // восстановить список объектов ссылающихся на House

            System.out.println("DeSerialiaze list from stream 2:");
            ObjectInputStream sIn2= new ObjectInputStream(new ByteArrayInputStream(bOut2.toByteArray()));
            List<Animal> animals3 = (List<Animal>)sIn2.readObject(); // восстановить список объектов ссылающихся на House

            System.out.println("\nResults of deSerialization:");
            System.out.println("animals1:"+animals1);
            System.out.println("animals2:"+animals2);
            System.out.println("animals3:"+animals3);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
