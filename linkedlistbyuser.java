import java.util.Scanner;
import java.util.LinkedList;
public class linkedlistbyuser {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        System.out.println("Enter the no. of element:");
        int noofelements = sc.nextInt();
        for(int i = 0;i<noofelements;i++) {
            System.out.println("Enter the Element:");
            list.add(sc.nextInt());
        }
        System.out.println(list);
    }
}
