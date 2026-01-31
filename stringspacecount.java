
import java.util.*;

public class stringspacecount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence:");
        String a = sc.nextLine();
        int count = 0;
        for (int i = a.length() - 1; i >= 0; i--) {
            if (a.charAt(i) == ' ') {
                count += 1;
            }
        }
        System.out.println(count);
    }
}
