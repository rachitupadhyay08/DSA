package lec31;
import java.util.*;

public class Stack_reverse2 {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);
        reverse(st);
        System.out.println(st);
    }
    private static void reverse(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }
        int x=st.pop();
        reverse(st);
        Insert(st,x);
    }
    public static void Insert(Stack<Integer> st, int item){
        if(st.isEmpty()){
            st.push(item);
            return;
        }
        int x = st.pop();
        Insert(st, item);
        st.push(x);
    }
}
