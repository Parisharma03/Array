import java.util.Arrays;

public class MoveOddDigitToRight {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        //eg [2,4,5,3,1];
        move(arr);
    }
    static void move(int []arr){
        int[] temp=new int[arr.length];
        int left=0;
        int right= arr.length-1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                temp[left++]=arr[i];
            }
            else {
                    temp[right--]=arr[i];
            }
        }
        System.out.println(Arrays.toString(temp));
    }
}
