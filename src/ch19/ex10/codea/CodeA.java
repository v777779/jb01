package ch19.ex10.codea;

import ch19.ex10.codea.vm.Category;
import ch19.ex10.codea.vm.Input;
import ch19.ex10.codea.vm.VendingMachine;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 19-Apr-17.
 */
public class CodeA {
    public static void app() {
        System.out.println("\n====CODE_A===");
        System.out.println("\nFSM Check\n");

        System.out.println(Category.categorize(Input.DIME));
        System.out.println(Category.categorize(Input.NICKEL));
        System.out.println(Category.categorize(Input.SOAP));

        System.out.println("\nStart Vending Machine:");
        String fileName = "./src/ch19/ex10/codea/InputData.txt";

        VendingMachine.check(fileName);

    }
}
