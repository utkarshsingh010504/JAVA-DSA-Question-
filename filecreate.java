import java.io.File;
import java.io.IOException;
import java.util.*;
public class filecreate {
    public static void main(String args[]){
        try{
            File directory = new File("New");
            if(!directory.exists()){
                directory.mkdir();
                System.out.println("Directory created:" +directory.getName());
            }
            File file = new File(directory,"abc.txt");
            if (file.createNewFile()){
                System.out.println("File created:"+file.getName());
            }
            else {
                System.out.println("File already exist.");
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
