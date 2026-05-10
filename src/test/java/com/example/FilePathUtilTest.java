package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.File;

public class FilePathUtilTest {

    @Test
    public void testBuildPath() {
        String result = FilePathUtil.buildPath("data", "file.txt");
        // Mong đợi đường dẫn dùng đúng File.separator của hệ thống
        String expected = "data" + File.separator + "file.txt";
        assertEquals(expected, result);
    }
}