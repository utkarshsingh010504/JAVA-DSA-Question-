import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writefile {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\UTKARSH SINGH\\OneDrive\\Desktop\\JAVA\\JAVA DSA\\New\\abc.txt"))) {
            writer.write("This is at kanpur");
            writer.newLine();
            System.out.println("Data written to the file.");
        } catch (IOException e) {
            e.printStackTrace();        }
    }
}
