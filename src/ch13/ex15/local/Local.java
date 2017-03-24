package ch13.ex15.local;

import lib.utils.TextFile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nReplacement Check\n");

/*!     Here's a block of text to use as input to
   the regular expression matcher. Note   that we'll
      first extract   the block of text by looking for
  the special delimiters, then   process
    the extracted block. !*/
        String s = TextFile.read("src/ch13.ex15/local/Local.java"); // читаем текущий файл
        String regex = "/\\*!(.*)!\\*/";  //   </ *!  (любые символы много) !* />
        Pattern p = Pattern.compile(regex, Pattern.DOTALL); // DOTALL  значит что . включает и \n
        Matcher m = p.matcher(s);
        if (m.find()) {  // нашли строку
            s = m.group(1); // выбираем только то что в группе (.*) то есть не содержит / *! и !* /
            s= s.replaceAll(" {2,}"," ");           // заменить два и более пробелов на " "
            s=s.replaceAll("(?m)^ +","");           // остались только одиночные пробелы
            System.out.println(s);                  // все пробелы с начала любой строки
            s = s.replaceFirst("[aeiou]","(VOWEL1)");

            StringBuffer sb = new StringBuffer();
            Pattern p2 = Pattern.compile("[aeiou]");// ищем все гласные
            Matcher m2 = p2.matcher(s);             //

            while (m2.find()) {  // ищем все гласные строчные
                m2.appendReplacement(sb,m2.group().toUpperCase());
            }
            m2.appendTail(sb); // отрабатываем конец строки
            System.out.println(sb.toString());
/*
//visual test version
            int k = 0;
            while (m2.find()) {  // ищем все гласные строчные
                System.out.println(m2.group());
                System.out.println(sb);
                m2.appendReplacement(sb,m2.group().toUpperCase());
                System.out.println(sb);
                if(k++==10)
                    break;
            }
            // m2.appendTail(sb); // отрабатываем конец строки
            System.out.println(sb.toString());
*/
        }
    }
}
