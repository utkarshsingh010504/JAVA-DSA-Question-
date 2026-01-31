import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
public class sortinglinkedlist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        System.out.println("Enter the no. of element:");
        int noofelements = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < noofelements; i++) {
            System.out.println("Enter the Element" + (i + 1) + ":");
            list.add(sc.nextInt());
        }
        Collections.sort(list);
        System.out.println(list);
    }
}

