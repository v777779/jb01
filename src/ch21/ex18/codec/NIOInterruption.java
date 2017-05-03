package ch21.ex18.codec;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.channels.SocketChannel;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 03-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class NIOInterruption {
    public static void check() {
        try {
            ExecutorService exec = Executors.newCachedThreadPool();
            ServerSocket server = new ServerSocket(8082);
            InetSocketAddress isa = new InetSocketAddress("localhost",8082);
            SocketChannel sc1 = SocketChannel.open(isa);  // открыть два socket nio
            SocketChannel sc2 = SocketChannel.open(isa);
            Future<?> f = exec.submit(new NIOBlocked(sc1)); // запомнили, чтобы честно послать cancel
            exec.execute(new NIOBlocked(sc2)); // запустили обычным способом
            exec.shutdown(); // закрываем службу
            TimeUnit.SECONDS.sleep(1);    // прождали 1 секунду
            f.cancel(true);     // закрыли через персональное прерывание
            TimeUnit.SECONDS.sleep(1);    // прождали 1 секунду
            sc2.close();                         // закрыли через закрытие ресурса

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
