import java.util.Scanner;
import java.util.Stack;
public class Stackinitialisation {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.println("Enter the no. of element:");
        int noofelements = sc.nextInt();
        for(int i = 0;i<noofelements;i++) {
            System.out.println("Enter the Element to be pushed:");
            stack.push(sc.nextInt());
        }
        System.out.println("Enter the no. of element to br popped:");
        int noofelementpop = sc.nextInt();
        for(int j = 0;j<noofelementpop;j++) {
            System.out.println("Popped Element:"+stack.pop());
        }
        System.out.println("Is stack empty?:"+stack.isEmpty());
        System.out.println("Stack are:"+stack);
    }
}
