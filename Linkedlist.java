import java.util.LinkedList;
import java.util.Scanner;

public class Linkedlist {
    public static void main(String []args){
        LinkedList<String> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        list.add("Alice");
        list.add("Bob");
        list.add("Charlie");
        System.out.println(list);
    }
}
