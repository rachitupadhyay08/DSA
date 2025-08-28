package lec21;
import java.util.*; 
public class generate_parenthesis {
    public static void main(String[] args) {
        int n=3;
        List<String> ll=new ArrayList<>();
        generate(n, 0, 0,"",ll);
        System.out.println(ll);
    }

    public static void generate(int n,int open,int close,String ans,List<String> ll){
        if(open==n && close==n){
            // System.out.print(ans+" ");
            ll.add(ans);
            return;
        }

        // if(open<n){
        //     generate(n, open+1, close, ans+"(",ll);
        // }
        // if(close<open){
        //     generate(n, open, close+1, ans+")",ll);
        // }

        if(open>n ||close>open){
            return;
        }
        generate(n, open+1, close, ans+"(",ll);
        generate(n,open,close+1,ans+")",ll);
    }  
}