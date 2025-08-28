package lec3;

public class p25 {
    public static void main(String[] args) {
        int n=5;
        int row=1;
        int star=1;
        int space=n-1;
        int val=1;
        while(row<=n){
            int i=1;
            while(i<=space){
                System.out.print(" \t");
                i++;
            }
            int j=1;
            while(j<=star){
                System.out.print(val+"\t");
                j++;
                val++;
            }
            row++;
            space--;
            star += 2;
            System.out.println();
        }
    }  
}
