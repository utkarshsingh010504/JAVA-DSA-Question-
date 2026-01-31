public class TwoPointersearch {
    public static boolean haspairwithsum(int[]arr, int target){
        int left = 0, right = arr.length - 1;
        while(left < right){
            int sum = arr[left]+arr[right];
            if(sum == target)
                return true;
            else if(sum<target)
                left++;
            else
                right++;
        }
        return false;
    }
    public static void main(String args[]){
        int[] nums = {1,2,3,4,6,8};
        int target = 10;
        boolean found = haspairwithsum(nums , target);
        System.out.println("Pair Found="+found);
    }
}
