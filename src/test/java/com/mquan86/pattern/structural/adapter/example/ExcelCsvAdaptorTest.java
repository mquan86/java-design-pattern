package com.mquan86.pattern.structural.adapter.example;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ExcelCsvAdaptorTest {
    @Mock
    private CsvFile csvFile;

    @Test
    public void testSave() throws Exception {
        ExcelCsvAdaptor excelCsvAdaptor = new ExcelCsvAdaptor(csvFile);
        excelCsvAdaptor.save();

        verify(csvFile, times(1)).write();
    }

}
