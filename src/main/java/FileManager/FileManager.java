package FileManager;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileManager {
    public static void main(String[] args) {
        String file = "LegionFile.txt";

        FileManager fileManager = new FileManager();
        fileManager.createFile(file);
        fileManager.writeToFile(file, "Answer July\n" +
                "Where is the Bee—\n" +
                "Where is the Blush—\n" +
                "Where is the Hay?\n" +

                "Ah, said July—\n" +
                "Where is the Seed—\n" +
                "Where is the Bud—\n" +
                "Where is the May—\n" +
                "Answer Thee—Me—\n" +

                "Nay—said the May—\n" +
                "Show me the Snow—\n" +
                "Show me the Bells—\n" +
                "Show me the Jay!");

        fileManager.readFromFile(file);
        fileManager.deleteFile(file);

    }

    public void createFile(String fileName) {
        File file = new File(fileName);

        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void writeToFile(String fileName, String text) {

        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write(text);
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Error, cannot write...");
            throw new RuntimeException(e);
        }

    }

    public void readFromFile(String fileName) {
        File file = new File(fileName);
        try {
            Scanner scanner = new Scanner(file);
//            while(scanner.hasNextLine()){
//                String row = scanner.nextLine();
//                System.out.println(row);
//            }
            for (int i = 0; scanner.hasNextLine(); i++) {
                String row = scanner.nextLine();
                System.out.println(i);
                System.out.println(row);
            }
            scanner.close();


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    public void deleteFile(String fileName) {
        File file = new File(fileName);
        if (file.exists()) ;
        {
            file.delete();
        }


    }
}