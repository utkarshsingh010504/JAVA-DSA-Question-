import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class readfile {
    public static void main(String args[]){
        try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\UTKARSH SINGH\\OneDrive\\Desktop\\JAVA\\JAVA DSA\\New\\abc.txt"))){
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}