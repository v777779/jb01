package ch13.ex01.include;

/**
 * Created by V1 on 04-Mar-17.
 */
public class WithString {
    public String implicit(String[] fields ) {
        String s = "";
        for (String field : fields) {  // отрабатываем массив в одну строку
            s += field+":";                 // через оператор +
        }
        return s;
    }
    public String explicit(String[] fields) {   // явная отработка через StringBuilder
        StringBuilder sb = new StringBuilder();
        for (String field : fields) {
            sb.append(field);
            sb.append(".");

        }
        return sb.toString();  //
    }

}
