public class Binaryrecursivesearch {
    public static int binarysearch(int[]arr,int left,int right,int target){
        if(left > right)
            return -1;
        int mid = left +(right - left)/2;
        if (arr[mid]==target)
            return mid;
        else if (arr[mid]>target)
            return binarysearch(arr, left , mid-1,target);
        else
            return binarysearch(arr , mid+1 ,right , target );
        }
    public static void main(String args[]){
        int[]nums = {1,3,5,7,9,11,13};
        int target = 9;
        int index = binarysearch(nums, 0 ,nums.length-1,target);
        if(index != -1)
            System.out.println("Element found at index="+index);
        else
            System.out.println("Element not found");
    }
}
