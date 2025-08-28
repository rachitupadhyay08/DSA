public class increment_decrement {
    public static void main(String[] args) {
        int a=6;
        // System.out.println(a++); //post increment
        // System.out.println(a);
        // int b=11;
        // System.out.println(b--); //post decrement
        // System.out.println(b);
        // int x=a++ + 6 + a-- - a-- + a++ - a++;
        // System.out.println(x);
    //     int x=a-- + 7 + a-- + 8 + a++;
    //     System.out.println(x); 
    // int b=10;
    // System.out.println(--b);
    // System.out.println(b);

    // int c=1;
    // System.out.println(--c);
    int x = a++ + --a - ++a +11 +a++ - a-- + ++a;
    System.out.println(x); 
    } 
}
