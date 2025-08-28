package lec31;
import java.util.*;

public class find_the_celebrity {
    public static void main(String[] args) {
        int[][] arr={{0,1,1,1},{1,0,1,1},{0,0,0,0},{1,1,1,0}};
        System.out.println(find(arr));      
    }
    public static int find(int[][] arr){
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<arr.length;i++){
            st.push(i);
        }
        while(st.size()>1){
            int a=st.pop();
            int b=st.pop();
            if(arr[a][b]==1){
                st.push(b);
            }
            else{
                st.push(a);
            }
        }
        int candidate=st.pop();

        for(int j=0; j<arr.length;j++){
            if(j==candidate){
                continue;
            }
            if(arr[candidate][j]==1|| arr[j][candidate]==0 ){      // row or column ke liye 
                return -1;
            }
        }
        return candidate;
    }
}

// leetcode--> 277
