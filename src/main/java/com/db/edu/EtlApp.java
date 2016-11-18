package com.db.edu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EtlApp {
    private static final Logger logger = LoggerFactory.getLogger(EtlApp.class);

    public static void main(String... args) {
        logger.debug("Entering main method with args {}", args);
        System.out.println( "Hello World!" );
    }
}
