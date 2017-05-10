package ch21.ex35.exercise.model;

/**
 * Vadim Voronov
 * Created: 10-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Customer {
    private final int serviceTime;

    public Customer(int serviceTime) {
        this.serviceTime = serviceTime;
    }
    public int getServiceTime() {
        return serviceTime;
    }

    @Override
    public String toString() {
        return "[" + serviceTime + "]";
    }
}
