class ThirdLargestElement{
    public static void main(String[] args) {
        int [] arr={12,2,4,23,22};
        int res=ThirdLE.getThirdLargest(arr);
        System.out.println(res);
    }
}
class ThirdLE{
    static int getThirdLargest(int [] arr){
    int first=Integer.MIN_VALUE;
    int second=Integer.MIN_VALUE;
    int third=Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            if(first<arr[i]){
                third=second;
                second=first;
                first=arr[i];
            }
            else if(second<arr[i]){
                third=second;
                second=arr[i];
            } else if(third<arr[i]) {
                third=arr[i];
            }
        }
        return third;
    }
}
