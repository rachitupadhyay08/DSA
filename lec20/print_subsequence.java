package lec20;

public class print_subsequence {
    public static void main(String[] args) {
        String ques="abc";
        subs(ques,""); 
        // System.out.println(count);  
    }
    //static int count=0;    // to count the number of subsequence 
    
    public static void subs(String ques, String ans ){
        if(ques.length()==0){
            System.out.println(ans);
           // count++;
            return;
        }
        char ch=ques.charAt(0);
        subs(ques.substring(1),ans);
        subs(ques.substring(1),ans+ch);
    }   
}

// Subsequence--> ***Spinal cord of Recursion.

//abcd
// Substring -->  continious part of a string. eg. ab abc bc but not ac

// In Subsequence it is not important for the part to be contionus but it should be in sequence .. Eg. ac ad bd ....
// All substring are subsequence but all subsequence are not substring.