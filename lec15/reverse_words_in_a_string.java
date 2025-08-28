package lec15;
import java.util.*;

public class reverse_words_in_a_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine(); // puri line input dene ke liye sc.nextLine() use hota hai.
        reverseString(s);

    }
    public static String reverseString(String s) {
        s=s.trim();
        String[] arr=s.split("\s+");   
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        return s;
    }  
}
