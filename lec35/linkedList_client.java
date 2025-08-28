package lec35;

public class linkedList_client {
    public static void main(String[] args) throws Exception{
        linkedList ll = new linkedList();  
        ll.AddFirst(10);
        ll.AddFirst(20);
        ll.AddFirst(30);
        ll.AddLast(40);
        ll.AddIndex(-20,2);
        ll.Display();

        // System.out.println(ll.GetFirst());
        // System.out.println(ll.GetLAst());
        // System.out.println(ll.GetIndex(2));
        // ll.Display();
        System.out.println(ll.removefirst());
        ll.Display();
        System.out.println(ll.removeLast());
        ll.Display();
        System.out.println(ll.removeIndex(2));
    } 
}
