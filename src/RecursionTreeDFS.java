import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


class Node {
    Node lt;
    Node rt;
    int data;

    public Node(int val) {
        data = val;
        lt = null;
        rt = null;
    }
}

public class RecursionTreeDFS {
    //깊이우선탐색
    //재귀+TREE
    Node root; 
    public static void main(String[] args) throws Exception {
        RecursionTreeDFS tree = new RecursionTreeDFS();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.DFS(tree.root);
    }

    public void DFS(Node root) {
        if(root==null) {
            return;
        }
        else {
            System.out.print(root.data + " ");
            //System.out.println();
            DFS(root.lt);
            //System.out.print(root.data + " ");
            //System.out.println();
            DFS(root.rt);
            //System.out.print(root.data + " ");
            //System.out.println();
        }
    }

}
