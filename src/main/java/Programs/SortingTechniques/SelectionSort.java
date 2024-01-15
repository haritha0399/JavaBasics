package Programs.SortingTechniques;

//Big O Notation - O(n^2)
//Number of swaping is less when compared with the bubble sort

public class SelectionSort {
    public static void main(String args[]){
        int nums[] = {5,9,8,2,77,34,1,56};
        int size = nums.length;
        int minIndex = -1;
        int temp = 0;

        System.out.println("--- Before sorting ---");
        for(int num : nums){
            System.out.print(num+" ");
        }

        for(int i=0;i<size-1;i++){
            minIndex = i;

            //Getting the smallest element
            for(int j=i+1;j<size;j++){
                if(nums[minIndex] > nums[j]){
                    minIndex = j;
                }
            }
            temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i]= temp;
        }

        System.out.println();
        System.out.println("--- After sorting ---");
        for(int num : nums){
            System.out.print(num+" ");
        }
    }
}
