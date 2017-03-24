package ch10.ex19.access;

/**
 * Created by V1 on 15-Feb-17.
 */
public class Cort {
    private static class Players implements IPlayers {
        private int count = 10;

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        @Override
        public String toString() {
            return "Players{" +
                    "count=" + count +
                    '}';
        }
    } // static class done

    public static IPlayers getNested() {
        return new Players();
    }
}
