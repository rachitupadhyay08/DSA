package lec17;
import java.util.*;

public class Kartik_Bhaiya_And_Strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        String str=sc.next();
        int flipa=MaxLength(str, k,'a');
        int flipb=MaxLength(str, k,'b');
        System.out.println(Math.max(flipa, flipb));
    }
    public static int MaxLength(String str, int k,char ch){
        int si=0;
        int ei=0;
        int flip=0;
        int ans=0;
        while(ei<str.length()){
            //growing
            if(str.charAt(ei)==ch){
                flip++;
            }
            //shrinking
            while(flip>k){
                if(str.charAt(si)==ch){
                flip--;
                }
                si++;
            }
            //ans cal
            ans =Math.max(ans, ei-si+1);
            ei++;
        }
        return ans;
    }  
}
// https://codeskiller.codingblocks.com/problems/446