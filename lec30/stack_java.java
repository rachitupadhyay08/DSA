package lec30;
import java.util.*;

public class stack_java {
    public static void main(String[] args) {
        stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        st.push(70);
        System.out.println(st.peek());
        System.out.println(st);
        System.out.println(st.pop());
        System.out.println(st);

        System.out.println(st.isEmpty());
        System.out.println(st.size());
    }
}

// LIFO data structue
// data cannot be accesed from middle or back 
// can be accesed only from the top.

// add--> push
// remove--> pop 
// set--> peek  // top pr konsa element hai
// size--> size
// Display