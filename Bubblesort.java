public class Bubblesort {
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
    public static void main(String args[]) {
        int num[] = {2, 3, 12, 1,7};
        bubblesort(num);
        System.out.println("Sorted array is:");
        for(int value:num){
            System.out.println(value+ "   ");
        }
    }
}
