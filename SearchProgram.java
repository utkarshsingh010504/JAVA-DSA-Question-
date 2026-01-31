import java.util.Scanner;

public class SearchProgram {

    // Linear Search
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // Iterative Binary Search
    public static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    // Recursive Binary Search
    public static int recursiveBinarySearch(int[] arr, int target, int low, int high) {
        if (low > high) return -1;
        int mid = low + (high - low) / 2;
        if (arr[mid] == target) return mid;
        else if (arr[mid] > target) return recursiveBinarySearch(arr, target, low, mid - 1);
        else return recursiveBinarySearch(arr, target, mid + 1, high);
    }

    // Two Pointer Search
    public static int twoPointerSearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            if (arr[left] == target)
                return left;
            if (arr[right] == target)
                return right;
            left++;
            right--;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements in sorted array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " sorted elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element to search: ");
        int target = sc.nextInt();

        System.out.println("\nChoose Search Method:");
        System.out.println("1. Linear Search");
        System.out.println("2. Binary Search (Iterative)");
        System.out.println("3. Binary Search (Recursive)");
        System.out.println("4. Two Pointer Search");
        System.out.print("Enter your choice (1-4): ");
        int choice = sc.nextInt();

        int result = -1;

        switch (choice) {
            case 1:
                result = linearSearch(arr, target);
                break;
            case 2:
                result = binarySearch(arr, target);
                break;
            case 3:
                result = recursiveBinarySearch(arr, target, 0, arr.length - 1);
                break;
            case 4:
                result = twoPointerSearch(arr, target);
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        if (result == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index: " + result);
        }

        sc.close();
    }
}
