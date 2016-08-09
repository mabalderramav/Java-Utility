package System;

import org.apache.log4j.Logger;

import java.io.*;
import java.sql.SQLException;
import java.util.*;

public class log4jExample {

    /* Get actual class name to be printed on */
    static Logger log = Logger.getLogger(log4jExample.class.getName());

    public static void main(String[] args) throws IOException, SQLException {
//        log.debug("Hello this is a debug message");
//        log.info("Hello this is an info message");
        log4jExample obj = new log4jExample();
        obj.runMe("mkyong");
    }
    private void runMe(String parameter){

        if(log.isDebugEnabled()){
            log.debug("This is debug : " + parameter);
        }

        if(log.isInfoEnabled()){
            log.info("This is info : " + parameter);
        }

        log.warn("This is warn : " + parameter);
        log.error("This is error : " + parameter);
        log.fatal("This is fatal : " + parameter);

    }
}
