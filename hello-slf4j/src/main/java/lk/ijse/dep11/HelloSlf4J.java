package lk.ijse.dep11;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloSlf4J {

    private static final Logger LOGGER = LoggerFactory.getLogger(HelloSlf4J.class);

    public static void main(String[] args) {
        LOGGER.trace("This is a trace log");
        LOGGER.debug("This is a debug log");
        LOGGER.info("This is an info log");
        LOGGER.warn("This is a warning log");
        LOGGER.error("This is an error log");
    }
}
