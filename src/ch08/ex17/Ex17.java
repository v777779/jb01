package ch08.ex17;

import ch08.ex17.access.Starship;
import ch08.ex17.local.FieldMouse;
import ch08.ex17.local.Rodent;
import ch08.ex17.office.Stage;

/**
 * Created by V1 on 10-Feb-17.
 */
public class Ex17 {
    public static void main(String[] args) {
        System.out.println("\nCovariants Check\n");
        System.out.println("\nFieldMouse\n");
        Rodent rodent = new FieldMouse();
        System.out.println("\nRodent");
        Rodent rodent2 = new Rodent();
        System.out.println("\ngetMaterial.FieldMouse");
        rodent.getMaterial();
        System.out.print("\ngetMaterial.Rodent");
        rodent2.getMaterial();

        System.out.println("\nInheritance Check\n");

        Stage stage = new Stage();
        stage.performPlay();
        stage.change();
        stage.performPlay();

        System.out.println("\nExercise 17  Composition Check\n");
        Starship starship = new Starship();
        starship.getStatus();
        starship.changeStatus();
        starship.getStatus();




    }

}
