import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.*;
public class TEST2 {
    static StringBuilder sb = new StringBuilder();
    static Queue<Position> q = new LinkedList();
    static int n;
    static int m;
    static int[][] box;
    static int[][] result;

    static int[] nxArr = {-1, 0, 1, 0};
    static int[] nyArr = {0, 1 ,0, -1};

    public static void BFS() {
        while(!q.isEmpty()) {
            Position thisP = q.poll();
            for(int i=0; i<4; i++) {
                int nx = thisP.x + nxArr[i];
                int ny = thisP.y + nyArr[i];
                if(nx >= 0 && nx<m && ny >= 0 && ny<n &&  box[nx][ny] == 0) {
                    box[nx][ny] = 1;
                    q.offer(new Position(nx, ny));
                    result[nx][ny] = result[thisP.x][thisP.y] + 1;
                }
            }

        }
    }

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        box = new int[m][n];
        result = new int[m][n];

        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                box[i][j] = sc.nextInt();
                if(box[i][j] == 1) {
                    q.offer(new Position(i, j));
                }
            }
        }
        BFS();

        boolean flag = true;
        int days = Integer.MIN_VALUE;
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(box[i][j] == 0) {
                    flag = false;
                }
            }
        }
        if(flag) {
            for(int i=0; i<m; i++) {
                for(int j=0; j<n; j++) {
                    days = Math.max(days, result[i][j]);
                }
            }
        }
        else days = -1;
        System.out.println(days);
    }

    public static class Position {
        int x;
        int y;

        public Position(int x, int y) {
            this.x=x;
            this.y=y;
        }
    }
}
