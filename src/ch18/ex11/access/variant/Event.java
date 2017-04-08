package ch18.ex11.access.variant;

/**
 * Created by V1 on 17-Feb-17.
 */
abstract public class Event {
    private long eventTime;         // время события == создания объекта + задержка
    protected final long delayTime; // фиксированная задержка
    protected final long NANO2MS = (long)(1e6); // фиксированная задержка



    public Event(long delayTime) {  // задержка задается конструктором
        this.delayTime = delayTime; // перевести наносекунды в миллисекунды
        start();
    }
    void start() {
        eventTime = System.nanoTime()+delayTime*NANO2MS; // текущее время плюс задержка
    }

    public boolean ready() {
        return System.nanoTime() >= eventTime;   // ready если больше задержки с создания объекта
    }
    public abstract void action(); // отработка события на стороне клиента

    @Override
    public String toString() {
        return "Event{" + "User.Event.Print."+
                "eventTime=" + eventTime +
                ", delayTime=" + delayTime +
                '}';
    }
}
