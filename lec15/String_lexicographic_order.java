package lec15;

public class String_lexicographic_order {
    public static void main(String[] args) {
        String s1="komal";
        String s2="kunal";

         // System.out.println(s1.compareTo(s2));   method in String class to compare two strings .
        // +ve s1>s2
        // -ve s2>s1
        //  s1 == s2
        // output = -6 difference of Asci value of o and u.
        System.out.println(compareto(s1, s2));
    }
    public static int compareto(String s1,String s2){ // khudse method bnana
        if(s1 == s2){
            return 0;
        }
        int len=Math.min(s1.length(),s2.length());
        for(int i=0; i<len;i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                return s1.charAt(i) - s2.charAt(i); 
            }
        }
        return s1.length() - s2.length();
    }
    
}
