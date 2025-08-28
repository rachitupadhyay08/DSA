package lec19;

public class print_decre {
    public static void main(String[] args) {
        int n=5;
        PD(n);
    }
    public static void PD(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        PD(n-1);
    }  
}

// Stack growing me ans mil rha hai.----> Tail Recursion.
