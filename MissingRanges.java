public class MissingRanges {
    public static void main(String[] args) {
    int []arr={14, 15, 20, 30, 31, 45};
    //output=[[10, 13], [16, 19], [21, 29], [32, 44], [46, 50]]
    int lower=10;
    int upper=50;
    missingRanges(arr,lower,upper);
    }
    static void missingRanges(int[] arr,int lower,int upper){
        System.out.print("[");
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] > lower) {
                System.out.print("[" + lower + " " + (arr[i] - 1) + "]"+",");
            }
            lower = arr[i] + 1;
        }
            if(lower<upper){
                System.out.print("["+ lower+" " +upper+"]");
            }
        System.out.print("]");
    }
}
