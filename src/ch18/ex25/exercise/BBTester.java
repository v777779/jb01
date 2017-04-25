package ch18.ex25.exercise;

import ch18.ex25.exercise.tests.*;

import java.io.IOException;
import java.io.PrintStream;

/**
 * Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 13-Apr-17.
 */
public class BBTester {
    private abstract static class Tester {
        private String testName;

        public Tester(String name) {
            this.testName = name;
        }

        public abstract void test(); // метод разный у каждого экземпляра

        public void runTest() {
            String fileName = "./src/ch18/ex25/exercise/tests/test.txt";
            try {
                PrintStream old = System.out;
                PrintStream out = new PrintStream(fileName);
                System.setOut(out);
//test loop
                long timeStart = System.nanoTime();
                test();
                double timeLong = System.nanoTime() - timeStart;
//test loop
                System.setOut(old);
                out.close();  // закрывать обязательно иначе держит файл
                System.out.printf("%-32s: %.2f\n", testName, timeLong / 1e6);  // распечатать длительность теста
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private static Tester[] tests = {
            new Tester(String.format("%-16s %-16s","GetChannel","allocate")) {
                @Override
                public void test() {
                    GetChannel.check();  // запустить в работу стандартом
                }
            },
            new Tester(String.format("%-16s %-16s","GetChannel","allocateDirect")) {
                @Override
                public void test() {
                    GetChannelAD.check();  // запустить в работу стандартом
                }
            },
            new Tester(String.format("%-16s %-16s","ChannelCopy","allocate")) {
                private String fileSrc = "./src/ch18/ex25/exercise/tests/ChannelCopy.java";
                private String fileDst = fileSrc.replace(".java",".txt");
                @Override
                public void test() {
                    ChannelCopy.check(fileSrc,fileDst);  // запустить в работу стандартом
                }
            },
            new Tester(String.format("%-16s %-16s","ChannelCopy","allocateDirect")) {
                private String fileSrc = "./src/ch18/ex25/exercise/tests/ChannelCopy.java";
                private String fileDst = fileSrc.replace(".java","2.txt");

                @Override
                public void test() {
                    ChannelCopyAD.check(fileSrc,fileDst);  // запустить в работу стандартом
                }
            },
            new Tester(String.format("%-16s %-16s","BufferToText","allocate")) {
                private String fileDst = "./src/ch18/ex25/exercise/tests/BufferToText.txt";
                @Override
                public void test() {
                    BufferToText.check(fileDst);  // запустить в работу стандартом
                }
            },
            new Tester(String.format("%-16s %-16s","BufferToText","allocateDirect")) {
                private String fileDst = "./src/ch18/ex25/exercise/tests/BufferToTextAD.txt";
                @Override
                public void test() {
                    BufferToTextAD.check(fileDst);  // запустить в работу стандартом
                }
            },
            new Tester(String.format("%-16s %-16s","GetData","allocate")) {
                @Override
                public void test() {
                    GetData.check();  // запустить в работу стандартом
                }
            },
            new Tester(String.format("%-16s %-16s","GetData","allocateDirect")) {
                @Override
                public void test() {
                    GetDataAD.check();  // запустить в работу стандартом
                }
            },
            new Tester(String.format("%-16s %-16s","IntBuffDemo","allocate")) {
                @Override
                public void test() {
                    IntBuffDemo.check();  // запустить в работу стандартом
                }
            },
            new Tester(String.format("%-16s %-16s","IntBuffDemo","allocateDirect")) {
                @Override
                public void test() {
                    IntBuffDemoAD.check();  // запустить в работу стандартом
                }
            },
            new Tester(String.format("%-16s %-16s","UsingBuffers","allocate")) {
                @Override
                public void test() {
                    UsingBuffers.check();  // запустить в работу стандартом
                }
            },
            new Tester(String.format("%-16s %-16s","UsingBuffers","allocateDirect")) {
                @Override
                public void test() {
                    UsingBuffersAD.check();  // запустить в работу стандартом
                }
            }


    };

    public static void run() {
        for (Tester test : tests) {
            test.runTest();
        }
    }


}
