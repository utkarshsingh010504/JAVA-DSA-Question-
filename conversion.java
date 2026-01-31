import java.util.Scanner;
public class conversion {
    public static void kgtop()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value of a in Kg: ");
        double a=in.nextDouble();
        System.out.println("Pound= "+(a*2.205));
    }
    public static void mtoi()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value of a in meter: ");
        double a=in.nextDouble();
        System.out.println("inches= "+(a*39.3701));
    }
    public static void ctof()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value of a in celcius: ");
        double a=in.nextDouble();
        System.out.println("Farhenhiet= "+((a*(9/5))+32));
    }
    public static void Dtor()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value of a in Dollar: ");
        double a=in.nextDouble();
        System.out.println("Rupee = "+(a*83.2));
    }
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int i = 1;
        while (i == 1) {
            System.out.println("Select the option: ");
            System.out.println("---------------------");
            System.out.println("1.kgtop\n2.mtoi\n3.ctof\n4.Dtor\n5.Quit");
            int option = s1.nextInt();
            switch (option) {
                case 1:
                    kgtop();
                    break;
                case 2:
                    mtoi();
                    break;
                case 3:
                    ctof();
                    break;
                case 4:
                    Dtor();
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
