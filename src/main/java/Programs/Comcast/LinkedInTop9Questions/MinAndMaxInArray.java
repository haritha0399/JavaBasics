package Programs.Comcast.LinkedInTop9Questions;

import java.util.Scanner;

public class MinAndMaxInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        int min = arr[0] , max = arr[size-1];

        for(int i=0;i<size;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }

        for(int i=0;i<size;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }

        System.out.println("Minimum & maximum element of the given array is : "+min+" "+max);

    }
}
