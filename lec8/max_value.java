package lec8;

public class max_value {
    public static void main(String[] args) {
        int[] arr={3,5,1,7,9,6};
        System.out.println(max(arr));

    }
    public static int max(int[] arr){
        int temp= Integer.MIN_VALUE;  // -2^31
       // Integer.MAX_VALUE               (2^(31) -1)
        for(int i=0; i<arr.length; i++){
            if(arr[i]>temp){
                temp=arr[i];
            }
        }
        return temp;
    }
    
}
// Math.max(m,arr[i])    this can be used as well to fimd the max of two numbers.