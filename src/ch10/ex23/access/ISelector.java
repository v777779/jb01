package ch10.ex23.access;

/**
 * Created by V1 on 14-Feb-17.
 */
public interface ISelector {
    boolean checkEnd();

    Object getCurrent();

    void nextIndex();

    static void play(ISelector s) {
        for (int i = 0; i < 25; i++) {
            System.out.print(s.getCurrent()+" ");
            s.nextIndex();
        }
        System.out.println();
    }
}
