package lec22;

public class permutation {
    public static void main(String[] args) {
        String ques="abc";
        String ans="";
        System.out.println(printpermutation(ques, ans));
    }
    public static int printpermutation(String ques,String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return 1;
        }
        int count=0;

        for(int i=0;i<ques.length();i++){
            char ch=ques.charAt(i);
            String s1=ques.substring(0,i);
            String s2=ques.substring(i+1);
            count+=printpermutation(s1+s2, ans+ch);
        }
        return count;
    }   
}
