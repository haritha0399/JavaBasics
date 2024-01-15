package Programs.SortingTechniques;

public class MergeSort {

    //Dividing the array into chunks
    private static void mergeSort(int[] nums, int left, int right) {

        if(left < right){
            int mid = (left+right)/2;
            mergeSort(nums, left, mid);
            mergeSort(nums, mid+1 , right);
            merge(nums, left, mid, right);
        }
    }

    private static void merge(int[] nums, int left, int mid, int right) {

        int n1 = mid-left + 1;
        int n2 = right - mid;


        int lArr[] = new int[n1];
        int rArr[] = new int[n2];

        for(int i=0;i<n1;i++){
            lArr[i]=nums[left+i];
        }

        for(int i=0;i<n2;i++){
            rArr[i]=nums[mid+1+i];
        }

        int i=0, j=0, k = left;

        while(i<n1 && j<n2){
            if(lArr[i] <= rArr[j]){
                nums[k] = lArr[i];
                i++;
            }
            else {
                nums[k] = rArr[j];
                j++;
            }
            k++;
        }

        while(i<n1){
            nums[k] = lArr[i];
            i++;
            k++;
        }

        while(j<n2){
            nums[k] = rArr[j];
            j++;
            k++;
        }

    }

    public static void main(String args[]){
        int nums[] = {5,9,7,1,2,34};

        System.out.println("--- Before sorting ---");
        for(int num: nums){
            System.out.print(num+" ");
        }

        mergeSort(nums, 0 , nums.length-1);

        System.out.println();
        System.out.println("--- After sorting ---");
        for(int num: nums){
            System.out.print(num+" ");
        }

    }
}
