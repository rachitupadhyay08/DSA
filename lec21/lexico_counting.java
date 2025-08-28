package lec21;

public class lexico_counting {
    public static void main(String[] args) {
        int n=1000; 
        lexico(n, 0);  
    }
    public static void lexico(int n,int curr){
        System.out.println(curr);
        int i=0;
        if(curr==0){
            i=1;
        }
        if(curr>n){
            return;
        }
        for(;i<=9;i++){
            lexico(n, curr*10+i);
        }
    }
}
