package Programs.Strings;

public class nonRepeatingCharacterInAString {

    public static int getIndex(String str){
        boolean flag =false;
        for (int i = 0; i < str.length();i++){
            flag =false;
            for(int j=0;j< str.length();j++){
                if(str.charAt(i) == str.charAt(j) && i!=j){
                    flag = true;
                    break;
                }
            }
            if(!flag) return i;
        }
        return 0;

    }
    public static void main(String args[]) {
        String str = "leetcode";

        System.out.println("Return the index of the first occurance character -- "+getIndex(str));

    }
}
