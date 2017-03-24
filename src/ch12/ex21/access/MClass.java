package ch12.ex21.access;

/**
 * Created by V1 on 03-Mar-17.
 */
public class MClass extends NClass{
    public MClass() throws NCEx {
        super();  // именно поэтому не перехватить
        try {

        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
