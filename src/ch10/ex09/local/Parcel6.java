package ch10.ex09.local;

/**
 * Created by V1 on 15-Feb-17.
 */
public class Parcel6 {

    private String tracking(boolean flag) {
        String s = "";
        if (flag) {
            class TrackFlag {  // класс определен по условию
                private String id;

                public TrackFlag(String id) { // constructor by default
                    this.id = id;
                }

                public String getId() {
                    return id;
                }
            } // eof of inner class

            TrackFlag tf = new TrackFlag("FlagID_12345678");
            s = "TrackFlag:"+tf.getId();
        } else {
            s = "NoFlag";
        }
        return s;
    }

    public void showInfo(boolean flag) {
        System.out.println(tracking(flag));

    }
}
