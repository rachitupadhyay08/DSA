package lec25;
import java.util.*;

public class Rat_Chases_its_cheese {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        char[][] maze=new char[n][m];
        for(int i=0;i<maze.length;i++){
            String s=sc.next();
            for(int j=0;j<maze[0].length;j++){
                maze[i][j]=s.charAt(j); 
            }
        } 
        int[][] ans=new int[n][m];
        path(maze, 0, 0, ans);
        if(val==false){
            System.out.println("NO PATH FOUND");
        }
    }
    static boolean val=false;
    public static void path(char[][] maze,int cc,int cr,int[][] ans){
        if(cr<0 || cc<0 || cr>=maze.length ||cc>=maze[0].length || maze[cr][cc]=='X' ){
            return;
        }
        if(cc==maze[0].length-1 && cr==maze.length-1){
            ans[cr][cc]=1;
            val=true;
            Display(ans);
        }
        maze[cr][cc]='X';
        ans[cr][cc]=1;
        int[] r={-1,0,1,0};
        int[] c={0,-1,0,1};
        for(int i=0;i<c.length;i++){
            path(maze, cc+c[i], cr+r[i], ans);
        }
        // path(maze, cc, cr-1,ans);//up              // this can be done in a loop as well.
        // path(maze, cc-1, cr,ans);//left
        // path(maze, cc, cr+1,ans);//down
        // path(maze, cc+1, cr,ans);//right
        maze[cr][cc]='O';
        ans[cr][cc]='O';
    }
    public static void Display(int[][] ans){
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    } 
}
// https://codeskiller.codingblocks.com/problems/535
