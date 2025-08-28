package lec5;
import java.util.*;
public class data_types {
    public static void main(String[] args) {
        byte b=3;
        short s=5;
        int i=9;
        long l=16;
        System.out.println("b: " + b + ", s: " + s + ", i: " + i + ", l: " + l);

         @SuppressWarnings("resource")
        Scanner sc= new Scanner(System.in);
        b=sc.nextByte();
        s=sc.nextShort();
        l=sc.nextLong();
        boolean x=true;
        boolean y=false;
        System.out.println(b + s + l );
        System.out.println(x);
        System.out.println(y);
    }  
}
