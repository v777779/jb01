package ch22.ex36.codeb;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 25-May-17.
 */
public class CodeB {
    public static void main(String[] args) {
        app();
    }

    public static void app() {
        System.out.println("\n====CODE_B===");
        System.out.println("\nJava Bean and Form GUI Check\n");
        BangBean3.check();
        JFrameGUI.check();

        try {
            Process p = new ProcessBuilder("cmd /c .\\src\\ch22\\ex36\\codeb\\jarc.cmd".split(" ")).inheritIO().start(); // создать новый процесс
            p.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
