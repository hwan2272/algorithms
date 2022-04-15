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

    public static int getGcd(int min, int max) {
        int divided = min;
        int gcd = 0;
        while(divided > 0) {
            if(max%min == 0) {
                gcd = min;
                return gcd;
            }
            else {
                divided = max%min;
                max = min;
                min = divided;
            }
        }
        return -1;
    }

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.valueOf(br.readLine());
        int[] arr = new int[n];
        
        //boolean[] bArr = new boolean[1000000001];
        
        for(int i=0; i<n; i++) {
            arr[i] = Integer.valueOf(br.readLine());
        }

        Arrays.sort(arr);
        int gcd = arr[1]-arr[0];
        for(int i=1; i<arr.length; i++) {
            gcd = Math.min(gcd, getGcd(gcd,(arr[i]-arr[i-1])));
        }

        for(int i=2; i<=gcd; i++) {
            if(gcd%i == 0) {
                sb.append(i + " ");
            }
        }

       bw.write(sb.toString());
       bw.flush();
       bw.close();
    }
}
