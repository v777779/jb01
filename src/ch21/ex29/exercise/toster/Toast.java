package ch21.ex29.exercise.toster;

/**
 * Vadim Voronov
 * Created: 07-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Toast {
    public enum Status{DRY, BUTTERED,JAMMED, JELLIED}
    private Status status = Status.DRY; // просто пустой хлеб
    private final int id;

    public Toast(int id) {
        this.id = id;
    }

    public void butter() {
        status = Status.BUTTERED;
    }
    public void jelly() {
        status = Status.JELLIED;
    }

    public void jam() {
        status = Status.JAMMED;
    }

    public Status getStatus() {
        return status;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Toast " + id  +": " + status;
    }
}
