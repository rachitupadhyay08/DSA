package lec6;
import java.util.*;

public class typecasting_3 {
    public static void main(String[] args) {
        char ch='a';
        System.out.println((int)(ch));
        ch++; // ch=(char)(ch+1);
        System.out.println(ch);
        ch=(char)(ch+1);
        System.out.println(ch);
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        ch=sc.next().charAt(0);
        System.out.println(ch);
    }    
}
