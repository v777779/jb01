package ch12.ex06.local;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * Created by V1 on 01-Mar-17.
 */
public class LoggingExternal {
    private Logger logger = Logger.getLogger("Logger.Name"); // custom logger


    public void getLog(Exception e) {
        StringWriter stringWriter = new StringWriter(); // экземпляр класса StringWriter
        e.printStackTrace(new PrintWriter(stringWriter)); // заполнить вызов стека текст по принятому Exception
        logger.severe(stringWriter.toString());         // записать в log и вывести на печать
    }
}
