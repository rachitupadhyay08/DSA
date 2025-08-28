package lec28;

public class pow_log_n {
    public static void main(String[] args) {
        int a=3;
        int n=5;
        System.out.println(pow(a, n));
    }
    public static int pow(int a,int n){
        if(n==0){
            return 1;
        }
        int ans=pow(a,n/2);
        ans=ans*ans;
        if(n%2!=0){
            ans *= a;
        }return ans;

    }  
}
// a^n == a^(n/2)+a^(n/2) (if even)
// a^n == (a^(n/2)+a^(n/2))*a  (if odd)
