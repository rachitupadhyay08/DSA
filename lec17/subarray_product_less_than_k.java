package lec17;

public class subarray_product_less_than_k {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,2};
        int k=10;
        System.out.println(subarray_product_less_than(arr, k));
        
    }
    public static int subarray_product_less_than(int[] arr,int k){
        int p=1;
        int si=0;
        int ei=0;
        int ans=0;
        while(ei<arr.length){
            // growing
            p=p*arr[ei];
            //shrinking
            while(p>=k  && si<=ei ){
                p=p/arr[si];
                si++;
            }
            //cal
            ans = ans + (ei-si+1);
            ei++;
        }
        return ans;
    } 
}
// Variable size sliding window.
