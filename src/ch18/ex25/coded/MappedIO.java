package ch18.ex25.coded;

import java.io.*;
import java.nio.IntBuffer;
import java.nio.channels.FileChannel;

/**
 * Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 12-Apr-17.
 */
public class MappedIO {
    private static int numOfInts = 4000000;
    private static int numOfBuff = 200000;
    private static String fileStream = "./src/ch18/ex25/coded/TestStream.tmp";
    private static String fileChannel = "./src/ch18/ex25/coded/TestChannel.tmp";

    private abstract static class Tester {
        private String name;

        public Tester(String name) {
            this.name = name;
        }

        public abstract void test() throws IOException;  // абстрактный метод

        public void run() {
            System.out.print(name + ": ");
            try {
                long start = System.nanoTime();
                test();
                double duration = System.nanoTime() - start;
                System.out.printf("%.2f\n", duration / 1e06); // в sec
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private static Tester[] tests = {
            new Tester("Stream Write     ") {
                @Override
                public void test() throws IOException {
                    DataOutputStream ds = new DataOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(new File(fileStream)))
                    );
                    for (int i = 0; i < numOfInts; i++) {
                        ds.writeInt(i);
                    }
                    ds.close();
                }
            },

            new Tester("Mapped Write     ") {
                @Override
                public void test() throws IOException {
                    FileChannel fc = new RandomAccessFile(fileChannel,"rw").getChannel();
                    IntBuffer ib = fc.map(FileChannel.MapMode.READ_WRITE,0,numOfInts*4).asIntBuffer();
                    for (int i = 0; i < numOfInts; i++) {
                        ib.put(i);
                    }
                    fc.close();
                }
            },

            new Tester("Stream Read      ") {
                @Override
                public void test() throws IOException {
                    DataInputStream ds = new DataInputStream(
                            new BufferedInputStream(
                                    new FileInputStream(new File(fileStream)))
                    );
                    for (int i = 0; i < numOfInts; i++) {
                        ds.readInt();
                    }
                    ds.close();
                }
            },
            new Tester("Mapped Read      ") {
                @Override
                public void test() throws IOException {
                    FileChannel fc = new FileInputStream(fileChannel).getChannel();
                    IntBuffer ib = fc.map(FileChannel.MapMode.READ_ONLY,0,fc.size()).asIntBuffer();
                    for (int i = 0; i < numOfInts; i++) {
                        ib.get();
                    }
                    fc.close();
                }
            },
            new Tester("Stream Read/Write") {
                @Override
                public void test() throws IOException {
                    RandomAccessFile fw = new RandomAccessFile(new File(fileStream),"rw");
                    fw.writeInt(1);
                    for (int i = 0; i < numOfBuff; i++) {
                        fw.seek(fw.length()-4); // дозапись
                        fw.writeInt(fw.readInt());
                    }
                    fw.close();
                }
            },

            new Tester("Mapped Read/Write") {
                @Override
                public void test() throws IOException {
                    FileChannel fc = new RandomAccessFile(new File(fileChannel),"rw").getChannel();
                    IntBuffer ib = fc.map(FileChannel.MapMode.READ_WRITE,0,fc.size()).asIntBuffer();
                    ib.put(0);
                    for (int i = 1; i < numOfBuff; i++) {
                        ib.put(ib.get(i-1));
                    }
                    fc.close();
                    ib = null;
                    System.gc();
                 }
            },

    };

    public static void check() {
        for (Tester test : tests) {
            test.run();
        }
   }


}
