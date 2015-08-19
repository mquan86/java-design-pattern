package com.mquan86.pattern.behavior.strategy.example;

import static org.mockito.Matchers.anyList;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.io.File;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CompressionUtilTest {

    @Mock
    private ZipStrategy zipStrategy;

    @Mock
    private RarStrategy rarStrategy;

    @Mock
    private List<File> files;

    @Test
    @SuppressWarnings("unchecked")
    public void testCompress() throws Exception {
        CompressionUtil zipCompressionUtil = new CompressionUtil(zipStrategy);
        zipCompressionUtil.compress(files);
        verify(zipStrategy, times(1)).compress(anyList());

        CompressionUtil rarCompressionUtil = new CompressionUtil(rarStrategy);
        rarCompressionUtil.compress(files);
        verify(rarStrategy, times(1)).compress(anyList());
    }
}
