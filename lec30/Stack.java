package lec30;

public class Stack {
    protected  int[] arr; // protected accessible sirf package ke andr hi hota hai pr inheritance package ke bhar bhi ho skta hai..
    private int idx = -1;

    public Stack(){ // agr kisi ne size nhi pass kiya to by default 5 size ka array bnega 
        arr=new int[5];
    }

    public Stack(int n){ //yaha jo size paas hoga us size ka bnega 
        arr=new int[n];
    }

    public boolean isEmpty(){
        return idx==-1;
    }

    public void push(int item) throws Exception{
        if(isfull()){
            throw new Exception("bklol stack full hai");
        }
        idx++;
        arr[idx]=item;
    }

    public int size(){
        return idx+1;
    }

    public  boolean isfull(){
        return idx==arr.length-1;
    }

    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("bklol stack emty hai");
        }
        int rv=arr[idx];
        idx--;
        return rv;
    }

    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("bklol stack emty hai");
        }
        int rv=arr[idx];
        return rv;
    }

    public void Display(){
        for(int i=0;i<=idx;i++){
            System.out.print(arr[i]+" ");   
        }
        System.out.println();
    }
}
