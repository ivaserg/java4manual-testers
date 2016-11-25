package com.db.edu.etl;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

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
            case EIS3_DATA_FILE: {
                return rawDataRecord.split("|");
            }
            default: return null;
        }
    }

    public static List<String[]> transformBatch(RecordType recordType, String[] rawData) {

        List<String[]> resultList = new ArrayList<>();

        for (String rawDataString: rawData
             ) {

            resultList.add(Controller.transform(recordType, rawDataString));

        }


        return resultList;
    }

    public static String[] extract(RecordType recordType) {


        return null;
    }

    public static boolean load(List<String[]> data) {

        return false;
    }
}
