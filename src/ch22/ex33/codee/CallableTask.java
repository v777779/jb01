package ch22.ex33.codee;

import java.util.concurrent.Callable;

/**
 * Vadim Voronov
 * Created: 25-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class CallableTask extends Task implements Callable<String> { // берем нашу задачу и превращаем в Callable
    @Override                                                        // вот поэтому и список под <C extends Callabale<R>>
    public String call() throws Exception {                          // теперь туда запихнут CallableTask == Callable<Tring>
        run();          // от предка  sleep(3sec)
        return "Return value of "+this; // иммитация возвращаемого значения
    }

}
