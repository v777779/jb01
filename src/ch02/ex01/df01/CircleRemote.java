package ch02.ex01.df01;

import ch02.ex01.df02.FigureR;

/**
 * Created by V1 on 02-Feb-17.
 */
public class CircleRemote extends FigureR {
    public      String strCPublic    = "CircleRemote Public";
    protected   String strCProtected = "CircleRemote Protected";
    private     String strCPrivate   = "CircleRemote Private";
    String      strCDefault          = "CircleRemote Default";

    public String getStrCProtected() {
        return "Getter CircleRemote: "+strCProtected;
    }

    public String getStrCPrivate() {
        return "Getter CircleRemote: "+strCPrivate;
    }

    public String getStrCDefault() {
        return "Getter CircleRemote: "+strCDefault;
    }

    @Override
    public String getStrFProtected() {
        return "Getter CircleRemote FigureR : "+ super.strFProtected;
    }

    @Override
    public String getStrFPrivate() {
        return "Getter CircleRemote FigureR : "+ super.getStrFPrivate();
    }

    @Override
    public String getStrFDefault() {
        return "Getter CircleRemote FigureR : "+ super.getStrFDefault();
    }
}
