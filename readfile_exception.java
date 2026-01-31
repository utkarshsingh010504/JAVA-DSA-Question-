import java.io.File;
import java.io.IOException;
public class readfile_exception {
    public static void main(String args[]){
        try{
            File directory = new File("old");
            if(!directory.exists()){
                directory.mkdir();
                System.out.println("Directory created:" +directory.getName());
            }
            File file = new File(directory,"Singh.txt");
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
