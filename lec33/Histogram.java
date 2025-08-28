package lec33;
import java.util.*;
public class Histogram {
    public static void main(String[] args) {
        int[] arr={2,3,5,4,6,1,7};
        System.out.println(hist(arr));
    }
    public static int hist(int[] arr){
        int area=0;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[i]<arr[st.peek()]){
                int h=arr[st.pop()];
                int r=i;
                if(st.isEmpty()){
                    area=Math.max(area,h*r);
                }
                else{
                    int l=st.peek();
                    area=Math.max(area,h*(r-l-1));
                }
            }
            st.push(i);
        }
        int r=arr.length;
        while(!st.isEmpty()){

            int h=arr[st.pop()];
            if(st.isEmpty()){
                area=Math.max(area,h*r);
            }
            else{
                int l=st.peek();
                area=Math.max(area,h*(r-l-1));
            }
        }
        return area;
    }
    
}
// leetcode--> 84
