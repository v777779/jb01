package ch09.ex17.access;

/**
 * Created by V1 on 14-Feb-17.
 */
public class UserClass implements InterPackage {
    private int userClassId = INTERFACE_ID;
    @Override
    public String toString() {
        return "UserClass{"+ userClassId+"}";
    }
}
