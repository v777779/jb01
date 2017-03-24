package ch12.ex6.local;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * Created by V1 on 01-Mar-17.
 */
public class LoggingException extends Exception {
    private static Logger logger = Logger.getLogger("Logger.Name"); // custom logger

    public LoggingException() {
        StringWriter stringWriter = new StringWriter(); // экземпляр класса StringWriter
        printStackTrace(new PrintWriter(stringWriter)); // заполнить вызов стека текст
        logger.severe(stringWriter.toString());         // записать в log и вывести на печать
//        logger.severe("Message:Logger String");       // записать в log можно свое сообщение

    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();  // для вывода на печать просто имени класса
    }
}
