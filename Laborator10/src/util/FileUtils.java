package util;

import java.io.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileUtils {

    public static String[] readDbInfoFromCsv(String fileName) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        String[] dbInfo = bufferedReader.readLine().split(",");

        return dbInfo;

    }

    public static String convertToCSV(String[] item){
        return Stream.of(item).
                collect(Collectors.joining(","));
    }

    public static void writeToCsv(String fileName, List<String[]> content) throws FileNotFoundException {
        File file = new File(fileName);
        try (PrintWriter printWriter = new PrintWriter(file)){
            content.stream()
                    .map(item -> convertToCSV(item))
                    .forEach(printWriter::println);
        }
    }
}
