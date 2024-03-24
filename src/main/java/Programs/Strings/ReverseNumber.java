package Programs.Strings;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int rev = 0;
         int numb =  sc.nextInt();

         while(numb!=0){
             rev =  rev *10 + numb %10;
             numb = numb/10;
         }

        System.out.println("Reverse number is "+rev );
    }

}
