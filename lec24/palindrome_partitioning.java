package lec24;
import java.util.*;

public class palindrome_partitioning {
    public static void main(String[] args) {
        List<String> ll=new ArrayList<>();
        List<List<String>> ans= new ArrayList<>();

        String ques="nitin";
        Partition(ques, ll,ans);
        System.out.println(ans);
        
    }
    public static void Partition(String ques,List<String> ll,List<List<String>> ans){
        if(ques.length()==0){
            ans.add(new ArrayList<>(ll));
            return;
        }
        for(int i=1;i<=ques.length();i++){
            String s=ques.substring(0,i);
            if(isPalindrome(s)){
                ll.add(s);
                Partition(ques.substring(i),ll,ans);
                ll.remove(ll.size()-1);
            }
        }
    }
    public static boolean isPalindrome(String str){
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
//leetcode 131
