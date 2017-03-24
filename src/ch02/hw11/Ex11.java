package ch02.hw11;

/**
 * Created by V1 on 03-Feb-17.
 */
public class Ex11 {
    public static void main(String[] args) {
        AllRbwColors aColors = new AllRbwColors();

        aColors.showColors();
        aColors.setColorHue(11);
        aColors.setColorSat(185);
        aColors.setColorLum(211);
        aColors.showColors();
    }
}
