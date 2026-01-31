import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class Details{
    public static void Bhagatsingh() {
        try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\UTKARSH SINGH\\OneDrive\\Desktop\\JAVA\\JAVA DSA\\New\\Bhagat Singh.txt"))){
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void Narendramodi() {
        try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\UTKARSH SINGH\\OneDrive\\Desktop\\JAVA\\JAVA DSA\\New\\Modi jii.txt"))){
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void Yogiadityanath() {
        try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\UTKARSH SINGH\\OneDrive\\Desktop\\JAVA\\JAVA DSA\\New\\Yogi adityanath.txt"))){
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void Amitshah() {
        try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\UTKARSH SINGH\\OneDrive\\Desktop\\JAVA\\JAVA DSA\\New\\Amit Shah.txt"))){
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 1;
        while (a == 1) {
            System.out.println("Choose option:");
            System.out.println("1.Bhagat Singh\n2.Narendra modi\n3.Yogi aditynath\n4.Amit shah");
            System.out.println("Enter choice:");
            int option = in.nextInt();

        switch (option) {
            case 1:
                Bhagatsingh();
                break;
            case 2:
                Yogiadityanath();
                break;
            case 3:
                Narendramodi();
                break;
            case 4:
                Amitshah();
                break;
            default:
                System.out.println("Invalid option");
            }
        }
    }
}


