package lec19;

public class print_increm {
    public static void main(String[] args) {
        int n=5;
        PI(n);
    }
    public static void PI(int n){
        if(n==0){
            return;
        }
        PI(n-1);
        System.out.println(n);
    }  
}

// Stack shrinking me ans mil rha hai.
