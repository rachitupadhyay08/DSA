package lec14;

import java.util.*;

public class argressive_cow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt(); // no of stalls
            int c=sc.nextInt(); //no of cows
            int[] stall=new int[n];  
            for(int i=0;i<stall.length; i++){
                stall[i]=sc.nextInt(); // stall ki position wala input
            }
            Arrays.sort(stall); // sort kr diya array ko
            System.out.println(largest_min_distance(stall, c));
            t--;
        }
        

    }
    public static int largest_min_distance(int[] stall,int c){
        int low=0;
        int high=stall[stall.length-1]-stall[0];
        int ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(isitpossible(stall,c,mid)==true){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;

            }
        }
        return ans;
    }
    public static boolean isitpossible(int[] stall,int c,int mid){
        int cow=1;
        int pos=stall[0];
        for(int i=0;i<stall.length;i++){
            if(stall[i]-pos>=mid){
                cow++;
                pos=stall[i];
            }
            if(cow==c){
                return true;
            }
            
        }
        return false;
    }
}

//   n * log(n)
