package ch12.ex27.local;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by V1 on 03-Mar-17.
 */
public class WrapRTE {
    public void throwRTEx(int type) {
        try {
            switch (type) {
                case 0:
                    throw new FileNotFoundException();
                case 1:
                    throw new IOException();
                case 2:
                    throw new ClassCastException("Where Am I");
                default:
                    return;
            }
        } catch (Exception e) {
            throw new RuntimeException(e); // unchecked Exception отправляем наверх
        }

    }
}
