package ch14.ex25.integra.pkg;

/**
 * Created by V1 on 13-Mar-17.
 */
class AnonimA {
  static A makeA() {
        return new C() {
            private int j = 1;
            private final String t = "private TTTT";
            private String t2 =      "private T2T2T2";

            private String getFields() {
                return "j="+j+" t ="+t+" t2 ="+t2;
            }

            @Override
            public void f() {
                System.out.println("public: AnonimA.f");
            }
            public void g() {
                System.out.println("public: AnonimA.g");
            }
            void u() {
                System.out.println("package: AnonimA.u");
            }
            protected void v() {
                System.out.println("protected: AnonimA.v");
            }
            private void w() {
                System.out.println("public: AnonimA.w");
            }

        };


    }
}
