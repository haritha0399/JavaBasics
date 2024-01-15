package Programs.Arrays;

//How do you find the missing number in a given integer array of 1 to 100?
public class missingNumberInArray {
    public static void main(String args[]){
        int[] arr = { 1, 2, 3, 5 };
        int sum =0;
        int n = arr.length;
        sum =( (n+1) * (n+2)) /2;
        for(int i=0;i<n;i++){
            sum -=arr[i];
        }

        System.out.println(sum);

    }
}
