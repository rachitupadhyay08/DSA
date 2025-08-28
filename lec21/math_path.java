package lec21;

public class math_path {
    public static void main(String[] args) {
        int n=3; //col
        int m=3; //row
        printpath(0, 0, n-1, m-1,"");

    }
    // cc--> curr col
    // cr-->  curr row
    // ec--> end col
    // er--> end row
    public static void printpath(int cc,int cr,int ec,int er,String ans){
        if(cc==ec && cr==er){           //base case
            System.out.println(ans);    
            return;
        }
        if(cc>ec || cr>er){             //base case
            return;
        }
        printpath(cc+1, cr, ec, er, ans+"H");
        printpath(cc, cr+1, ec, er, ans+"V");
    }
    
}
