import java.util.LinkedList;
import java.util.Scanner;
public class removinginlist {
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
        System.out.println("Enter the element index to be removed:");
        list.remove(sc.nextInt());
        System.out.println(list);
    }
}
