package ch02.hw8;

/**
 * Created by V1 on 03-Feb-17.
 */
public class StaticTest {
    static StaticTest st = new StaticTest();
    int i = 0;

    public StaticTest() {
    }

    public StaticTest(int i) {
        this.i = i;
    }

    static void show(StaticTest stObject,String s) {
        System.out.println(s+"      :"+stObject);
        System.out.println(s+".st   :"+stObject.st+"\t "+s+".i:"+stObject.i);
        System.out.println(s+".st.st:"+stObject.st.st+"\t "+s+".st.i:"+stObject.st.i);
        System.out.println(s+".st == StaticTest.st: "+ stObject.st.equals(StaticTest.st));
        System.out.println();
    }

    boolean equals(StaticTest st) {
        try {
            if(this.st == st && this.st.i == st.i){
                return true;
            }

        } catch (Exception e) {
            System.out.println("exception happened");
        }
        return false;
    }

}
