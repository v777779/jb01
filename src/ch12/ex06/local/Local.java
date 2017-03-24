package ch12.ex06.local;

import java.lang.instrument.UnmodifiableClassException;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {

   public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nLoggin Exception Check\n");

// Exception with Logger
        try {
            throw new LoggingException();
        } catch (LoggingException e) {
            System.err.println("Catched: " + e);  // вывод собственно объекта
        }
// Exception with Logger and Outer Processing
       System.err.println("\n\nCustom Logger for Different Exceptions\n");

       LoggingExternal logger = new LoggingExternal();
       try {
           throw new NullPointerException();
       } catch (Exception e) {
           logger.getLog(e); // сохранить в Logger
           System.err.println(logger);
       }
       try {
           throw new UnsupportedOperationException();
       } catch (Exception e) {
           logger.getLog(e); // сохранить в Logger
       }

       try {
           throw new UnmodifiableClassException();
       } catch (Exception e) {
           logger.getLog(e); // сохранить в Logger

       }

       try {
           Thread.sleep(10);
       } catch (Exception e) {
       }


    }
}
