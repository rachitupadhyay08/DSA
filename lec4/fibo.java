package lec4;
import java.util.*;
public class fibo {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        for(int i=1; i<=n; i++){
            System.out.println(a);
            int c=a+b;
            a=b;
            b=c;
        }
        System.out.println(a); 
    }
}
