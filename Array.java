import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        int[] a = {10,20,30,5};
        for(int i =0 ; i<a.length;i++){
            if(a[3]==5) {
                System.out.println("Element not found");
                break;
            }
        }
    }
}
