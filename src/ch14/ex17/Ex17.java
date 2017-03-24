package ch14.ex17;

import ch14.ex17.access.Access;
import ch14.ex17.include.Include;
import ch14.ex17.local.Local;

/**
 * Created by V1 on 10-Mar-17.
 */
public class Ex17 {
    public static void main(String[] args) {
        Local.app();
        Include.app(args);
        Access.app(args);

    }
}
