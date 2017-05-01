package lib.threads;

/**
 * Vadim Voronov
 * Created: 30-Apr-17.
 * email: vadim.v.voronov@gmail.com
 */
public abstract class IntGenerator {
    private boolean canceled = false;  // boolean атомарность volatile видимость

    public abstract int next();  // абстрактный метод

    public void cancel() {  // флаг доступа к ресурсу
        canceled = true;
    }

    public boolean isCanceled() {
        return canceled;
    }
}
