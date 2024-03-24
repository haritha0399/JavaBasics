package Programs.Comcast.LinkedInTop9Questions;

public class CharacterCountInString {
    public static void main(String[] args) {
        String str = "comcast";
        char[] ch = str.toCharArray();
        int count = 0;

        for(int i = 0; i<str.length(); i++){
            if(ch[i]!=' '){
                count++;
            }
        }
        System.out.println("Count of chars in the given string is "+count);
    }

}
