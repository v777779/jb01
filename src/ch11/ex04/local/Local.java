package ch11.ex04.local;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nGroup Elements Adding Check\n");

        CollectionAdd cc = new CollectionAdd();
        cc.checkAddCollection();
        cc.showCollection();

        cc.checkAddList();
        cc.showList();


    }
}
