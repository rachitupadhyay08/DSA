package lec16;

public class print_substring_lengthwise {
    public static void main(String[] args) {
        String str="hello";
        Substring(str);
    }
    public static void Substring(String str){
        for(int len=1;len<=str.length();len++){
            for(int j=len;j<=str.length();j++){
                int i=j-len;
                System.out.println(str.substring(i,j));
            } 
        }
    }
    
}
// [0,1]  h   [0,2] he
// [1,2]  e   [1,3] el
// [2,3]  l    ..........
// [3,4]  l    .......... like this 
// [4,5]  o
// len=1       len=2          len=3.....
// j=len        ........................
// i=len-j  ...........................