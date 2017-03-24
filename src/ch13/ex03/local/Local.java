package ch13.ex03.local;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Map;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nString Functions Check\n");
        String s =  "Test Ваш string functions";
//getChars
        char [] chs = new char[10];
        s.getChars(2,4,chs,5);
        System.out.println(Arrays.toString(chs));
//getBytes()
        byte[] bchs = s.getBytes();  // по умолчанию в "UTF-8"
        System.out.println(Arrays.toString(bchs));
//        Charset cs = Charset.forName("windows-1251");
        Map<String,Charset> m = Charset.availableCharsets();
        Charset cs = m.get("windows-1251");
        byte[] b2chs = s.getBytes(cs);  // по умолчанию в "UTF-8"
        System.out.println(Arrays.toString(b2chs));

        try {
            byte[] ubchs =  s.getBytes("UTF-8");
            System.out.println(Arrays.toString(ubchs));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
//contains()
        System.out.println("conatins()      :"+s.contains("est"));
//contentEquals
        System.out.println("contetnEquals() :"+s.contentEquals("Test Ваш string functions"));
//regionsMatches
        String s2 = "string functions Test Ваш";
        System.out.println("regionMatches() :"+s.regionMatches(true, 17, s2,8,8));
//startsWith()
        System.out.println("starttWith()    :"+s.startsWith("Test"));   // начало строки
//endWith()
        System.out.println("endWith()       :"+s.endsWith("ions"));     // начало строки
//indexOf()
        System.out.println("indexOf()       :"+s.indexOf('t'));         // первое вхождение
//lastIndexOf()
        System.out.println("lastindexOf()   :"+s.lastIndexOf('t'));  // последнее вхождение
//substring()
        System.out.println("substring()     :"+s.substring(5,9));
//subSequence()
        System.out.println("subSequence()   :"+s.subSequence(5,9));
//concat()
        System.out.println("concat()        :"+s.concat(" + subSequence"));
//replace()
        System.out.println("replace()       :"+s.replace("Ваш","your"));
//toLowerCase()
        System.out.println("toLowerCase()   :"+s.toLowerCase());
//toUpperCase()
        System.out.println("toUpperCase()   :"+s.toUpperCase());
//trim()
        System.out.println("trim()          :"+(" . "+s+ " : ").trim());
//valueOf()
        System.out.println("valueOf()       :"+ String.valueOf(true)+" "+String.valueOf(15));
//intern()
String s4  = new String(s);
String s6  = s4.intern();
        System.out.println("intern()  s=s4   :"+ (s == s4));
        System.out.println("intern()  s=s6   :"+ (s == s6)); // уникальная ссылка s
        System.out.println("intern()  s4=s6  :"+ (s4 == s6)); // s4 не уникальная строка, копия
    }
}
