package Programs.Comcast.LinkedInTop9Questions;

import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to reverse");
        int num1 = sc.nextInt();
        int rev = 0;
        while(num1!=0){
            rev =  rev*10 + num1%10;
            num1 = num1/10;
        }
        System.out.println("Post reversal with while loop: "+rev);


        //Using StringBuffer - threadsafe
        System.out.println("Enter the number to reverse with String Buffer");
        int num2 = sc.nextInt();
        StringBuffer sb = new StringBuffer(num2);
        System.out.println("Post reversal with StringBuffer "+sb.reverse());

        //Using string concatination
        System.out.println("Enter the number to reverse with String concatenation");
        String str1 = "Haritha";
        int str1_length = str1.length();
        String reverseString = "";
        for(int i=str1_length-1;i>=0;i--){
            reverseString = reverseString+str1.charAt(i);
        }
        System.out.println("Post reversal with String concatination "+reverseString);


        //Using charArray
        System.out.println("Enter the number to reverse with char Array");
        String str2 = "Vignesh";
        int str2_length = str2.length();
        char c[] = str2.toCharArray();
        String revString2 = "";
        for(int i=str2_length-1;i>=0;i--){
            revString2 = revString2+c[i];
        }
        System.out.println("Post reversal with String char array "+revString2);

    }
}
