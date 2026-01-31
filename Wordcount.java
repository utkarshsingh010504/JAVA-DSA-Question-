import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Wordcount {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("C:\\Users\\UTKARSH SINGH\\OneDrive\\Desktop\\JAVA\\JAVA DSA\\New\\abc.txt"))) {
            int wordCount = 0;
            while (scanner.hasNext()) {
                scanner.next();
                wordCount++;
            }
            System.out.println("Word count: " + wordCount);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

