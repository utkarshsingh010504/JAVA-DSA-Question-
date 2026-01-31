import java.sql.SQLOutput;
import java.util.ArrayDeque;
import java.util.Queue;
public class deque1 {
    public static void main(String[] args){
        Queue<String> deque = new ArrayDeque<>();
        deque.offer("B");
        deque.offer("C");
        System.out.println(deque.offer("A"));
        System.out.println("Queue is:"+deque);
        System.out.println("Is queue empty?"+deque.isEmpty());
        System.out.println("removed element:"+deque.remove());
        System.out.println("queue size?"+deque.size());
    }
}
