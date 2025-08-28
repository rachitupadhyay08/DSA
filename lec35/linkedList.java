package lec35;

public class linkedList {
    class Node{
        int data;
        Node next;
    }
    private Node head;
    private Node tail;
    private int size; 

    //O(1)
    public void AddFirst(int item){
        Node nn=new Node();
        nn.data=item;
        if(size==0){
            head=nn;
            tail=nn;
            size++;
        }
        else{
            nn.next=head;
            head=nn;
            size++;
        }
    }

    //O(1)
    public void AddLast(int item){
        if(size==0){
            AddFirst(item);   
        }
        else{
            Node nn=new Node();
            nn.data=item;
            tail.next=nn;
            tail=nn;
            size++;
        }
    }

    //O(n)
    public void AddIndex(int item,int k) throws Exception{
        if(k==0){
            AddFirst(item);
        }
        else if(k==size){
            AddLast(item);
        }
        else{
            Node nn=new Node();
            nn.data=item;
            Node k_1th = GetNode(k-1);
            nn.next=k_1th.next;
            k_1th.next=nn;
            size++;
        }
    }

    public int GetFirst(){
        return head.data;
    }
    public int GetLAst(){
        return tail.data;
    }
    public int GetIndex(int k) throws Exception{
        return GetNode(k).data;
    }

    public int removefirst(){
        int rv = head.data;
        if(size==1){
            head=null;
            tail=null;
        }
        else{
            Node temp=head;
            head=head.next; 
            temp.next=null;   
        }
        size--;
        return rv;
    }

    public int removeLast() throws Exception{
        int rv=tail.data;
        if(size==1){
            return removefirst();
        }
        else{
            Node size_2th = GetNode(size-2);
            size_2th.next=null;
            tail=size_2th;
            return rv;
        }
    }

    public int removeIndex(int k) throws Exception{
        if(k==0){
            return removefirst();
        }
        else if(k==size-1){
            return removeLast();
        }
        else{
            Node k_1th = GetNode(k-1);
            Node kth=k_1th.next;
            k_1th.next=kth.next;
            kth.next=null;
            size--;
            return kth.data;
        }
    }

    //O(n)
    public void Display(){
        Node temp = head;
        while(temp != null){
            System.out.print (temp.data + "--->");
            temp =temp.next; 
        }
        System.out.println(".");
    }

    private Node GetNode(int k)throws Exception{
        if(k<0|| k>=size){
            throw new Exception("bklol index range me nhi hai");
        }
        Node temp=head;
        for(int i=0;i<k;i++){
            temp=temp.next;
        }
        return temp; 
    }
}
// Non-continious data structure 
// LinkedList is a  collection of multiple nodes..
