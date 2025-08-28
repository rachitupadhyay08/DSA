package lec3;

public class p23 {
    public static void main(String[] args) {
        int n=5;
        int star=1;
        int space=n-1;
        int row=1;
        while(row<=n){
            int i=1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            int j=1;
            while(j<=star){
                System.out.print("1 ");
                j++;
            }
            row++;
            space--;
            star += 2;
            System.out.println();
        }
    }   
}
