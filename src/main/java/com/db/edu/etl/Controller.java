package com.db.edu.etl;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

import static org.apache.commons.math3.util.Precision.round;


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
            case ES4_DATA_FILE: {
                return rawDataRecord.split(":");
            }
            default: return null;
        }
    }

    public static int[] transformBatch(RecordType recordType, int[] rawData) {

        if (rawData.length == 0) {
            logger.info("Input array is empty");
            return rawData;
        }
        int sum = 0;
        float average = 0f;
        for (int i: rawData) {
            sum = sum + i;
        }

        average = (float) sum / rawData.length;

        logger.info("The average value of data in the array is {}", round(average, 3)  );

        return rawData;
    }

    public static List<String[]> transformBatch(RecordType recordType, String[] rawData) {

        List<String[]> resultList = new ArrayList<>();

        for (String rawDataString: rawData) {
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
