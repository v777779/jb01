package lib.system;

/**
 * Vadim Voronov
 * Created: 15-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class CmdExec {

    public static void main(String[] args) {
        try {
            Process p = new ProcessBuilder("cmd /c dir && echo text command ".split(" ")).inheritIO().start(); // создать новый процесс

            p = new ProcessBuilder("cmd /c ping localhost && pause ".split(" ")).inheritIO().start(); // создать новый процесс
//          p.waitFor(2000, TimeUnit.MILLISECONDS);  ожидание ограниченного времени
            p.waitFor();  // если нужно ожидать ввода
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
