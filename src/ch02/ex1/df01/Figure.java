package ch02.ex1.df01;

/**
 * Created by V1 on 02-Feb-17.
 */
public class Figure {
    public      String strFPublic    = "Figure Public";
    protected   String strFProtected = "Figure Protected";
    private     String strFPrivate   = "Figure Private";
    String      strFDefault          = "Figure Default";

    public String getStrFProtected() {
        return "Getter Figure: "+strFProtected;
    }

    public String getStrFPrivate() {
        return "Getter Figure: "+strFPrivate;
    }

    public String getStrFDefault() {
        return "Getter Figure: "+strFDefault;
    }
}
