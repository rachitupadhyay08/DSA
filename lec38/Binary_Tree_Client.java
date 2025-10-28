package lec38;

public class Binary_Tree_Client {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.Display();

        System.out.println(bt.max());

        System.out.println(bt.find(100));

        System.out.println(bt.ht());

        bt.PreOrder();

        bt.InOrder();

        bt.PostOrder();
    }
}

//10 true 20 true 40 false false true 50 false false true 30 false true 60 true 70 false false false
