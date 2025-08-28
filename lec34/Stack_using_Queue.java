package lec34;

public class Stack_using_Queue  {
    private dynamic_Queue Q;

    public Stack_using_Queue(){
        Q=new dynamic_Queue();
    }

    public int size(){
        return Q.size();
    }

    public boolean isEmpty(){
        return Q.isEmpty();
    }
    //O(1)
    public void push(int item) throws Exception {
        Q.Enqueue(item);
    }
    //O(n)
    public int pop() throws Exception{
        dynamic_Queue helpQ= new dynamic_Queue();
        while(Q.size()>1){
            helpQ.Enqueue(Q.Dequeue());
        }
        int rv=Q.Dequeue();
        while(helpQ.size()>0){
            Q.Enqueue(helpQ.Dequeue());
        }
        return rv;
    } 
    //O(n)
    public int peek() throws Exception{
        dynamic_Queue helpQ= new dynamic_Queue();
        while(Q.size()>1){
            helpQ.Enqueue(Q.Dequeue());
        }
        int rv=Q.Dequeue();
        helpQ.Enqueue(rv);
        while(helpQ.size()>0){
            Q.Enqueue(helpQ.Dequeue());
        }
        return rv;
    }

    public static void main(String[] args) throws Exception {
        Stack_using_Queue st=new Stack_using_Queue();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        System.out.println(st.pop());
        System.out.println(st.peek());
    }
}
