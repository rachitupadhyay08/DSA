package lec18;

public class max_sum_path {
    public static void main(String[] args) {
        int[] arr1={2,3,7,10,12,15,30,34};
        int[] arr2={1,5,7,8,10,15,16,19};
        System.out.println(max_path(arr1,arr2));
    }
    public static int max_path(int[] arr1,int[] arr2){
        int i=0; //arr1
        int s1=0; //arr1 ka start
        int j=0; //arr2
        int s2=0; //arr2 ka start
        int ans=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                i++;
            }
            else if(arr1[i]>arr2[j]){
                j++;
            }
            else{
                int sum1=0;
                for(int k=s1;k<=i;k++){
                    sum1+=arr1[k];
                }
                int sum2=0;
                for(int k=s2;k<=j;k++){
                    sum2+=arr2[k];
                }
                ans = ans + Math.max(sum1, sum2);
                i++;
                j++;
                s1=i;
                s2=j;  
            }
        }
        int sum1=0;
        for(int k=s1;k<arr1.length;k++){
            sum1+=arr1[k];
        }
        int sum2=0;
        for(int k=s2;k<arr2.length;k++){
            sum2+=arr2[k];
            }
        ans = ans + Math.max(sum1, sum2);
        return ans;

    }
    
}
// you are provided two sorted arrays. you need to find the maximum length of bitonic subsequences,You need to find the sum path to reach
// from beginning of any array to end of any of any of the two arrays. You can switch from onr array only at common elements.

//leetcode 1537  // long lena pdega ....
