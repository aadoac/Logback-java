package org.amazed.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {

        LOGGER.error("error message");
        LOGGER.info("info message");
        LOGGER.debug("debug message");
    }
}