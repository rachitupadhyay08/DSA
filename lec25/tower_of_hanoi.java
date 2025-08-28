package lec25;

public class tower_of_hanoi {
    public static void main(String[] args) {
        int n=3;
        toh(n, "A", "c", "B");
        
    }
    public static void toh(int n,String src,String help,String des){
        if(n==0){
            return;
        }
        toh(n-1,src,des,help);   //n-1 disk ko pehle src se help pr phuchao des ki maddat lekr.
        System.out.println("move " + n + "th disk from " + src + " to " + des);
        toh(n-1,help,src,des);   // ab n-1 disk ko help se utha kr des pr phuchao src ki maddat lekr.
    }
}
