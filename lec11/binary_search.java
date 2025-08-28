package lec11;

public class binary_search {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,7,8,9,11,13,17,18,19,20,21};
        int item=13;
        System.out.println(search(arr, item));
        
    }
    public static int search(int[] arr,int item){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==item){
                return mid;
            }
            else if(arr[mid]>item){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }  
}
// Binary search  is a searching algorithm.
// binary search sorted search space / sorted array pr lgta h.
