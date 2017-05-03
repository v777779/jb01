package ch21.ex18.codec;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousCloseException;
import java.nio.channels.ClosedByInterruptException;
import java.nio.channels.SocketChannel;

/**
 * Vadim Voronov
 * Created: 03-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class NIOBlocked implements Runnable {
    private final SocketChannel sc;

    public NIOBlocked(SocketChannel sc) {
        this.sc = sc;
    }

    @Override
    public void run() {
        try {
            System.out.println("Waiting read() in" + this);
            sc.read(ByteBuffer.allocate(100));  // операция чтения из SocketChannel

        } catch (ClosedByInterruptException e) {
            System.out.println("ClosedByInterruptException");
        } catch (AsynchronousCloseException e) {
            System.out.println("AsynchronousCloseException");
        } catch (IOException e) {
            System.out.println("IOException");
        }
        System.out.println("Exiting NIOBlocked.run() "+this);


    }
}
