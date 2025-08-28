package lec4;

public class reverse_the_number {
    public static void main(String[] args) {
        int n=3846;
        int number=0;
        while(n>0){
            int rem=n%10;
            number=number*10 +rem;
            n=n/10;
        }
        System.out.println(number);
    }  
}
