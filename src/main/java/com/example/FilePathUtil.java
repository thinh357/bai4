package com.example;

/**
 * Utility class for file path operations.
 * Intentionally uses hard-coded backslash (Windows only).
 */
public class FilePathUtil {

    /**
     * Builds a file path by concatenating directory and filename
     * using a fixed backslash separator.
     *
     * @param directory the directory path
     * @param filename  the filename
     * @return the full path
     */
    public static String buildPath(String directory, String filename) {
        // Cố tình dùng \ (Windows), sẽ gây lỗi trên Linux/macOS khi so với File.separator
        return directory + "\\" + filename;
    }
}