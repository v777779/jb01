package ch14.ex25.integra.pkg;

/**
 * Created by V1 on 13-Mar-17.
 */
class C implements A {
    private int i = 1;
    private String s = "private SSSS";
    private final String s2 = "private S2S2S2";

    private String getFields() {
        return "class C [i:"+i+" s:\""+s+"\" s2:\""+s2+"\"]";
    }

    @Override
    public void f() {
        System.out.println("public: C.f");
    }
    public void g() {
        System.out.println("public: C.g");
    }

    void u() {
        System.out.println("package access: C.u");
    }

    protected void v() {
        System.out.println("protected: C.v");
    }

    private void w() {
        System.out.println("private: C.w");
    }



}
