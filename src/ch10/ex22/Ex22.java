package ch10.ex22;

import ch10.ex22.access.IHolder;

/**
 * Created by V1 on 16-Feb-17.
 */
public class Ex22 {
    public static void main(String[] args) {
        System.out.println("\nExercise 22 Nested Class Inside Interface Check\n");
        String s;
        IHolder hc = new IHolder.HolderControl();  // создали экземпляр
        IHolder.HolderControl.hControl(hc, IHolder.OpEnum.LOCK);  // передали экземпляр методу
        IHolder.HolderControl.hControl(hc, IHolder.OpEnum.UNLOCK);
        IHolder.HolderControl.hControl(hc, IHolder.OpEnum.SOUND);
        s = IHolder.HolderControl.hControl(hc, IHolder.OpEnum.STATUS);
        System.out.println(s);


    }
}
