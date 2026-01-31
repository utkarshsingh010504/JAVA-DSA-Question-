import java.util.Scanner;
public class m1 {
    public static void add()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a=in.nextInt();
        System.out.println("Enter the value b: ");
        int b= in.nextInt();
        System.out.println("Sum= "+(a+b));
    }
    public static void sub()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a=in.nextInt();
        System.out.println("Enter the value b: ");
        int b= in.nextInt();
        System.out.println("Sub= "+(a-b));
    }
    public static void mul()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a=in.nextInt();
        System.out.println("Enter the value b: ");
        int b= in.nextInt();
        System.out.println("Multiplication= "+(a*b));
    }
    public static void div()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a=in.nextInt();
        System.out.println("Enter the value b: ");
        int b= in.nextInt();
        System.out.println("Division = "+(a/b));
    }

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int i = 1;
        while (i == 1) {
            System.out.println("Select the option: ");
            System.out.println("---------------------");
            System.out.println("1.Add\n2.Sub\n3.mul\n4.div\n5.Quit");
            int option = s1.nextInt();
            switch (option) {
                case 1:
                    add();
                    break;
                case 2:
                    sub();
                    break;
                case 3:
                    mul();
                    break;
                case 4:
                    div();
                    break;
                case 5:
                    i++;
                    break;
                default:
                    System.out.println("this is invalid option chosen: ");

            }


        }
        System.out.println("Thank you");
    }

}
