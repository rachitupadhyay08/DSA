package lec15;

public class palindrome {
    public static void main(String[] args) {
        String s="nitin";
        System.out.println(palin(s));
    }
    public static boolean palin(String s){
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            else{
                i++;
                j--;
            }
        }
        return true;
    }
    
}
