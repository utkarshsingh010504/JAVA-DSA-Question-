import java.util.*;

public class Sortingproblem {
    public static void bubblesort(int []arr ){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            boolean swapped = false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
    }

    public static void Selectionsort(int []arr ) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            }
            int temp = arr[i];
            arr[i]= arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void InsertionSort(int []arr ) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j] >key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("\nChoose Sort Method:");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Selection Sort");
        System.out.println("3. Insertion Sort");
        System.out.print("Enter your choice (1-4): ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                bubblesort(arr);
                System.out.println("Sorted array using bubblesort is:");
                for (int value : arr) {
                    System.out.print(value + "   ");
                }
                break;
            case 2:
                Selectionsort(arr);
                System.out.println("Sorted array using selectionsort is:");
                for (int value : arr) {
                    System.out.print(value + "   ");
                }
                break;
            case 3:
                InsertionSort(arr);
                System.out.println("Sorted array insertionsort is:");
                for (int value : arr) {
                    System.out.print(value + "   ");
                }
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }
        System.out.println();
    }
}


