import java.util.Stack;
public class stack {
    public static void main(String []args){
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack after pushes are:"+stack);
        System.out.println("Top elemnt(peek):"+stack.peek());
        System.out.println("Popped elemnt:"+stack.pop());
        System.out.println("Position of 10:"+stack.search(10));
        System.out.println("Is atack empty?:"+stack.isEmpty());
        System.out.println("Stack are:"+stack);
    }
}
