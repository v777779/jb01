package ch06.ex7;

import ch06.ex7.access.Widget;
import ch06.ex7.lib.Call;

/**
 * Created by V1 on 07-Feb-17.
 */
public class Ex7 {
    public static void main(String[] args) {
        Call call = new Call();
        call.showAll();
        System.out.println("call.i = " + call.i);
        System.out.println("\nExercise 7 Check Widget Access\n");
        Widget widget = new Widget();
        widget.show();
    }
}
