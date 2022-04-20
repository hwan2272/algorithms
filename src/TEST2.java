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
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        int n = Integer.valueOf(input.split(" ")[0]);
        int goalMoney = Integer.valueOf(input.split(" ")[1]);
        int[] moneyArr = new int[n];
        int cnt = 0;
        for(int i=0; i<n; i++) {
            moneyArr[i] = Integer.valueOf(br.readLine());
        }
        Arrays.sort(moneyArr);

        for(int i=moneyArr.length-1; i>-1; i--) {
            if(moneyArr[i] <= goalMoney && goalMoney > 0) {
                cnt += goalMoney/moneyArr[i];
                goalMoney = goalMoney%moneyArr[i];
            }
        }
        sb.append(cnt);
        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}
