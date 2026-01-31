import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
public class checkinglist {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        System.out.println("Enter the no. of element:");
        int noofelements = sc.nextInt();
        sc.nextLine();
        for(int i = 0;i<noofelements;i++) {
            System.out.println("Enter the Element"+(i+1)+":");
            list.add(sc.nextInt());
        }
        System.out.println("Elements in list:");
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            if(iterator.next().equals(7)){
                System.out.println("Found");
            }
            else{
                System.out.println("Not found");
            }
        }
    }
}
