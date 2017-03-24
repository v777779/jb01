package ch02.hw11;

/**
 * Created by V1 on 03-Feb-17.
 */
public class AllRbwColors {
   private int colorHue;
   private int colorSat;
   private int colorLum;


   void showColors() {
       System.out.printf("Color valueas are Hue:%d Sat:%d Lum:%d \n",colorHue,colorSat,colorLum);
   }


    public int getColorHue() {
        return colorHue;
    }

    public void setColorHue(int colorHue) {
        this.colorHue = colorHue;
    }

    public int getColorSat() {
        return colorSat;
    }

    public void setColorSat(int colorSat) {
        this.colorSat = colorSat;
    }

    public int getColorLum() {
        return colorLum;
    }

    public void setColorLum(int colorLum) {
        this.colorLum = colorLum;
    }
}
