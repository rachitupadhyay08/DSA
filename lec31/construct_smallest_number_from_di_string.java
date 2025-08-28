package lec31;
import java.util.*;

public class construct_smallest_number_from_di_string {
    public static void main(String[] args) {
        String ques="IIIDIDDD";
        System.out.println(construct(ques));
    }
    
    public static String construct(String ques){
        int n=ques.length();
        int[] ans=new int[n+1];
        Stack<Integer> st = new Stack<>();
        int c=1;
        for(int i=0;i<=n;i++){
            if(i==ques.length() || ques.charAt(i)=='I'){
                ans[i]=c;
                c++;
                while(!st.isEmpty()){
                    ans[st.pop()]=c;
                    c++;
                }
            }
            else{
                st.push(i);
            }
        }
        String str="";
        for(int i=0;i<ans.length;i++){
            str += ans[i];
        }
        return str;
    }
}
//leetcode --> 2375
