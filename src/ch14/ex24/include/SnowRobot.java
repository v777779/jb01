package ch14.ex24.include;

import java.util.Arrays;
import java.util.List;

/**
 * Created by V1 on 12-Mar-17.
 */
public class SnowRobot implements Robot {
    private String name;
    private final String MODEL;
    private final String[] OP_DESC = {name+" can shovel snow", name+" can chip ice", name+"can clear the roof" };
    private final String[] OP_CMD  = {name+" shoveling snow", name+" chipping ice", name+" clearing roof" };


    public SnowRobot(String name) {
        this.name = name;
        MODEL  = "SnowBot Series II";
    }


    @Override
    public String name() {
        return name;
    }

    @Override
    public String model() {
        return MODEL;
    }

    @Override
    public List<Operate> operate() {
        return Arrays.asList(
                new Operate() {
                    public String descr() {
                        return name + " can shovel snow";
                    }
                    public void command() {
                        System.out.println(name + " shoveling snow");
                    }
                },
                new Operate() {
                    public String descr() {
                        return name+" can chip ice";
                    }
                    public void command() {

                        System.out.println(name+ " chipping ice");
                    }
                },
                new Operate() {
                    public String descr() {
                        return name+" can clear the roof";
                    }
                    public void command() {

                        System.out.println(name+ " clearing roof");
                    }
                }
        );
    }
}
