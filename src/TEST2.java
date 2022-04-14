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
    public static int getHansuCnt(int n) {
        System.out.println("cur:::" + n);
        int cnt = 0;
        String nStr = String.valueOf(n);
        char[] nStrArr = nStr.toCharArray();
        if(nStrArr.length == 3) {
            if(
                Integer.valueOf(Character.toString(nStr.charAt(0)))-Integer.valueOf(Character.toString(nStr.charAt(1))) == 
                Integer.valueOf(Character.toString(nStr.charAt(1)))-Integer.valueOf(Character.toString(nStr.charAt(2)))
                ) {
                cnt = 1;
            }
            else {
                cnt = 0;
            }
        }
        else {
            if(n != 1000) {
                cnt = 1;
            }
        }
        return cnt;
    }

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        for(int i=1; i<=n; i++) {
            result += getHansuCnt(i);
        }
        System.out.println(result);
    }
}
