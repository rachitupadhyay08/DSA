package lec19;

public class factorial {
    public static void main(String[] args) {
        int n=5;
        System.out.println(fact(n));
    }
    public static int fact(int n){
        if(n==0){
            return 1;    // solution to the problem given below 
        }
        int fn=fact(n-1);  // smaller problem
        return fn*n;
    }  
}
// Stacks Overflow aayega kyuki ye rukega hi nhi... n will keeps on decreasing.. to solve this problem.
// return puure function frame se bahar kr deta hai.

// Stack shrinking me result mila