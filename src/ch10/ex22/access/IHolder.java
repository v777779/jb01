package ch10.ex22.access;

/**
 * Created by V1 on 16-Feb-17.
 */
public interface IHolder {
    enum OpEnum  { LOCK, UNLOCK, STATUS, SOUND, NOINIT }
    void lock();
    String status();
    void sound();
    void unlock();

    class HolderControl implements IHolder {
    //    public enum OpEnum  { LOCK, UNLOCK, STATUS, SOUND, NOINIT }
        OpEnum opEnum = OpEnum.NOINIT;
        public static String hControl(IHolder holder, OpEnum opEnum) {
            switch (opEnum) {
                case LOCK:
                    holder.lock();
                    return "Locked";
                case UNLOCK:
                    holder.unlock();
                    return "Unlocked";
                case SOUND:
                    holder.sound();
                    return "Alarm Sound";
                case STATUS:
                    return "Status."+ holder.status();
                    default:
                case NOINIT:
                    return "NoInit";
            }
        }

        @Override
        public void lock() {
            System.out.println("HolderControl.lock");
        }

        @Override
        public String status() {
            System.out.print("HolderControl.status > ");
            return "Check all done";
        }

        @Override
        public void sound() {
            System.out.println("HolderControl.sound");
        }

        @Override
        public void unlock() {
            System.out.println("HolderControl.unlock");
        }
    }


}
