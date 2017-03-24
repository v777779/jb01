package ch08.ex12a.local;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by V1 on 10-Feb-17.
 */
public class Band {
    static Random rnd = new Random();
    static int bandIdCounter = 1;
    int bandId;
    Singer[] singers; // local singers


    public static Band getBand(Singer[] sGlobal) {
        Singer[] singers = new Singer[3];//  3 участника rnd.nextInt(7)+3];  // 3 до 9 участников
        for (int i = 0; i < singers.length; i++) {
            singers[i] = sGlobal[rnd.nextInt(3)]; // get global link
        }
        Band band = new Band(singers);
        System.out.println("Band."+band.bandId+" Singers."+singers.length+" done\n");
        return band;
    }

    public Band(Singer[] singers) {
        bandId = Band.bandIdCounter++;
        this.singers = singers;
        for (int i = 0; i < singers.length; i++) {
            this.singers[i].addRef();
        }
    }

    public void dispose() {
        for (Singer singer : singers) {
            singer.dispose();
        }
        System.out.println("Band.dispose."+bandId);

    }
    @Override
    public String toString() {
        return "Band{" +
                "bandId=" + bandId +
                ", singers=" + Arrays.toString(singers) +
                '}';
    }
}
