package lec6;
import java.util.*;

public class inverse_of_number {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int inv=0;
        int pos=1;
        while(num>0){
            int rem=num%10;
            inv=(int)(inv + pos*Math.pow(10,rem-1)); //typecasting to int .. no need if "inv +=" was used as it do internal typecasting.
            num=num/10;
            pos++;
        }
        System.out.println(inv);      
    }  
}
