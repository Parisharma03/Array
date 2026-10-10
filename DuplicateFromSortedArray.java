public class DuplicateFromSortedArray {
    public static void main(String[] args) {
        int[] arr={1,1,2,2,3,4,4,4,5,5};
        //Input: arr[] = [1, 2, 2, 3, 4, 4, 4, 5, 5]
        //Output: [1, 2, 3, 4, 5]
        remove(arr);
    }
    static void remove(int[] arr){
        int first=arr[0];
        System.out.print("["+first+" ");
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]!=arr[i-1]){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println("]");
    }
}
