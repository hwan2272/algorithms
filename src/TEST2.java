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
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> arrList = new ArrayList();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                for(int k=0; k<n; k++) {
                    int card1 = arr[i];
                    int card2 = arr[j];
                    int card3 = arr[k];
                    if(i != j && j != k && k != i) {
                        arrList.add((card1 + card2 + card3));
                    }
                }
            }
        }
        int curM = Integer.MIN_VALUE;
        for(int x : arrList) {
            if(x <= m) {
                curM = Math.max(curM, x);
            }
        }
        System.out.println(curM);
    }
}
