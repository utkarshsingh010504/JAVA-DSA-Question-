import java.util.*;
public class minmax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length:");
        int size = sc.nextInt();
        int []arr = new int[size];
        System.out.println("Enter the element:");
        for (int i = 0; i < size; i++)
        arr[i] = sc.nextInt();
        Arrays.sort(arr);
        System.out.println("The min element is:"+arr[0]);
        System.out.println("The max element is:"+arr[size-1]);
    }
    
}
