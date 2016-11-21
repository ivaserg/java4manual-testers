package com.db.edu.etl;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.db.edu.etl.RecordType.*;

public class Controller {

    private static final Logger logger = LoggerFactory.getLogger(Controller.class);

    public static String[] transform(RecordType recordType, String rawDataRecord) {
        switch (recordType) {
            case EIS1_DATA_FILE: {
                return rawDataRecord.split(",");
            }
            case EIS2_DATA_FILE: {
                return rawDataRecord.split(";");
            }
            default: return null;
        }
    }

    public static String extract(RecordType recordType) {
        valueOf("EIS3");

        return null;
    }

    public static boolean load(String[] data) {

        return false;
    }
}
