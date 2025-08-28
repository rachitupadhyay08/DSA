package lec4;

public class sum_of_numbers {
    public static void main(String[] args) {
        int n=3846;
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum=sum + rem;
            n=n/10;
        }
        System.out.println(sum);
    }  
}
