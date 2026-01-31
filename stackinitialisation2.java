import java.util.Scanner;
import java.util.Stack;
public class stackinitialisation2 {
     static Scanner sc = new Scanner(System.in);
     static Stack<String> stack = new Stack<>();
    public static void pop() {
        System.out.println("Enter the no. of element to br popped:");
        int noofelementpop = sc.nextInt();
        for (int j = 0; j < noofelementpop; j++) {
            System.out.println("Popped Element:" + stack.pop());
        }
    }
    public static void Isempty(){
        System.out.println("Is stack empty?:"+stack.isEmpty());
    }
    public static void peak(){
        System.out.println("Top element(peek):"+stack.peek());
    }
     public static void noofelement() {
        System.out.println("No. of elements are:"+stack.size());
     }
    public static void search() {
        System.out.println("Position of Ram:"+stack.search("Ram"));
    }
    public static void main(String []args){
        System.out.println("Enter the no. of element:");
        int noofelements = sc.nextInt();
        sc.nextLine();
        for(int i = 0;i<noofelements;i++) {
            System.out.println("Enter the Element to be pushed:");
            stack.push(sc.nextLine());
        }
        int a = 1;
        while (a == 1) {
            System.out.println("Choose option:");
            System.out.println("1.POP\n2.IsEmpty\n3.Peak\n4.No of emements \n5.Search");
            System.out.println("Enter choice:");
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    pop();
                    break;
                case 2:
                    Isempty();
                    break;
                case 3:
                    peak();
                    break;
                case 4:
                    noofelement();
                    break;
                case 5:
                    search();
                default:
                    System.out.println("Invalid option");
            }
        }
    }
}