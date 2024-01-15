package Programs.SortingTechniques;

import java.util.Scanner;

//Big O Notation - O(n)
public class LinearSearch {
    public static void main(String args[]){
        int nums[] = {2,4,5,6,7};
        int target = 6;

//        Scanner sc = new Scanner(System.in);
        int result = doLinearSearch(nums,target);
        System.out.println("I can find the target element in the array at index: "+result);
    }

    public static int doLinearSearch(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }
}
