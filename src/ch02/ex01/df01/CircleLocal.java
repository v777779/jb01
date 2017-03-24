package ch02.ex01.df01;

/**
 * Created by V1 on 02-Feb-17.
 */
public class CircleLocal extends Figure {
    public      String strCPublic    =  "CircleLocal Public";
    protected   String strCProtected = "CircleLocal Protected";
    private     String strCPrivate   = "CircleLocal Private";
    String      strCDefault          = "CircleLocal Default";

    public String getStrCProtected() {
        return "Getter CircleLocal: "+ strCProtected;
    }

    public String getStrCPrivate() {
        return "Getter CircleLocal: "+strCPrivate;
    }

    public String getStrCDefault() {
        return "Getter CircleLocal: "+strCDefault;
    }

    public String getStrFDefault() {
        return "Getter CircleLocal Figure: "+super.strFDefault;
    }

    public String getStrFPrivate() {
        return "Getter CircleLocal Figure: "+super.getStrFPrivate();
    }

    public String getStrFProtected() {
        return "Getter CircleLocal Figure: "+super.strFProtected;
    }

}
