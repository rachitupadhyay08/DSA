package lec23;

public class Queen_combination {
    public static void main(String[] args) {
        int n=4;
        boolean[] board=new boolean[n];
        int tq=2;
        Combination(board, tq, "",0,0);
    }
    public static void Combination(boolean[] board,int tq,String ans,int qpsf,int idx){
        if(qpsf==tq){
            System.out.println(ans);
            return;
        }
        for(int i=idx;i<board.length;i++){
            // if(board[i]==false){
            //     board[i]=true;
                Combination(board, tq, ans+"b"+i+"q"+qpsf, qpsf+1,i+1);
                // if(board[i]==true){
                //     board[i]=false;
                }
            }
        }
//     }    
// }
//
// commented part ka waise koi kaam nhi hai.kyuki yaha  bs combination dekh rhe hai..