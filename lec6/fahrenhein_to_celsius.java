package lec6;
import java.util.*;
public class fahrenhein_to_celsius {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        int minf=sc.nextInt();
        int maxf=sc.nextInt();
        int step=sc.nextInt();
        for(int i=minf; i<=maxf; i=i+step){
            int c= (int)((5 / 9.0)*(i-32)); //5/9 is 0--> now change any one to double (5/9.0) now the answer is in double . now we need to typecast to int .
            System.out.println(i + "\t" + c);
        }   
    }
}
