package Programs.Strings;

public class countOfVowelsAndConsonants {
    public static void main(String args[]){

        String str = "elephant";
        char[] c = str.toCharArray();
        int vowelCount =0, consonentCount = 0;

        for(int i=0;i<c.length;i++){
            if(c[i] == 'a'|| c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u'){
                vowelCount++;
            }
            else if(c[i] == ' ') continue;
            else{
                consonentCount++;
            }
        }

        System.out.println("vowel count -- "+vowelCount+" consonent count -- "+consonentCount);
    }
}
