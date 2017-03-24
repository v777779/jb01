package ch.ex14;

/**
 * Created by V1 on 04-Feb-17.
 */
public class Ex14 {

    static String  strComp(String s1, String s2) {
        String s = "\nComparison  "+s1+ " <> "+s2+"\n";
        boolean eq, eq2;
        boolean gr;
        boolean ls;

         eq  = s1.equals(s2);
         eq2 = (s1.compareTo(s2)==0);
         gr  = (s1.compareTo(s2) > 0);
         ls = (s1.compareTo(s2)) < 0;

        s += "\ns1 == s2 >  "+(eq);
        s += "\ns1 == s2 >  "+(eq2);
        s += "\ns1 != s2 >  "+(!eq);
        s += "\ns1 != s2 >  "+(!eq2);
        s += "\ns1 >  s2 >  "+(gr);
        s += "\ns1 <  s2 >  "+(ls);

        return s;
    }

    public static void main(String[] args) {
        int a = (short)(int)(new Integer(2));
//        short c = a;            // не работает
//              c = (short)a;     // работает
//        int b = c;              // работает
       float f1 = 0.25F;
       float f2 = 0.75F;
       int i1 = (int)f1;
       int i2 = (int)f2;

        System.out.println("f1="+f1+" i1="+i1+" f2="+f2+" i2="+i2);

        System.out.println("Exercise 14");
        System.out.println(strComp("xab1234","wqhappy"));
        System.out.println(strComp("happy","happy"));
        String s3 = "bekki";
        String s4 = s3;
        System.out.println(strComp(s3,s4));

    }
}
