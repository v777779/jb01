package ch.ex4;

import java.util.Random;

/**
 * Created by V1 on 04-Feb-17.
 */
public class Ex4 {
    public static void main(String[] args) {
        Random rnd = new Random();
        float s = rnd.nextFloat()*100;//+50; // положительные значения 0..100
        float t = rnd.nextFloat()*10;//+5; // положительные значения  0..10 часов

        float v = s/t;


        //rnd.setSeed((new Float(s).longValue()));
        int i = rnd.nextInt(10);  // -9..0..9
        System.out.println("Space, time and speed");
        System.out.printf("s:%2.1f Km t:%2.1f Hr v:%2.2f Km/h %d \n",s,t,v, i);

        System.out.println("Increment sequence");
        i = 5;
        i += ++i + i++ + ++i;  // движение слева направо
        // 1. ++i => 5+1 = i=6 s=i => i=6 s=6
        // 2. (s) + i++ => s+i = 6 + 6 = s=12  i++=7
        // 3. (s) + ++i => i = 7+1=8 => s + i => 12+8 = 20 => s=20 i = 8
        // 4.  i+=s  i=5(начальное значение) s=20 => i = i+s => i = 5+20 = 25
        System.out.println(i);
        i=5;
        i *= ++i * i++ * ++i;  // движение слева направо
        // 1. ++i => 5+1 = i=6 s=i => i=6 s=6
        // 2. (s) * i++ => s*i = 6 * 6 = s=36  i++=7
        // 3. (s) * ++i => i = 7+1=8 => s * i => 36*8 = 288 => s=96 i = 8
        // 4.  i*=s  i=5(начальное значение) s=288 => i = i*s => i = 5*288 = 1440
        System.out.println(i);

    }
}
