import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class throwfile {
    public static void main(String args[]) throws IOException {
        readfile();
    }
    public static void readfile() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\UTKARSH SINGH\\OneDrive\\Desktop\\JAVA\\JAVA DSA\\old\\Singh.txt"));
        System.out.println(br.readLine());
        br.close();
    }
}
