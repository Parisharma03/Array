import java.util.*;
public class AlternatePositiveNegative {
    public static void main(String[] args) {
        //arr[] = [1, 2, 3, -4, -1, 4]
       // Output: arr[] = [1, -4, 2, -1, 3, 4]
        int[] arr = {1, 2, 3, -4, -1, 4};
        apn(arr);
    }
    static void apn(int [] arr){
        int posnum=0;
        int negnum=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>=0){
                posnum++;
            }
            else {
                negnum++;
            }
        }
        int[] newpos=new int[posnum];
        int[] newneg=new int[negnum];
        int p=0, q=0;
        for (int i = 0; i< arr.length; i++) {
            if(arr[i]>=0) {
                newpos[p++]=arr[i];
            }else {
                newneg[q++]=arr[i];
            }
        }
            int i=0,j=0,k=0;
            while (i < posnum && j < negnum) {
                arr[k++]=newpos[i++];
                arr[k++]=newneg[j++];
            }
            while(i<posnum){
                arr[k++]=newpos[i++];
        }
            while (j<negnum){
                arr[k++]=newneg[j++];
            }
        System.out.println(Arrays.toString(arr));
    }
}

