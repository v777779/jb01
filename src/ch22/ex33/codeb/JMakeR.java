package ch22.ex33.codeb;

/**
 * Vadim Voronov
 * Created: 24-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class JMakeR {
    public static void main(String[] args) {
        try {
            Process p = new ProcessBuilder("cmd /c .\\src\\ch22\\ex33\\codeb\\jarpack\\jcmd2.cmd ".split(" ")).inheritIO().start(); // создать новый процесс
            Thread.sleep(1000);

            p = new ProcessBuilder("cmd /c .\\src\\ch22\\ex33\\codeb\\jarpack\\jcmd22.cmd ".split(" ")).inheritIO().start(); // создать новый процесс
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
