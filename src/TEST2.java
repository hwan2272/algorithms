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
        //Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());
        String[] arr = br.readLine().split(" ");
        String[] resultArr = arr.clone();

        //Stack<String> st = new Stack();
        Stack<Nums> st = new Stack();
        for(int i=0; i<n; i++) {
            while(!st.isEmpty() && Integer.valueOf(arr[st.peek().idx]) < Integer.valueOf(arr[i])) {
                resultArr[st.pop().idx] = arr[i];
            }
            Nums nums = new Nums(i, arr[i]);
            st.push(nums);
        }

        while(!st.isEmpty()) {
            resultArr[st.pop().idx] = "-1";
        }

        for(String x : resultArr) {
            sb.append(x + " ");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    public static class Nums {
        int idx;
        String data;

        public Nums(int idx, String data) {
            this.idx=idx;
            this.data=data;
        }

    }
}
