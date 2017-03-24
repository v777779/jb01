package ch11.ex27.access;

/**
 * Created by V1 on 27-Feb-17.
 */
public class Command {
    String name;


    public Command(String name) {
        this.name = name;
    }

    public void operation() {
        System.out.println("operation: "+name);
    }


}
