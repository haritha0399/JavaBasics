package Programs.SortingTechniques;


//Big O Notation - O(n log n)
public class QuickSort {
    public static void main(String args[]){

        int nums[] = {4,3,5,6,1,2};

        quickSort(nums, 0, nums.length - 1);
        System.out.println("Sorted quicksort : ");
        for(int num : nums){
            System.out.print(num+" ");
        }

    }

    public static void quickSort(int[] nums, int low, int high) {

        if(low < high){
            int pivot = partition(nums,low, high);

            quickSort(nums, low, pivot-1 );
            quickSort(nums, pivot+1 , high);
        }

    }

    private static int partition(int[] nums, int low, int high) {
        int pivot = nums[high];
        int i = low - 1;

        for(int j = low;j< high;j++){
            if(nums[j] < pivot)
            {
                i++;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }

        int temp = nums[i+1];
        nums[i+1] = nums[high];
        nums[high] = temp;

        return i+1;
    }
}
