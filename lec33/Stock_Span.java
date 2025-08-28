package lec33;

import java.util.*;

public class Stock_Span {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        } 
        stock(n, arr);  
    }
    public static void stock(int n,int[] arr){
        Stack<Integer> st=new Stack<>();
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[i]>=arr[st.peek()]){
                st.pop();  
            }
            if(st.isEmpty()){
            ans[i]=i+1;
            }
            else{
                ans[i]=i-st.peek();
            }
            st.push(i);
        }
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
        System.out.println("END");
    } 
}

// https://codeskiller.codingblocks.com/problems/502
