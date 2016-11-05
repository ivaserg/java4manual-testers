package com.db.edu.etl;

public class Controller {
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
}
