package lec16;
import java.util.*;

public class check_CB_numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str=sc.next();
        Substring(str);
    }


    public static void Substring(String str){
        int count=0;
        boolean[] visited=new boolean[str.length()];   // for visited indexes taaki repeat naa ho.
        for(int len=1;len<=str.length();len++){          // length wise substring ke liye. 
            for(int j=len;j<=str.length();j++){
                int i=j-len;
                String s=str.substring(i,j);  //String to number
                if(isCBnumber(Long.parseLong(s))==true && isVisited(visited,i,j-1)){
                    count++;
                    for(int k=i;k<j;k++){
                        visited[k]=true;  // marked ho gya 
                    }  //visited wale mark kiye 
                }
            } 
        }
        System.out.println(count);
    }


    public static boolean isVisited(boolean[] visited,int i,int j){   // visited wale ko involve na krne ke liye 
        for(int k=i;k<=j;k++){
            if(visited[k]==true){
                return false;
            }
        }
        return true;
    }


    public static boolean isCBnumber(long num){   // CB number check krne ke liye. 
        if(num==0||num==1){
            return false;
        }
        int[] arr={2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        for(int i=0;i<arr.length;i++){
            if(num==arr[i]){
                return true;
            }  
        }
         for(int i=0;i<arr.length;i++){
            if(num % arr[i]==0){
                return false;
            }  
        }
        return true;
    }   
}
// O(n^3)  time complexity



// Finding CB Numbers

// Kartik Bhaiya and Kanak Bhaiya are discussing a special type of number, which they call a Coding Blocks Number (CB Number). A number qualifies as a CB Number based on the following criteria:

// 0 and 1 are not considered CB numbers.

// The following prime numbers are always CB numbers:

// 2, 3, 5, 7, 11, 13, 17, 19, 23, 29.

// Any other number is a CB number if it is not divisible by any of the numbers listed in point (2).

// https://codeskiller.codingblocks.com/problems/165