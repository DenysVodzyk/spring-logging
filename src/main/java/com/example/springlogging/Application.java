package com.example.springlogging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application {
    private static final Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        logger.debug("Debug.");
        logger.info("Info.");
        logger.error("Error.");
        System.out.println("Hello.");
    }
}
