package lec15;

public class Sub_string_2 {
    public static void main(String[] args) {
        String s="hello";
        subs(s);
    }
    
    public static void subs(String s){
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                System.out.println(s.substring(i,j));
            }
        }
    }   
}
