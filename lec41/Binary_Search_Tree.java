package lec41;

public class Binary_Search_Tree {
    class Node{
        int val;
        Node left;
        Node right;
    }
    private Node root;

    public Binary_Search_Tree(int[] arr){
        root = CreateTree(arr,0,arr.length-1);
    }
    private Node CreateTree(int[] arr,int si,int ei){
        if(si>ei){
            return null;
        }
        int mid = (si+ei)/2;
        Node nn = new Node();
        nn.val=arr[mid];
        nn.left=CreateTree(arr, si, mid-1);
        nn.right=CreateTree(arr,mid+1, ei);
        return nn;
    } 

    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80};
        Binary_Search_Tree bst = new Binary_Search_Tree(arr);
        bst.display();
    }

    public void display() {
        display(root);
    }

    private void display(Node nn) {
        if (nn == null) return;

        String s = "";
        if (nn.left != null) s += nn.left.val;
        else s += ".";
        s += "<--" + nn.val + "-->";
        if (nn.right != null) s += nn.right.val;
        else s += ".";
        System.out.println(s);

        display(nn.left);
        display(nn.right);
    }
}
