package Programs.Comcast.LinkedInTop9Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.binarySearch;

public class BinarySearc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        System.out.println("Enter the elements one by one");
        int[] arr = new int[size];

        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target element");
        int targetElement = sc.nextInt();
//        System.out.println("Target element is "+targetElement);
        Arrays.sort(arr);
        int indexFound  = binarySearchMethod(arr,targetElement);
        System.out.println("Element found at index "+indexFound);


    }

    private static int binarySearchMethod(int[] arr, int targetElement) {
        int start = 0;
        int end  = arr.length;

        while(start<=end) {
            int mid = (start + end) / 2;
            if (arr[mid] == targetElement) {
                return mid;
            } else if (arr[mid] > targetElement) {
                end = end - 1;
            } else if (arr[mid] < targetElement) {
                start = start + 1;
            }
        }
        return -1;
    }
}
