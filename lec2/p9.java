package lec2;
import java.util.*;
public class p9 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int space=n-1;
        int row=1;
        int star=1;
        while(row<=n){
            int i=1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            int j=1;
            while(j<=star){
                System.out.print("* ");
                j++;
            }
            row++;
            star += 2;
            space--;
            System.out.println();
        }   
    } 
}
