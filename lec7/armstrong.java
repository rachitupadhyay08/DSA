package lec7;
import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt(); 
        System.out.println(is_armstrong(n));    
    }
    public static int count_of_digit(int n){
        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }
        return count;
    }
    public static boolean is_armstrong(int n){
        int sum=0;
        int c= count_of_digit(n);
        int original=n;
        while(n>0){
            int rem=n%10;
            sum= (int)(sum + Math.pow(rem,c));
            n=n/10;
        }
        // if(sum==original){    if is redundand here because there is no need to use it .
        //     return true;
        // }
        // else{
        //     return false;
        // }
        return sum==original;       // this will simply give the answer as true or false as the return type is boolean.
    }  
}
