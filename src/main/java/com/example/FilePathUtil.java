package com.example;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Utility class for file path operations, now portable.
 */
public class FilePathUtil {

    /**
     * Builds a file path using Java NIO, which handles separators automatically.
     *
     * @param directory the directory path
     * @param filename  the filename
     * @return the full path as string
     */
    public static String buildPath(String directory, String filename) {
        Path path = Paths.get(directory, filename);
        return path.toString();
    }
}