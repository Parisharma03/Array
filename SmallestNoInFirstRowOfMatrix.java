public class SmallestNoInFirstRowOfMatrix {
    public static void main(String[] args) {
        int[][]arr={{9,2,3},{4,5,6}};
        smallestNo(arr);
    }
    static void smallestNo(int[][] arr){
        int small=Integer.MAX_VALUE;
        for (int i = 0; i <arr[0][arr.length] ; i++) {
            if(arr[0][i]<small){
                small=arr[0][i];
            }
        }
        System.out.println(small);
    }
}
