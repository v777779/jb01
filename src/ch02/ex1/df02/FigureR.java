package ch02.ex1.df02;

/**
 * Created by V1 on 02-Feb-17.
 */
public class FigureR {
    public      String strFPublic    = "FigureR Public";
    protected   String strFProtected = "FigureR Protected";
    private     String strFPrivate   = "FigureR Private";
    String      strFDefault          = "FigureR Default";

    public String getStrFProtected() {
        return "Getter FigureR: "+strFProtected;
    }

    public String getStrFPrivate() {
        return "Getter FigureR: "+strFPrivate;
    }

    public String getStrFDefault() {
        return "Getter FigureR: "+strFDefault;
    }
}
