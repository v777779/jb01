package ch12.ex10.chain;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Chain {
    public static void app() {
        System.out.println("\n====CHAIN===");
        System.out.println("\nException Chain Check\n");

        DynamicFields df = new DynamicFields(3); // создали массив на 3 поля

        try {
            df.setField("d_key ", "d_value");  // требует try для DynamicFieldsException
            df.setField("number", 12);
            df.setField("object", 15);
            System.out.println(df);
            df.setField("d_key", "d_newValue");
            df.setField("clause", 12.745); // double новый элемент массива
            System.out.println("   df    \n---------\n" + df);
            System.out.println("df.getField(): " + df.getField("d_key"));
            System.out.println("DynamicFiledsException generation :");
            System.out.println("-----------------------------------");
            Object field = df.setField("object", null); // генерим DynamicFieldsException

        } catch (DynamicFieldsException e) {
            System.out.println("catch: dynamic called");
            e.printStackTrace(System.out);


        } catch (NoSuchFieldException e) {
            System.out.println("catch: nofield called");
            e.printStackTrace(System.out);
        }

    }
}
