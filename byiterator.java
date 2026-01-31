import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
public class byiterator {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();
        System.out.println("Enter the no. of element:");
        int noofelements = sc.nextInt();
        sc.nextLine();
        for(int i = 0;i<noofelements;i++) {
            System.out.println("Enter the Element"+(i+1)+":");
            list.add(sc.nextLine());
        }
        System.out.println("Elements in list:");
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}