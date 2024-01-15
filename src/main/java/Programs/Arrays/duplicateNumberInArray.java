package Programs.Arrays;

import java.util.Arrays;

//How do you find the duplicate number on a given integer array?
public class duplicateNumberInArray {
    public static void main(String args[]){
        int arr[] = {1, 1, 2, 2, 3, 4, 5};

        Arrays.sort(arr);

        int res[] = new int[arr.length];
        int previous = arr[0];
        res[0] = previous;

        for(int i=1;i<arr.length;i++){
            if(previous != arr[i]){
                res[i]=arr[i];
            }
            previous = arr[i];
        }

        System.out.println(Arrays.toString(res));
    }
}
