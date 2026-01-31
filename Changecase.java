import java.util.*;
public class Changecase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String a = sc.nextLine();
        String str = "";
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (Character.isUpperCase(ch)) {
                str = str + Character.toLowerCase(ch);
            } else {
                str = str + Character.toUpperCase(ch);
            }
        }
        System.out.println("Changedcase String:" + str);
    }

}
