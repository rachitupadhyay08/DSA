package lec30;

public class Queue {
    protected  int[] arr;
    protected int front=0;
    private int size=0;
    public Queue(){
        arr=new int [5];
    }

    public Queue(int n){
        arr=new int[n];
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void Enqueue(int item)  throws Exception{
        if(isfull()){
            throw new Exception("queue is full");
        }
        int idx=(front+size)%arr.length;  // circular queue //normal ke liye (front + size)
        arr[idx]=item;
        size++;
    }

    public int Dequeue() throws Exception{
        if(isEmpty()){
            throw new Exception("queue is already empty");
        }
        int rv=arr[front];
        front=(front+1)%arr.length;  // circular queue // normal ke liye front++
        size--;
        return rv;
    }

    public int size(){
        return size;
    }

    public int getFront() throws Exception{
        if(isEmpty()){
            throw new Exception("queue is already empty");
        }
        int rv=arr[front];
        return rv;
    }

    public boolean isfull(){
        return size==arr.length;
    }

    public void Display(){
        for(int i=0; i<size;i++){
            int idx=(front+i)%arr.length;
            System.out.print(arr[idx]+" ");
        }
        System.out.println();
    }
}
// FIFO data structure
// add--> nqueue
// remove--> dequeue
