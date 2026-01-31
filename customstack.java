import java.util.Scanner;
import java.util.Stack;
public class customstack {
    private int[]stack;
    private int top;
    private int capacity;
    public customstack(int size){
        stack = new int[size];
        capacity = size;
        top = -1;
    }
    public void push(int value){
        if(isFull()){
            System.out.println("Stack Overflow:");
            return;
        }
        stack[++top] = value;
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }
    public boolean isEmpty(){
        return top ==-1;
    }
    public boolean isFull(){
        return top == capacity-1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.println("Enter the no. of element:");
        int noofelements = sc.nextInt();
        for(int i = 0;i<noofelements;i++) {
            System.out.println("Enter the Element to be pushed:");
            stack.push(sc.nextInt());
        }
        System.out.println("Top element is:"+stack.peek());
        System.out.println("Popped element is:"+stack.peek());
        System.out.println("Stack is empty ?i:"+stack.isEmpty());
    }
}
