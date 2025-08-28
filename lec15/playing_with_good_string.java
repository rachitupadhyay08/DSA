package lec15;
// print the longest vowel substring.
import java.util.*;

public class playing_with_good_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(long_vowel_sub(s));
        
    }
    public static int long_vowel_sub(String s){
        int count=0;
        int ans=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(isvowel(ch)){
                count++;
            }
            else{
                ans=Math.max(ans,count);
                count=0;
            }
        }
        return ans;

    }
    public static boolean isvowel(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            return true;
        }
        return false;
    }
}

    