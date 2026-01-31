
import java.util.*;

public class stringreverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String A = sc.nextLine();
        String str = " ";
        for (int i = A.length() - 1; i >= 0; i--) {
            str += A.charAt(i);
        }
        System.out.println(str);
    }

}
