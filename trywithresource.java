import java.io.*;
public class trywithresource {
    public static void main(String []args){
        try(BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\UTKARSH SINGH\\OneDrive\\Desktop\\JAVA\\JAVA DSA\\old\\Singh.txt"))){
            System.out.println(reader.readLine());
        }
        catch (IOException e){
            System.out.println("Error reading file:"+e.getMessage());
        }
    }
}
