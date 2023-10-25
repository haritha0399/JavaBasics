package Programs.Strings;

public class palindrome {

    public static boolean checkIfPalidrome(String str){
        String temp = "";
        String reverseString = "";
        temp = str.replaceAll("[^0-9A-Za-z]","").toLowerCase();
        reverseString = new StringBuilder(temp).reverse().toString();
        return temp.equals(reverseString);
    }
    public static void main(String args[]){
        String str = "A man, a plan, a canal: Panama";
        System.out.println("Palindrome or not --");
        boolean res = checkIfPalidrome(str);
        System.out.println(res);
    }
}
