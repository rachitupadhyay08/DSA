package lec8;

public class arrays_swap2 {
    public static void main(String[] args) {
        int arr[] = {3, 5, 1, 7, 8}; // c type declaration
        System.out.println(arr[0]+" "+arr[1]);
        swap(arr,0,1);
        System.out.println(arr[0]+" "+arr[1]);
    }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;   // this swaps the values . kyuki heap ke andr jaakr location pr changes kr rhe h.
    }   
}
