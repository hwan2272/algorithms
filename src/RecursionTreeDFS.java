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

public class RecursionTreeDFS {
    //깊이우선탐색
    //재귀+TREE
    //재귀 실행시 그만큼 StackFrame이 발생하므로 for보다 성능이 좋지않음
    //이진트리순회
    //static int[] fibo;
    static long[] fibo;

    //BackTracking
    //모든경우의수
    static int n;
    static int[] ch;

    Node root; 
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        RecursionTreeDFS tree = new RecursionTreeDFS();
        /*tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.DFS(tree.root);*/
        
        /*
        //System.out.print(tree.DFSFibonacci(sc.nextInt()) + " ");
        int n = sc.nextInt();
        //fibo = new int[n+1];
        fibo = new long[n+1];
        tree.DFSFibonacci(n);
        for(int i=1; i<=n; i++) System.out.print(fibo[i] + " ");
        */

        n = sc.nextInt();
        ch = new int[n+1];
        tree.DFSSubset(1);
    }

    public void DFS(Node root) {
        if(root==null) {
            return;
        }
        else {
            System.out.print(root.data + " "); // 1 2 4 5 6 3 7
            //System.out.println();
            DFS(root.lt);
            //System.out.print(root.data + " "); // 4 2 5 1 6 3 7
            //System.out.println();
            DFS(root.rt);
            //System.out.print(root.data + " "); // 4 5 2 6 7 3 1
            //System.out.println();
        }
    }

    public long DFSFibonacci(int n) {
        if(fibo[n] > 0) {
            return fibo[n]; //메모리제이션: 기존 계산된값 가져오기
        }
        if(n == 1) {
            return fibo[n] = 1;
            //return 1;
        }
        else if(n == 2) {
            return fibo[n] = 1;
            //return 1;
        }
        else {
            return fibo[n] = DFSFibonacci(n-2) + DFSFibonacci(n-1); 
            //return DFSFibonacci(n-2) + DFSFibonacci(n-1); 
        }
    }

    public void DFSSubset(int L) {
        if(n+1 == L) {
            String tmp = "";
            for(int i=1; i<=n; i++) {
                if(ch[i]==1) {
                    tmp += (i + " ");
                }
            }
            if(tmp.length() > 0) {
                System.out.println(tmp);
            }
        }
        else {
            ch[L] = 1;
            DFSSubset(L+1);
            ch[L] = 0;
            DFSSubset(L+1); 
        }
    }

}
