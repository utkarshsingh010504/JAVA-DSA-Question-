import java.util.*;
public class linearsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length:");
        int size = sc.nextInt();
        int []arr = new int[size];
        System.out.println("Enter the element:");
        for (int i = 0; i < size; i++)
        arr[i] = sc.nextInt();  
        System.out.println("Enter element to be searched:");
        int elem = sc.nextInt();  
        int index = -1;
        for (int i = 0; i < size; i++){
        if(elem==arr[i]){
        index = i;
        break;    
        }
            
        }
        System.out.println("Element is found at index:"+index);
    }
    
}
