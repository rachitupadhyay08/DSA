package lec3;

public class p16 {
    public static void main(String[] args) {
        int n=5;
        int row=1;
        int star=n;
        int space=n-1;
        while(row<=2*n-1){
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
        //mirror
        if(row<n){
            space--;
            star--;
        }
        else{
            space++;
            star++;
        }
        row++;
        System.out.println();

    }    
    }
}

