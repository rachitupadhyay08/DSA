package lec19;

public class power {
    public static void main(String[] args) {
        int a=3;
        int b=5;
        System.out.println(pow(a, b));
    }

    public static int pow(int a,int b){
        if(b==0){
            return 1;
        }
        int ans=pow(a,b-1);
        return 3*ans;
    }  
}

// Stack shrinking me ans aayega.-----> Head Recursion.

