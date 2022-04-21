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
    static int n; 
    static int[] queensArr;
    static int cnt;

    public static boolean check(int row) {
        for(int i=0; i<row; i++) {
            if(queensArr[i] == queensArr[row]) {
                return false;
            }
            else if(Math.abs(queensArr[i] - queensArr[row]) == Math.abs(i - row)) {
                return false;
            }
        }
        return true;
    }

    public static int backTracking(int row) {
        int r= 0;
        if(row==n) return 1;

        for(int i=0; i<n; i++) {
            queensArr[row] = i;
            if(check(row)) {
                r += backTracking(row+1);
            }
        }
        return r;
    }

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        queensArr = new int[n];
        cnt = backTracking(0);
        System.out.println(cnt);
    }
}
