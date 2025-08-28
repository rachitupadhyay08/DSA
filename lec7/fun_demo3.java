package lec7;

public class fun_demo3 {
    static int val = 100; // global variable can be made anywhere ouside the class and methods. and can be assesible everywhere. // goes into heap memory.
    public static void main(String[] args) {
        System.out.println("hello");
        int a=7;
        int b=11;
        System.out.println(Add(a, b));
        System.out.println(val);
        
    }
    public static int Add(int a, int b){ // here the variables can be something else as well because in funtion the value of the variables passes not the variable name .

        int c=a+b;
        int localval=60;
        fun_demo3.val = fun_demo3.val + 5; // calls the global variable .
        System.out.println(localval);
        return c - Sub(c, b);
    }
    public static int Sub(int a, int b){
        int c=a-b;
        return c;   
    }  
}
