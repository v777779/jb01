package hw.vpex;

/**
 * Vadim Voronov
 * Created: 08-May-17.
 * email: vadim.v.voronov@gmail.com
 */

public class AreaTriangleFunction {
    public static String isOnSameLine(double x1, double y1, double x2, double y2, double x3, double y3) {
        double epsilon = 1.0e-10;
        double a = (x1 - x3) * (y2 - y3);
        double b = (x2 - x3) * (y1 - y3);

        if (Math.abs(a - b) <= epsilon) {
            return "Координаты лежат на одной прямой";
        }
        return "Координаты не лежат на одной прямой";
    }

    public static double area(double x1, double y1, double x2, double y2, double x3, double y3) {
        double sideOne = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        double sideTwo = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));
        double sideThree = Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2));
        double halfPerimeter = (sideOne + sideTwo + sideThree) / 2;
        return (Math.sqrt(halfPerimeter * (halfPerimeter - sideOne) * (halfPerimeter - sideTwo) * (halfPerimeter - sideThree)));


    }

    public static void main(String[] args) {

        System.out.println(isOnSameLine(5, 6, 5, 6, 3, 1));
        System.out.println("Площадь равна: " + area(1, 3, 5, 5, 8, 2));

//        int U,I1,I2,I3,R1,R2,R3,R4,R5;
//        R1=3 R2=4 R3 =5 R4=8 R5=10
//        -U + (I1-I2)*R1+(I1-I3)*R2 = 0;
//        (I2-I1)*R1+(I2-I3)*R5+I2*R3 = 0;
//        (I3-I1)*R2+(I3-I2)*R5+I3*R4 = 0
//
//        (I1-I2)*3+(I1-I3)*4 = U;
//        (I2-I1)*3+(I2-I3)*10+I2*5 = 0;
//        (I3-I1)*4+(I3-I2)*10+I3*8 = 0
//        I1*(3+4) I2*-3 I3*-4 = 120
//        I1*-3 +I2*(3+10+5) I3*-10 = 0
//        I1*-4  I2*-10 I3*(4+10+8) = 0
//
//        I1*7    I2*-3   I3*-4   = 120
//        I1*-3 + I2*18   I3*-10  = 0
//        I1*-4   I2*-10  I3*22   = 0

//      R1 = R3 = 5    R12 = 5+10+5*10/8 = 15+50/8
//      R2 = R5 = 10   R13 = 5+8 +5*8/10 = 13+4 = 17
//      R3 = R4 = 8    R23 = 10+8+10*8/5 = 18+16 = 34
//      R35 = 21.25  R34 = 17 R54 = 34
//      (R1|R35 + R2|R54)|R34

        double R1 = 3, R35 = 21.25, R2=4, R3=5,R34=17,R4=8,R5=10,R54=34, RA,RB,RC, RD;
        RA = R1*R35/(R1+R35);
        RB = R2*R54/(R2+R54);
        RC = RA+RB;
        RD = RC*R34/(RC+R34);

        System.out.println("RD:"+RD);

        double I1 = (double)17760/673;
        double I2 = (double)6360/673;
        double I3 = (double)6120/673;

        double PIN = (double)120*I1;
        double POUT = RD*Math.pow(I1,2);
        System.out.println(PIN+" "+POUT);

        System.out.println(Math.pow((I1-I2),2)*R1);
        System.out.println(Math.pow(I1-I3,2)*R2);
        System.out.println(Math.pow(I2-I3,2)*R5);
        System.out.println(Math.pow(I2,2)*R3);
        System.out.println(Math.pow(I3,2)*R4);

    }
}

