package lec18;
import java.util.*;

public class sorting_in_linear_time {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        sorting(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void sorting(int[] arr){
        int left=0;
        int right=arr.length-1;
        int i=0;
        while(i<=right){
            if(arr[i]==0){
                int temp=arr[i];
                arr[i]=arr[left];
                arr[left]=temp;
                left++;
                i++;
            }
            else if(arr[i]==1){
                i++;
            }
            else{
                int temp=arr[i];
                arr[i]=arr[right];
                arr[right]=temp;
                i++;
                right--;
            }
        }
    } 
}
//you are given an array containing only 0's,1'sand 2's you have to sort the array in linear time that is O(n). n is the size of the array.

// DNF sorting (Dutch NAtional flag) Algo.
// 0 aur 2 ko sort kr denge 1 apne aap ho jaega ..