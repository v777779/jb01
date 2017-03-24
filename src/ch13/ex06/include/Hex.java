package ch13.ex06.include;

/**
 * Created by V1 on 06-Mar-17.
 */
public class Hex {

    public static String format(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sc = new StringBuilder(); // for symbols part
        int n = 0; // счетчик byte
        for (byte b : bytes) {
            if (n % 16 == 0) {  // работает c b=0
                sb.append(String.format("%05X:", n));  // n counter in hex
                sc.delete(0, sc.length()); // очищаем
            }
            sb.append(String.format(" %02X", b));
            if (b > 0x10)
                sc.append(String.format("%c", (char) b));
            else
                sc.append(".");

            n++;
            if (n % 16 == 0) {  // работает начиная с b=16
                sb.append(" | ");
                sb.append(sc.toString());
                sb.append("\n");
            }
        }

        if(sc.length() < 16) {  // полностью все отработано
            int subLen = (16 - sc.length())*3; // длина остатка в пробелах
            String fmt = "%-" + subLen + "s | %s\n"; // строка форматирования
            sb.append(String.format(fmt, " ", sc.toString()));
        }
        return sb.toString();
    }


}
