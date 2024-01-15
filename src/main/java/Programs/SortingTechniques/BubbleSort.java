package Programs.SortingTechniques;

//Big O Notation - O(n^2)

public class BubbleSort {
    public static void main(String args[] ){

        int nums[] = {4,3,67,90,65,22,101,1};
        int size = nums.length;
        int temp;

        System.out.println("--- Before sorting ---");
        for(int num: nums){
            System.out.print(num+" ");
        }

        for(int i=0;i<size-1;i++){

            //Reason for adding i is to ignore the already sorted array at the end
            for(int j=0;j<size-i-1;j++){
                if(nums[j] > nums[j+1]){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }


        System.out.println();
        System.out.println("--- After sorting ---");
        for(int num: nums){
            System.out.print(num+" ");
        }
    }
}
