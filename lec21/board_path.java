package lec21;

public class board_path {
    public static void main(String[] args) {
        int n=4;
        printAns(n,0,"");

    }
    // curr--> current position
    // end goal--> n
    public static void printAns(int n,int curr,String ans){
        if(curr==n){
            System.out.println(ans);
            return;
        }
        if(curr>n){
            return;
        }
        // printAns(n,curr+1,ans+" "+1);   // 3 recursive calls for 3 faces of dice.
        // printAns(n,curr+2,ans+" "+2);   // similarly 6 for 6 faces
        // printAns(n,curr+3,ans+" "+3);
        for(int dice=1;dice<=3;dice++){
            printAns(n,curr+dice,ans+" "+dice);
        }
    } 
}
// a dice with 3 faces --> 1,2,3
// ways to have a total 4
//  1 1 1 1
// 1 1 2
// 1 2 1
// 1 3
// 2 1 1
// 2 2
// 3 1
