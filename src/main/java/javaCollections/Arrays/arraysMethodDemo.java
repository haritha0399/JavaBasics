package javaCollections.Arrays;

import java.util.Arrays;
import java.util.List;

public class arraysMethodDemo {
    public static void main(String args[]){


        //1. asList --> Convert Array to list
        Integer[] arrInt =  new Integer[] {12,13,45,87,32,55};
        List<Integer> list = Arrays.asList(arrInt);
        System.out.println(list);


        //2. Binary search
        int arr[] = {1,45,67,98,600,12};
        int result = Arrays.binarySearch(arr,98);
        System.out.println(result);

        //3. CopyOf & .toString()
        int arr2[] = {1,0,8,5};
        int resultArr2[] = Arrays.copyOf(arr2,5);
        resultArr2[4] = 4;
        System.out.println(Arrays.toString(resultArr2));

        //4. CopyOfRange
        int arr3[] = {1,3,5,6,10};
        int resultArr3[] = Arrays.copyOfRange(arr3,1,3);
        System.out.println(Arrays.toString(resultArr3));

        //5. DeepEquals --> compares two objects
        int[] arr4 = new int[]{1,2};
        int[] arr5 = new int[]{2,4};
//        boolean result1 = Arrays.deepEquals(arr4,arr5);

        //6. deepHashCode --> returns the hashcode associated with the object
        Integer[] arr6 = {1,3};
        System.out.println(Arrays.deepHashCode(arr6));

        //7. deepToString
        int[][] mat = new int[2][2];
        mat[0][0] = 99;
        mat[0][1] = 151;
        mat[1][0] = 30;
        mat[1][1] = 5;
        System.out.println(Arrays.deepToString(mat));

        //8. equals
        int a[] = {10,20,30};
        int b[] = {10,20,30};
        System.out.println(Arrays.equals(a,b));

        //9. fill
        int c[] = {1,3,5,8};
        Arrays.fill(c, 0);
        System.out.println(Arrays.toString(c));

        //10. hashcode
        System.out.println(Arrays.hashCode(c));

        //11.sort
        int srtArr[] ={4,3,21,98,54,44};
        Arrays.sort(srtArr);
        System.out.println(Arrays.toString(srtArr));


    }
}
