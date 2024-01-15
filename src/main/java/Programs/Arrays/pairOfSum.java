package Programs.Arrays;

//How do you find all pairs of an integer array whose sum is equal to a given number?
public class pairOfSum {
    public static void main(String args[]){

        int a[] ={2,4,3,5,7,8,9};
        int k = 7;

        for(int i = 0; true; i++){
            int first_num = a[i];
            for(int j = i+1; j<a.length; j++){
                int second_num = a[j];

                if((first_num+second_num) == k){
                    System.out.printf("(%d,%d) %n",first_num,second_num);
                }
            }

        }
    }
}
