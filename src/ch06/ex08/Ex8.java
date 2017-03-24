package ch06.ex08;

import ch06.ex08.access.Launch;
import ch06.ex08.access.local.Connection;
import ch06.ex08.access.local.ConnectionManager;

/**
 * Created by V1 on 07-Feb-17.
 */
public class Ex8 {
    public static void main(String[] args) {
        Launch launch = new Launch();
        for (int i = 0; i <5; i++) {
            launch.getBallInfo();
        }
        for (int i = 0; i <5; i++) {
            launch.getDiskShow();
        }

        Launch launch2 = new Launch();
        for (int i = 0; i <3; i++) {
            launch2.getBallInfo();
        }
        for (int i = 0; i <3; i++) {
            launch2.getDiskShow();
        }

        System.out.println();
        System.out.println("Ex8.main");
        System.out.println();

        ConnectionManager cm = ConnectionManager.makeConnections(10);
        while (true) {
            Connection cn = cm.getConnection();
            if (cn == null) {
                System.out.println("connection's limit reached");
                break;
            }
                System.out.println("cni = " +  cn.getI());
        }



    }
}
