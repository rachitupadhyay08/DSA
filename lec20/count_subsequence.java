package lec20;

public class count_subsequence {
    public static void main(String[] args) {
        String ques="abc";  
        System.out.println(subs(ques,""));
    }

    public static int subs(String ques,String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return 1;
        }
        char ch=ques.charAt(0);
        int a1=subs(ques.substring(1),ans);
        int a2=subs(ques.substring(1),ans+ch);
        return a1+a2;
    }   
}
