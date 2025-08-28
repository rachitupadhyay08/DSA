package lec28;

public class count_prime {
    public static void main(String[] args) {
        int n=100;
        System.out.println(Primesieve(n));   
    }
    //index--> false hoga usko prime index.
    //index--> true hoga usko not prime index.
    public static int Primesieve(int n){
        boolean[] prime=new boolean[n+1];
        prime[0]=true;
        prime[1]=true;
        // if(n<2){
        //     return 0;
        for(int i=2;i*i<=n;i++){
            if(prime[i]==false){
                for(int j=2;i*j<prime.length;j++){
                    prime[i*j]=true;
                }
            }
        }
        int count=0;
        for(int i=2;i<prime.length;i++){
            if(prime[i]==false){
                count++;
            }
        }
        return count;
    }
}
//prime sieve algorithm
//leetcode--> 204

//time complexity--> n(log(log(n)))
