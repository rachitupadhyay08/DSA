// package lec40;
import java.util.*;

public class Create_Tree_Using_Level_Order {
    class Node {
        int val;
        Node left, right;

        public Node(int val) {
            this.val = val;
        }
    }

    private Node root;

    public Create_Tree_Using_Level_Order() {
        createTree();
    }

    private void createTree() {
        int[] arr = {10, 20, 30, 40, 50, -1, 70, -1, -1, 60, -1, -1, -1, -1};

        Queue<Node> q = new LinkedList<>();
        root = new Node(arr[0]);
        q.add(root);

        int i = 1;
        while (!q.isEmpty() && i < arr.length) {
            Node rv = q.poll();

            int c1 = arr[i++];
            if (c1 != -1) {
                Node nn = new Node(c1);
                rv.left = nn;
                q.add(nn);
            }

            if (i < arr.length) {
                int c2 = arr[i++];
                if (c2 != -1) {
                    Node nn = new Node(c2);
                    rv.right = nn;
                    q.add(nn);
                }
            }
        }
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

    public static void main(String[] args) {
        Create_Tree_Using_Level_Order cl = new Create_Tree_Using_Level_Order();
        cl.display();
    }
}
