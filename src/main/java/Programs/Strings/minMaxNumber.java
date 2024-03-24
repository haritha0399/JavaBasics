package Programs.Strings;

public class minMaxNumber {
    public static void main(String[] args) {

        int arr[] = {45,90,2,67,100,578};

        int min = arr[0];
        int max = arr[arr.length - 1];

        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }

        System.out.println("Minimum number is "+min);
        System.out.println("Maximum number is "+max);
    }
}
