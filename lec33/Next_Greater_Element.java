package lec33;

import java.util.*;
public class Next_Greater_Element {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }   
        element(n, arr);
    }

    public static void element(int n,int[] arr){
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[i]>arr[st.peek()]){
                ans[st.pop()]=arr[i];
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            ans[st.pop()]=-1;
        }
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+ " ");
        }
    }
}
// O(n)
// https://codeskiller.codingblocks.com/problems/1053
