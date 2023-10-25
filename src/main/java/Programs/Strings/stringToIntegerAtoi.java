package Programs.Strings;
// How do you convert a given String into int like the atoi()
public class stringToIntegerAtoi {

    public static int answer(String str){
        double result = 0;
        boolean negative = false;
        str.trim();
        int startIndex = 0;
        if(str.charAt(0)=='+' || str.charAt(0) == '-'){
            ++startIndex;
        }

        if(str.charAt(0) == '-'){
            negative = true;
        }

        for(int i= startIndex;i<str.length();i++){
            if(str.charAt(i) < '0' || str.charAt(i) > '9'){
                break;
            }
            int digit =  (int) (str.charAt(i) -'0');
            result = result*10 + digit;
        }

        if(negative){
            result = -result;
        }

        if(result < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        if(result > Integer.MAX_VALUE) return Integer.MAX_VALUE;

        return (int)result;
    }
    public static void main(String args[]){
        String str = "   -42";
        System.out.println("Return answer -- "+answer(str));

    }
}
