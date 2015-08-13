package com.mquan86.pattern.structural.adapter.example;

/**
 * @author Minh Quan Pham (mquan86@gmail.com)
 *
 */
public class ExcelCsvAdaptor implements ExcelFile {
    private CsvFile csvFile;

    public ExcelCsvAdaptor(CsvFile csvFile) {
        this.csvFile = csvFile;
    }

    @Override
    public void save() {
        csvFile.write();
    }
}
