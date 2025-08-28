package lec9;

public class rotate_array2 {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7};
        int k=3;
        rotate_array(arr, k);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void rotate_array(int[] arr,int k){
        int n=arr.length;
        k=k%n;
        reverse(arr,0,n-1);
        reverse(arr, 0,k-1);
        reverse(arr,k,n-1);

    }
    public static void reverse(int[] arr,int i, int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}

// optimized
