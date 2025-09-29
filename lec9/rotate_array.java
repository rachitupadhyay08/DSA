package lec9;
import java.util.*;

public class rotate_array {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        int[] nums={1,2,3,4,5,6,7};
        int k=sc.nextInt();
        rotate(nums, k);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");   
        }        
    }
    public static void rotate(int[] nums, int k){
        int n=nums.length;
        k=k%n;
        for(int i=1; i<=k; i++){
            int item=nums[n-1];
            for(int j=n-2;j>=0;j--){
                nums[j+1]=nums[j];
            }
            nums[0]=item;
        }
    }   
}

// showa TLE on leetcode.