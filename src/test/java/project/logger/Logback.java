package project.logger;

import io.cucumber.core.logging.Logger;
import io.cucumber.core.logging.LoggerFactory;

public class Logback {
    private static final Logger LOGGER =
            LoggerFactory.getLogger(Logback.class);

    public static void main(String[] args) {
        LOGGER.info("INFO");
        LOGGER.error("ERROR");
    }

}
