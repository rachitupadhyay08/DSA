package lec6;

public class typecasting {
    public static void main(String[] args) {
        byte b=(byte)(140);  // explicit typecasting.
        byte b1=(byte)(300);
        int i=17;  // 14 is a literal as it is not taken from the scanner.
        byte c1=42; // Implicit typecasting.
        byte d1=(byte)(428); // this changes the number.**
        System.out.println(b);
        System.out.println(i);
        System.out.println(b1);
        System.out.println(c1);
        System.out.println(d1);
        byte n=2;
        i=n;
        System.out.println(i);
        n=-5;
        i=b;
        System.out.println(i);
        System.out.println(n);
        long l=7689879979l;  // write l at last when exceeds the range for typecasting. // this changes the literal.**
        System.out.println(l);

    }   
}
