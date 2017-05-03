package ch21.ex18.codeb;

import ch21.ex18.codea.IOBlocked;

import java.io.*;
import java.net.*;
import java.util.concurrent.*;

/**
 * Vadim Voronov
 * Created: 03-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class CloseResourse {
    public static void check() {
        try {
            ExecutorService exec = Executors.newCachedThreadPool();
            ServerSocket serverSocket = new ServerSocket(8080); // открыть socket и получить поток данных
            InputStream socketInput = new Socket("localhost",8080).getInputStream();

            ServerSocket serverSocket2 = new ServerSocket(8081); // открыть socket и получить поток данных
            InputStream socketInput2 = new Socket("localhost",8081).getInputStream();

            exec.execute(new IOBlocked(socketInput));
            exec.execute(new IOBlocked(socketInput2));

            TimeUnit.MILLISECONDS.sleep(100);
            System.out.println("Shutting down all threads");
            exec.shutdownNow(); // отослать прерывание
            TimeUnit.SECONDS.sleep(1);
            System.out.println("Closing "+ socketInput.getClass().getSimpleName());
            socketInput.close(); // закрываем поток ввода  socketInput
            TimeUnit.SECONDS.sleep(1);
            System.out.println("Closing "+ socketInput2.getClass().getSimpleName());
            socketInput2.close(); // закрываем поток ввода System.in


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
