import java.util.PriorityQueue;
import java.util.Queue;
public class queue3 {
    public static void main(String []args){
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(1);
        queue.add(2);
        queue.add(8);
        queue.add(5);
        queue.add(-1);
        System.out.println(queue.poll());
    }
}
