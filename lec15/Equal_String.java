package lec15;

public class Equal_String {
    public static void main(String[] args) {
        String s1="hello";
        String s2= "Hello";
        System.out.println(equal(s1, s2));
    }
    public static boolean equal(String s1, String s2){
        if(s1.length()!=s2.length()){   // comparing length 
            return false;
        }
        if(s1 == s2){
            return true;  // comparing loaction
        }
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){  // comparing every character.
                return false;
            }
        }
        return true;
    }
}
