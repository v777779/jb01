package ch07.ex22;

/**
 * Created by V1 on 09-Feb-17.
 */

// public class Cloud extends Air { это не сработает наследования не получится
public class Cloud {// } extends Air { это не сработает наследования не получится
    Air air = new Air();  // композиция пожалуйства
    Air airN;
    Air airM;

    public Cloud() {
        System.out.println("Cloud.Cloud."+air);

    }
}

