package Programs.Comcast.LinkedInTop9Questions;

import java.util.Scanner;

public class FibonacciSeries {
    static int a = 0, b=1;
    static int sum = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Without Recursion: Enter the number :");
        int n = sc.nextInt();

        int n1 =0, n2 = 1;
        System.out.print(n1+" "+n2+" ");
        int sum=0;

        for(int i=2;i<n;i++){
            sum = n1+n2;
            System.out.print(sum+" ");
            n1 = n2;
            n2 = sum;
        }
        System.out.println();

        System.out.println("With Recursion: Enter the number :");
        int m = sc.nextInt();
        System.out.print(a+" "+b+" ");
        getTheFibonacciSeries(m-2); // first two elements are printed
    }



    private static void getTheFibonacciSeries(int number) {

       if(number>0){
            sum = a+b;
            System.out.print(sum+" ");
            a = b;
            b = sum;
            getTheFibonacciSeries(number-1);
        }

    }
}
