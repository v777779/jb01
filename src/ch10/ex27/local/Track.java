package ch.ex27.local;

/**
 * Created by V1 on 17-Feb-17.
 */
public class Track {
    class Surface {
        public Surface() {
            System.out.println("Surface.Constructor");
        }

        void init() {
            Track.this.init();
            System.out.println("Surface.init");
        }
    }

    public Track() {
        System.out.println("Track.Constructor");
    }

    void init() {
        System.out.println("Track.init");
    }

}
