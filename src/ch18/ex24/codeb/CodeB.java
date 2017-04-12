package ch18.ex24.codeb;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 11-Apr-17.
 */
public class CodeB {
    public static void app() {
        System.out.println("\n====CODE_B===");
        System.out.println("\nFileChannel as<Type> <type>Buffer Check\n");

        System.out.println("Conversion ByteBuffer to IntBuffer:");
        GetInt.check();
        System.out.println("\nRepresentation ByteBuffer as Primitives Types:");
        GetType.check();
    }
}
