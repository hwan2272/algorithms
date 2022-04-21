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
        List<Times> arr = new ArrayList();
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            Times obj = new Times(s, e);
            arr.add(obj);
        }
        
        int cnt = 0;
        Collections.sort(arr);
        int et = 0;
        for(Times t : arr) {
            if(t.startT >= et) {
                cnt++;
                et = t.endT;
            }
        }

        System.out.println(cnt);
    }

    public static class Times implements Comparable<Times> {
        int startT;
        int endT;

        public Times(int startT, int endT) {
            this.startT=startT;
            this.endT=endT;
        }

        @Override
        public int compareTo(Times o) {
            if(o.endT == this.endT) return this.startT-o.startT;
            else return this.endT-o.endT;

        }
        
    }
}
