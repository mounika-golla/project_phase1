package phase1_project;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class FileOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String filePath = "mounika.txt";

        try {
            
            createFile(filePath);

            writeToFile(filePath, "Hii, this is some content in the file.");

            List<String> content = readFromFile(filePath);
            System.out.println("Content of the file:\n" + String.join("\n", content));

            updateFile(filePath, "Updated content in the file.");

            content = readFromFile(filePath);
            System.out.println("Updated content of the file:\n" + String.join("\n", content));

            deleteFile(filePath);

            System.out.println("File operations completed successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }

    private static void createFile(String filePath) throws IOException {
        Path path = Paths.get(filePath);
        if (Files.notExists(path)) {
            Files.createFile(path);
            System.out.println("File created: " + filePath);
        } else {
            System.out.println("File already exists.");
        }
    }

    private static void writeToFile(String filePath, String content) throws IOException {
        Path path = Paths.get(filePath);
        Files.write(path, content.getBytes(), StandardOpenOption.APPEND);
        System.out.println("Data written to the file.");
    }

    private static List<String> readFromFile(String filePath) throws IOException {
        Path path = Paths.get(filePath);
        return Files.readAllLines(path);
    }
    private static void updateFile(String filePath, String newContent) throws IOException {
        Path path = Paths.get(filePath);
        Files.write(path, newContent.getBytes());
        System.out.println("File updated.");
    }

    private static void deleteFile(String filePath) throws IOException {
        Path path = Paths.get(filePath);
        Files.deleteIfExists(path);
        System.out.println("File deleted: " + filePath);
    }
}

