package lec4;

import java.util.*;

public class break_statement {
     public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        for(int i=2; i<n; i++){
            if(n%i==0){       // condition
                count++;
                break; // breaks the loop whenver the condition becomes true.
            }
        }
        if(count>=1){
            System.out.println("not prime");
        }
        else{
            System.out.println("prime");
        }
    }  
}
// continue --> skips the iteration.