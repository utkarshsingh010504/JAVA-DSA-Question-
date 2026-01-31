import java.util.LinkedList;
import java.util.Scanner;
public class Listmethod{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        System.out.println("Enter the Element:");
        list.add(sc.nextInt());
        System.out.println("Enter the Element to be added in last:");
        list.addLast(sc.nextInt());
        System.out.println("Enter the Element to be added in first:");
        list.addFirst(sc.nextInt());
        System.out.println(list);
    }
}
