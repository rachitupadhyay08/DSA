package lec7;

public class fun_demo1 {
    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println(Add());
        System.out.println("bye");
          
    }
    public static int Add(){
        int a=9;
        int b=7;
        int c=a+b-Sub();
        return c;
    }
    public static int Sub(){
        int a=9;
        int b=7;
        int c=a-b;
        return c;   
    }
}    
