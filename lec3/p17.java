package lec3;

public class p17 {
    public static void main(String[] args) {
        int n=7;
        int row=1;
        int star=n/2;
        int space=1;
        while(row<=n){
            int i=1;
            while(i<=star){
                System.out.print("* ");
                i++;
            }
            int j=1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            int k=1;
            while(k<=star){
                System.out.print("* ");
                k++;
            }
            //mirror
            if(row< (n/2) +1){
                space += 2;
                star--; 
            }
            else{
                space -= 2;
                star++;
            }
            row++;
            System.out.println();
        }

    }
    
}
