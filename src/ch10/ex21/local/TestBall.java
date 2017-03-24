package ch.ex21.local;

/**
 * Created by V1 on 16-Feb-17.
 */
public class TestBall {
    private String name;
    private int size;
    public TestBall(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "TestBall{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }

    public static class Main {
        public static void main(String[] args) {
            TestBall testBall = new TestBall("Green", 12);
            System.out.println(testBall);
        }
    }


}
