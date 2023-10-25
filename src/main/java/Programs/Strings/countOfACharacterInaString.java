package Programs.Strings;

//How do you count the occurrence of a given character in a string?
public class countOfACharacterInaString {
    public static void main(String args[]){
        String s = "Tea stall is there";
        s.trim();
        int cnt =0;
        char[] ch = s.toCharArray();

        for (char c: ch) {
            if(c == 't')
                cnt++;
        }

        System.out.println("Count is -- "+cnt);

    }

}
