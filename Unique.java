import java.util.*;
public class Unique{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            
        }
        Arrays.sort(arr);
        int b[] = new int[arr.length];
        b[0] = arr[0];
        int index = 1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] != arr[i-1]){
                b[index] = arr[i];
                index++;
            }  
        }
        System.out.println("Elements");
        for(int i=0; i<index; i++){
            System.out.println(b[i]);
        }

        
    }
    
}
