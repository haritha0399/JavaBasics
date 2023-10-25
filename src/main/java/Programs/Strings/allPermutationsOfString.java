package Programs.Strings;


//How do you find all the permutations of a string?
public class allPermutationsOfString {

    static void permutation(String str,String ans){

        if(str.length() == 0){
            System.out.println(ans+ " ");
            return;
        }

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            String rem = str.substring(0,i) + str.substring(i+1);

            permutation(rem, ans+ch);
        }
    }
    public static void main(String args[]){

        String str = "abb";
        permutation(str, " ");

    }
}
