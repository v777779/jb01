package hw.vpex.thread;

/**
 * Vadim Voronov
 * Created: 15-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class MainCmd {
//    private static void inheritIO3(final InputStream src, final PrintStream dest) {
//        new Thread(new Runnable() {
//            public void run() {
//                Scanner sc = new Scanner(src);
//                while (sc.hasNextLine()) {
//                    dest.println(sc.nextLine());
//                }
//            }
//        }).start();
//    }
//
//    public static void check() throws Exception {
//
//
////        Process p = Runtime.getRuntime().exec("cmd /c  pause");
////        inheritIO(p.getInputStream(), System.out);
////        inheritIO(p.getErrorStream(), System.err);
//
//
////        OSExecute.command("cmd /c dir");
//        boolean err;
//        try {
//            ProcessBuilder process = new ProcessBuilder("cmd /c dir && echo start pause && pause ".split(" ")); // создать новый процесс
//            Process p = process.inheritIO().start();
//            p.waitFor();
//
////            BufferedReader results = new BufferedReader(
////                    new InputStreamReader(process.getInputStream()));
////            String s;
////            while ((s = results.readLine()) != null) {  // данные с процесса выводить на консоль out
////                System.out.println(s);
////            }
////            BufferedReader errors = new BufferedReader(
////                    new InputStreamReader(process.getErrorStream()));
////            while ((s = results.readLine()) != null) {  // данные с процесса выводить на консоль error
////                System.err.println(s);  //
////                err = true;
////            }
//        } catch (Exception e) {
////            if (command.toLowerCase().startsWith("cmd /c")) {
////                command("cmd /c " + command);
////            } else {
////                throw new RuntimeException(e);
////            e.printStackTrace();
//            System.out.println("wrong command");
////            }
//        }
//    }
//
//    public static void check2() throws Exception {
//
//        Process p1 = new ProcessBuilder("javac MainCmdInput.java".split(" ")).inheritIO().start(); // создать новый процесс
//        p1 = new ProcessBuilder("java MainCmdInput".split(" ")).inheritIO().start(); // создать новый процесс
//        //p1 = new ProcessBuilder("cmd /c dir".split(" ")).inheritIO().start(); // создать новый процесс
//
//        try {
//// без ожидания ввода
//            Process p = new ProcessBuilder("cmd /c dir && echo command ".split(" ")).inheritIO().start(); // создать новый процесс
//
//// с ожиданием ввода 2sec
//            p = new ProcessBuilder("cmd /c dir && echo command && pause ".split(" ")).inheritIO().start(); // создать новый процесс
//            p.waitFor(2000, TimeUnit.MILLISECONDS);
//
//// с ожиданием ввода
//            p = new ProcessBuilder("cmd /c ping localhost && pause ".split(" ")).inheritIO().start(); // создать новый процесс
//            p.waitFor();  // если нужно ожидать ввода
//
////            Process p1 = new ProcessBuilder("javac MainCmdInput.java".split(" ")).inheritIO().start(); // создать новый процесс
////            p1 = new ProcessBuilder("java MainCmdInput".split(" ")).inheritIO().start(); // создать новый процесс
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
////**********

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
