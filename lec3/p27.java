package lec3;

public class p27 {
    public static void main(String[] args) {
        int n=5;
        int row=1;
        int star=1;
        int space=n-1;
        while(row<=n){
            int i=1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            int val=1;
            int j=1;
            while(j<=star){
                System.out.print(val+" ");
                if(j <= star/2 ){
                    val++;
                }
                else{
                    val--;
                }
                j++;
            }
            row++;
            space--;
            star += 2;
            System.out.println();
        }
        
    }
    
}
