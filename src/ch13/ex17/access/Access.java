package ch13.ex17.access;

import lib.utils.TextFile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {  //1 еще один комментарий
        System.out.println("\n====ACCESS===");          //2 строка вывода комментария
        System.out.println("\nExercise 17 RegEx InOut Check\n");  //3 строка вывода комментария

//        String regex = "(?m)(?s)(?x)(//(.*?)$)|/\\*(.*?)\\*\\/";// третье условие (?s) захватить \n в многострочники
//      (?m)    многострочный   обязательно
//      (?s)    захват \n конструкцией .*  для многострочников
//      (?x)    игнорирует все то после #  <"(?m)   # комментарии мои\n"> как <(?m)>
//      (//(.*?)$) группа  // **** \n  по минимуму
//      "/\\*(.*?)\\*\\/ #захват многострочников /*...*/ по минимуму\n";

        String fName = "src/ch13/ex17/access/Access.java";        // первое условие  чтение в файл
        String s = TextFile.read(fName);
        String regex = "(?m)(?s)(?x)(//(.*?)$)|/\\*(.*?)\\*\\/";
        String regex2 =
                        "(?m)            # многострочный режим \n" +
                        "(?s)            # первое условие   захват \n" +
                        "(?x)            # режим комментариев внутри regex \n" +
                        "(//(.*?)$)      # захват участков // ***$ по минимуму \n" +
                        "|" +
                        "/\\*(.*?)\\*\\/ #захват многострочников /*...*/ по минимуму\n";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        while (m.find()) {
            System.out.println(m.group());
        }
        System.out.println("=================================");
        JGrepFile.showDemo(fName, regex2);

    }

    /* групповой комментарий

          */


}
