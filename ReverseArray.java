import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int [] arr={1, 4, 3, 2, 6, 5};
        Reverse.reverse(arr);
    }
}
class Reverse {
    static void reverse(int[] arr) {
        int length=arr.length;
        int[] temp=new int[length];
        for (int i = 0; i <=length-1; i++) {
            temp[i]=arr[length-i-1];
        }
        for (int i = 0; i <=length-1 ; i++) {
            arr[i]=temp[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
