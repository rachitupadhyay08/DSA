package lec7;
import java.util.*;
public class odd_even_car {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){     
        int n=sc.nextInt();
        if(even_odd_delhi(n) == true){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        }
        t--;

    }
    public static boolean even_odd_delhi(int n){
        int sumeven=0;
        int sumodd=0;
        while(n>0){
            int rem=n%10;
            if(rem%2==0){
                sumeven += rem;
            }
            else{
                sumodd += rem;
            }
            n=n/10;
        }
        // if(sumeven%4==0 || sumodd%3==0){
        //         return true;
        //     }
        //     else{
        //         return false;
        //     }
        return (sumeven%4==0 || sumodd%3==0);
    }
}
    

