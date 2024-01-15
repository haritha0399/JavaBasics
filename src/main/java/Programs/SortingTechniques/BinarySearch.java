package Programs.SortingTechniques;

import java.util.Arrays;


//Big O Notation - O(log n)
public class BinarySearch {
    public static void main(String args[]){
        int nums[] = {2,35,89,7,10,45,11,5,101};
        int target =  89;

        int result = doBinarySearch(nums, target);
        System.out.println("I can find the target element in the array at index: "+result);
    }

    public static int doBinarySearch(int[] nums, int target) {
        Arrays.sort(nums);
        System.out.println("Sorted array is -- "+ Arrays.toString(nums));
        int start =0 ;
        int end = nums.length;
        int mid;

        while(start <= end)
        {
            mid = (start+end) /2;
            if(nums[mid] == target) {return mid;}
            else if(nums[mid] < target ){
                start = mid +1;}
                else if(nums[mid] > target){
                    end = mid -1;
                }
        }
        return -1;
    }


}
