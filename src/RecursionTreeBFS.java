import java.math.BigInteger;
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

public class RecursionTreeBFS {
    //이진트리순회(넓이우선탐색)
    //재귀+TREE
    //Queue를 사용한다
    //부모노드의 자식이 1개만 존재해도 성립 가능
    

    Node root; 
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        RecursionTreeBFS tree = new RecursionTreeBFS();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.BFS(tree.root);
    }

    public void BFS(Node root) {
        if(root==null) {
            return;
        }
        else {
            System.out.print(root.data + " "); // 1 2 4 5 6 3 7
            //System.out.println();
            BFS(root.lt);
            //System.out.print(root.data + " "); // 4 2 5 1 6 3 7
            //System.out.println();
            BFS(root.rt);
            //System.out.print(root.data + " "); // 4 5 2 6 7 3 1
            //System.out.println();
        }
    }

}
