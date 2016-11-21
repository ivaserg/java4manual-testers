package com.db.edu;

import com.db.edu.etl.Controller;
import com.db.edu.etl.RecordType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.db.edu.etl.Controller.*;
import static com.db.edu.etl.Controller.load;
import static com.db.edu.etl.Controller.transform;

public class EtlApp {
    private static final Logger logger = LoggerFactory.getLogger(EtlApp.class);

    public static void main(String... args) {
        logger.debug("Entering main method with args {}", args);

        load(transform(RecordType.EIS1_DATA_FILE, extract(RecordType.EIS1_DATA_FILE)));

    }
}
