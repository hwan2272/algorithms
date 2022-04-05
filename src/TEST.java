import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
public class TEST {
    public static void main(String[] args) throws Exception {
        //자주쓰는 함수 정리
        //Scanner
        //Scanner.nextInt
        //Scanner.next
        //Scanner.nextLine
        //Scanner.nextBigInteger

        //Character
        //Character.toString
        //Character.valueOf

        //String
        //String.toString
        //String.valueOf
        //String.indexOf
        //String.charAt
        
        //Integer
        //Integer.parseInt
        //Integer.valueOf

        //BigInteger
        //BigInteger.add
        //BigInteger.substract
        //BigInteger.multiply
        //Biginteger.divide
        //BigInteger.remainder
        
        //[]
        //[].length
        //[].size()

        //Arrays
        //Arrays.sort([])


        Scanner sc = new Scanner(System.in);
        int rowSize = sc.nextInt();
        int colSize = sc.nextInt();

        String arr[] = new String[rowSize];

        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.next();
        }

        int sumDot = 0;
        int rowGuardsNeeds = 0;
        for(String data :  arr) {
            for(int j=0; j<colSize; j++) {
                if("X".equals(Character.toString((char)data.charAt(j)))) {
                    sumDot += 0;
                }
                else if(".".equals(Character.toString((char)data.charAt(j)))) {
                    sumDot += 1;
                }
            }
            if(sumDot % colSize == 0) {
                rowGuardsNeeds += (sumDot / colSize);
            }
            sumDot = 0;
        }
        System.out.println(rowGuardsNeeds);
        


        /*Scanner sc = new Scanner(System.in);
        String result = "";
        int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
        
        Calendar cal1 = Calendar.getInstance();
        cal1.set(2015,a-1,b,0,0,0);
        cal1.set(Calendar.MILLISECOND, 0);

        Calendar cal2 = Calendar.getInstance();
        cal2.set(2015,1,18,0,0,0);
        cal2.set(Calendar.MILLISECOND, 0);
        
        if(cal1.compareTo(cal2) == 0) {
            result = "Special";
        }
        else if(cal1.before(cal2)) {
            result = "Before";
        }
        else if(cal1.after(cal2)) {
            result = "After";
        }
        System.out.println(result);*/

        /*Scanner sc = new Scanner(System.in);
		BigInteger a;
		a = sc.nextBigInteger();
        if(a == BigInteger.valueOf(1)) {
            System.out.println(4);    
        }
        else {
            System.out.println((a.subtract(BigInteger.valueOf(1))).multiply(BigInteger.valueOf(4)).subtract(BigInteger.valueOf(1)).add(BigInteger.valueOf(5)));
        }*/

        /*Scanner sc = new Scanner(System.in);
		BigInteger a;
		a = sc.nextBigInteger();
        BigInteger divied = new BigInteger("20000303");
        System.out.println(divied);

		System.out.println(a.remainder(divied));*/

        /*Scanner sc = new Scanner(System.in);
		BigInteger a, b;
		a = sc.nextBigInteger();
		b = sc.nextBigInteger();
		System.out.println(a.add(b));
        System.out.println(a.subtract(b));
        System.out.println(a.multiply(b));*/

        /*Scanner sc = new Scanner(System.in);
		int a, b, c;
		a = sc.nextInt();
		b = sc.nextInt();
        c = sc.nextInt();
        
        int day = (c - (a - b));
		System.out.println(day);*/


        /*System.out.println("\\    /\\");
        System.out.println(" )  ( ')");
        System.out.println("(  /  )");
        System.out.println(" \\(__)|");

        System.out.println("|\\_/|");
        System.out.println("|q p|   /}");
        System.out.println("( 0 )\"\"\"\\");
        System.out.println("|\"^\"`    |");
        System.out.println("||_/=\\\\__|");
        */

        /*System.out.println("     /~\\");
        System.out.println("    ( oo|");
        System.out.println("    _\\=/_");
        System.out.println("   /  _  \\");
        System.out.println("  //|/.\\|\\\\");
        System.out.println(" ||  \\ /  ||");
        System.out.println("============");
        System.out.println("|          |");
        System.out.println("|          |");
        System.out.println("|          |");*/



        /*System.out.println("       _.-;;-._");
        System.out.println("'-..-'|   ||   |");
        System.out.println("'-..-'|_.-;;-._|");
        System.out.println("'-..-'|   ||   |");
        System.out.println("'-..-'|_.-''-._|");*/


        /*System.out.println(".  .   .");
        System.out.println("|  | _ | _. _ ._ _  _");
        System.out.println("|/\\|(/.|(_.(_)[ | )(/.");*/


        /*System.out.println("    8888888888  888    88888"); 
        System.out.println("    88     88   88 88   88  88"); 
        System.out.println("     8888  88  88   88  88888"); 
        System.out.println("        88 88 888888888 88   88"); 
        System.out.println(" 88888888  88 88     88 88    888888"); 
        System.out.println(""); 
        System.out.println(" 88  88  88   888    88888    888888"); 
        System.out.println(" 88  88  88  88 88   88  88  88"); 
        System.out.println(" 88 8888 88 88   88  88888    8888"); 
        System.out.println("  888  888 888888888 88  88      88"); 
        System.out.println("   88  88  88     88 88   88888888"); */


        /*System.out.println("SHIP NAME      CLASS          DEPLOYMENT IN SERVICE");
        System.out.println("N2 Bomber      Heavy Fighter  Limited    21        ");
        System.out.println("J-Type 327     Light Combat   Unlimited  1         ");
        System.out.println("NX Cruiser     Medium Fighter Limited    18        ");
        System.out.println("N1 Starfighter Medium Fighter Unlimited  25        ");
        System.out.println("Royal Cruiser  Light Combat   Limited    4         ");*/



        /*System.out.println("NFC West       W   L  T");
        System.out.println("-----------------------");
        System.out.println("Seattle        13  3  0");
        System.out.println("San Francisco  12  4  0");
        System.out.println("Arizona        10  6  0");
        System.out.println("St. Louis      7   9  0");
        System.out.println();
        System.out.println("NFC North      W   L  T");
        System.out.println("-----------------------");
        System.out.println("Green Bay      8   7  1");
        System.out.println("Chicago        8   8  0");
        System.out.println("Detroit        7   9  0");
        System.out.println("Minnesota      5  10  1");*/


        /*Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
        System.out.println(sdf.format(cal.getTime()));*/
    }
}
