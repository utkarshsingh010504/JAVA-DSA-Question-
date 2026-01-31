public class Selectionsort {
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
    public static void main(String args[]) {
        int num[] = {2, 3, 12,1,6};
        Selectionsort(num);
        System.out.println("Sorted array is:");
        for(int value:num){
            System.out.print(value+ "   ");
        }
    }
}
