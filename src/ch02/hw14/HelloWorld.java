package ch02.hw14;
/**
 * Created by V1 on 02-Feb-17.
 */

import ch02.ex6.HelloDate;

import java.util.Date;

/** HelloWorld  comment for Class HelloWorld
 *
 * <br> <br>
 * You can add <em> add HTML list </em> into comment:
 * <ol>
 * <li> First item
 * <li> Second item
 * <li> Third item
 * </ol>  <br><br>
 *
 * <pre>
 *  System.out.println(new Date()); example of command description
 *  This is preformatted block of ex7
 *  You can write as ordinary ex7 and place here
 * </pre>
 * @version 1.223/254
 * @author V1
 * @author  Added comment for author company
 * */
public class HelloWorld {
/** iClass comment I to static variable i */
public  static int iClass;

/** mClass comment M to variable m
 * @since 1.223/001
 * */
    protected   int mClass;

/** nClass comment N to variable n */
private static int nclass;

    /** pClass comment P default to variable p */
    int pClass;

    /**
     *  Hello World constructor  description
     * @param mClass  description for mClass
     * @param pClass  description for pClass
     */
    public HelloWorld(int mClass, int pClass) {
        this.mClass = mClass;
        this.pClass = pClass;
    }

    /** @param  iVoice comment I to method voice()
     *  @param  kVoice comment K to method voice
     *  @return int    comment for return value
     *
     *  @see  HelloDate HelloDate class comment SeeAlso
     *
     *  @deprecated method deprecated comment
     */

    public static int voice(int iVoice, int kVoice) {
        System.out.println(iVoice+" "+kVoice);
        return  iVoice+kVoice;
    }
/** @param  iShow comment I to method show */
    public void show(int iShow) {
        System.out.println(iShow);
    }

/** @param  args comment to args for method main()
  * @throws Exception  comment to exception from method main() */
    public static void main(String[] args) throws Exception {
        int i;
        System.out.println("Привет, сегодня: ");
        System.out.println(new Date());
    }


}


