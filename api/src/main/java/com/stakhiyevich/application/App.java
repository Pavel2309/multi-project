package com.stakhiyevich.application;

import com.stakhiyevich.util.Utils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {

    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        Utils utils = new Utils();
        boolean result = utils.isAllPositiveNumbers("12", "79");
        logger.info("result: " + result);
    }
}