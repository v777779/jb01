package ch.ex20.access;

/**
 * Created by V1 on 17.03.2017.
 */
public class Auditor {


    public static <T extends ICount> void makeAudit( T obj ) {
        System.out.println("Auditor:");
        obj.getcount();
        obj.setcount();


    }

}
