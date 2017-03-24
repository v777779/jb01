package ch02.ex01.df01;


import ch02.ex01.df02.FigureR;

/**
 * Created by V1 on 02-Feb-17.
 */
public class Main {
    public static void main(String[] args) {
        CircleLocal circleLocal = new CircleLocal();
        CircleRemote circleRemote = new CircleRemote();
        Figure figure = new Figure();
        FigureR figureR = new FigureR();

        System.out.println("----- HelloWorld Simple Access ----");

        System.out.println("----- Figure Local Access ----");
//        System.out.println(figure.strFPrivate);
        System.out.println(figure.getStrFPrivate());
        System.out.println(figure.strFDefault);
        System.out.println(figure.strFProtected);
        System.out.println(figure.strFPublic);

        System.out.println("----- FigureR Remote Access ----");
//        System.out.println(figureR.strFPrivate);
        System.out.println(figureR.getStrFPrivate());
//        System.out.println(figureR.strFDefault);
        System.out.println(figureR.getStrFDefault());
//        System.out.println(figureR.strFProtected);
        System.out.println(figureR.getStrFProtected());
        System.out.println(figureR.strFPublic);

        System.out.println("----- HelloWorld Subclass Access ----");
        System.out.println("----- CircleLocal.Figure Direct Local Access ----");
//        System.out.println(circleLocal.strFPrivate);
        System.out.println(circleLocal.getStrFPrivate());
        System.out.println(circleLocal.strFDefault);
        System.out.println(circleLocal.strFProtected);
        System.out.println(circleLocal.strFPublic);

        System.out.println("----- CircleLocal.Figure.Subclass Local Access ----");
        System.out.println(circleLocal.getStrFPrivate());
        System.out.println(circleLocal.getStrFDefault());
        System.out.println(circleLocal.getStrFProtected());

        System.out.println("----- CircleRemote.FigureR Direct Remote Access ----");
//        System.out.println(circleRemote.strFPrivate);
        System.out.println(circleRemote.getStrFPrivate());
//        System.out.println(circleRemote.strFDefault);
        System.out.println(circleRemote.getStrFDefault());
//        System.out.println(circleRemote.strFPrivate);
        System.out.println(circleRemote.getStrFProtected());
        System.out.println(circleRemote.strFPublic);

        System.out.println("----- CircleLocal.Figure.Subclass Remote Access ----");
        System.out.println(circleRemote.getStrFPrivate());
        System.out.println(circleRemote.getStrFDefault());
        System.out.println(circleRemote.getStrFProtected());


    }
}
