import java.util.*;
public class Strongnumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num =sc.nextInt();
        int x = num;
        int fact = 0;
        while(num>0){
            int digit = num%10;
            int sum = 1;
            for(int i=digit;i>0;i--){
                sum*=i;
            }
        fact+=sum;
        num/=10;
        }
        if(x==fact){
            System.out.println("Entered number is Strong number");
        }
        else{
            System.out.println("Entered number is not a Strong number");
        }    
    }

}
