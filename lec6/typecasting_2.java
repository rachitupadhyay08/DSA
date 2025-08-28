package lec6;
import java.util.*;

public class typecasting_2 {
    public static void main(String[] args) {
      float f=8.9f;  // by default literal is in 64 bit in this case. to convert it into 32 bit f is added at last.
      //float f=(float)(8.9) it gives the same output as above because 8.9 is in the range of float.
      //float f=(float)(86776565476574657575757575.9); this changes the number as it is not in the range of float.                                                
      double d=8.9;
      System.out.println(f);
      System.out.println(d);

       @SuppressWarnings("resource")
      Scanner sc = new Scanner(System.in);
      f=sc.nextFloat();
      d=sc.nextDouble();
      System.out.println(f);
      System.out.println(d);
    }
    
}
