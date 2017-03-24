package ch14.ex25.include.pkg;

/**
 * Created by V1 on 13-Mar-17.
 */
class C implements A {
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
