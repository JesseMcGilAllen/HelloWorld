package com.example.helloworld;

import org.apache.log4j.*;

/**
 * Created by jessemcgilallen on 1/27/16.
 */
public class LoggingExample {

    private org.apache.log4j.Logger log = Logger.getLogger(this.getClass());

    public LoggingExample() {

        log.trace("Trace Message");
        log.debug("Debug Message");
        log.info("Info Message");
        log.error("Error Message");
        log.warn("Warn message");
        log.fatal("Fatal Message");
    }
}
