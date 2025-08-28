package lec15;

public class String_Equlals {
    public static void main(String[] args) {
        String s2="hello";
        String s3=new String("hello");
        System.out.println(s2 == s3); // location address compare ho rha hai.

        System.out.println(s2.charAt(4));  // 0 based indexing .
        // to access a character of a string.

        System.out.println(s2.equals(s3));  // String ka CONTENT compare ho rha h .
    }
    
}
