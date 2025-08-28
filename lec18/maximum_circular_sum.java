package lec18;
import java.util.*;

public class maximum_circular_sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println(circular_sum(arr));
        }
        t--;
           
    }
    public static int circular_sum(int[] arr){
        int linear_sum=kadens_algo(arr);
        int sum=0;
        int ans=0;
        for(int i=0;i<arr.length;i++){  // array me se woh part nikalna hai jo sbsbe minimum ho.
            sum+=arr[i];               // har element ka sign invert krenge 
            arr[i]= arr[i]*-1;
        }
        int mid=kadens_algo(arr);      // phir uska sum lenge (example lekr smjhna)
        ans=sum+mid;   // circular sum
        if(ans==0){
            return linear_sum;
        }
        return Math.max(ans, linear_sum);
    }

    public static int kadens_algo(int[] arr){
        int ans=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            ans=Math.max(ans,sum);
            if(sum<0){
                sum=0;
            }
        }
        return ans;
    } 
}
// Given a circular integer array arr of length n,return the maximum possible sum of a non-empty subarray of nums.
// circular array means the end of the array connects to the bginning of the array. formally, the next element of arr[i] is arr([i+1]%n) and
// previous elements of arr[i] is arr([i-1+n]%n)...
//
// first line of input is number of test cases
// n
// arr

// leetcode 918
