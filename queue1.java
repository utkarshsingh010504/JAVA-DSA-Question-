import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class queue1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        System.out.println("Enter the no of elements:");
        int size = sc.nextInt();
        for(int i= 0; i<size;i++){
            System.out.println("Enter the elements to be added:");
            queue.add(sc.nextInt());
        }
        System.out.println("Queue after adding elements:"+queue);
    }
}
