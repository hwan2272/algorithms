import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.rmi.ConnectIOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
public class TEST {

    /*public static String MGsolution(String sentence) {
         //      안쓴 알파벳 소문자 오름차순으로 출력
        //      다 썼으면 "perfect" 출력
        StringBuilder sb = new StringBuilder();
        sentence = sentence.toLowerCase();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        char[] charArr = alphabet.toCharArray();

        for(int i=0; i<sentence.length(); i++) {
            if(sentence.charAt(i) != ' ') {
                for(int j=0; j<charArr.length; j++) {
                    if(charArr[j] != ' ') {
                        if(sentence.charAt(i) == charArr[j]) {
                            sentence.replace(sentence.charAt(i), ' ');
                            charArr[j] = ' ';
                        }
                    }
                }
            }
        }

        Arrays.sort(charArr);
        for(char data : charArr) {
            if(data != ' ') {
                sb.append(data).append(System.lineSeparator());
            }
        }
        sb.append("perfect").append(System.lineSeparator());
        return sb.toString();

     }

     public static int MGsolution2(int p) {
         //      1987년 시작해서 11987 되기 전에 겹치는 숫자가 없는 제일 작은 연도, 없으면 -1
         int cnt = 10000;
         int year = -1;
      
         while (cnt-- > 0) {
            int target =  p+cnt;
            String targetStr = String.valueOf(target);
            char[] arr = targetStr.toCharArray();

            boolean duplYn = false;
            for(int i=0; i<arr.length; i++) {
                for(int j=i+1; j<arr.length; j++) {
                    if(arr[i] == arr[j]) {
                        duplYn = true;
                        break;
                    }
                }
            }
            if(duplYn == false) {
                if(target != 1987) { 
                    year = target;
                }
            }
         }
         return year;
         //return -1;
     }

     public static int MGsolution3(String a, String b) {
        //      숫자만 뽑아서 두 수의 합 구하기
        String buf1 = "";
        String buf2 = "";

        char [] arr1 = a.toCharArray();
        char [] arr2 = b.toCharArray();

        for(char data1 : arr1) {
            if(Character.isDigit(data1)) {
                buf1 += data1;
            }
        }

        for(char data2 : arr2) {
            if(Character.isDigit(data2)) {
                buf2 += data2;
            }
        }

       return Integer.parseInt(buf1) + Integer.parseInt(buf2);
    }

    public static String binarySearch(String[] dicArr, String question) {
        int mid = 0;
        int start = 0;
        int end = dicArr.length-1;
        System.out.println("current question :::: "+ question + " ");

        while(start <= end) {
            mid = (start+end)/2;

            String key = dicArr[mid].split("_")[1];
            String value = dicArr[mid].split("_")[0];
            System.out.println("current Mid :::: "+ key + " " + value);

            if(Character.isDigit(question.charAt(0))) {
                if(Integer.valueOf(key) == Integer.valueOf(question)) {
                    return value;
                }
                else {
                    if(Integer.valueOf(question) > Integer.valueOf(key)) {
                        start=mid+1;
                    }
                    else {
                        end=mid-1;
                    }
                }
            }
            else {
                if(value.toUpperCase().equals(question.toUpperCase())) {
                    return key;
                }
                else {
                    if(question.toUpperCase().charAt(0) > value.toUpperCase().charAt(0)) {
                        start=mid+1;
                    }
                    else {
                        end=mid-1;
                    }
                }
            }
        }
        return "";
    } */
    static BigInteger[][] arr = new BigInteger[101][101];
    public static BigInteger DFSCombination(int n, int m) {
        BigInteger big0 = new BigInteger("0");
        BigInteger big1 = new BigInteger("1");

        if(arr[n][m]!=null && arr[n][m].compareTo(big0) == 1) return arr[n][m];
        if(n==m || m==0) return big1;
        else return 
        arr[n][m] =
            DFSCombination(n-1, m-1).add(
            DFSCombination(n-1, m));
    }
    
    static int k;
    static int gcd;
    static int lcm;
    static StringBuilder sb = new StringBuilder();
    static StringBuilder resultSb = new StringBuilder();
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        /*int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            sb.append(getLcm(a,b)).append(System.lineSeparator());
        }
        System.out.println(sb);*/

        //Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int a = sc.nextInt();
            if(a == 0) {
                break;
            }

            StringBuilder sb = new StringBuilder(String.valueOf(a));
            StringBuilder sbR = new StringBuilder(String.valueOf(a)).reverse();

            System.out.println(Integer.parseInt(sb.toString()) + ":::" + Integer.parseInt(sbR.toString()));
            
            if(sb.toString().equals(sbR.toString())) {
                resultSb.append("yes").append(System.lineSeparator());
            }
            else {
                resultSb.append("no").append(System.lineSeparator());
            }

            
            
        }
        System.out.println(resultSb);
    }

    public static int getGcd(int a, int b) {
        int[] arr = new int[2];
        arr[0] = a;
        arr[1] = b;
        Arrays.sort(arr);
        k = arr[0];
        while(k>0) {
            if(a%k == 0 && b%k == 0) {
                gcd = k;
                return gcd;
            }
            k--;
        }
        
        return -1;
    }
    
    public static int getLcm(int a, int b) {
        int[] arr = new int[2];
        arr[0] = a;
        arr[1] = b;
        Arrays.sort(arr);
        
        int max = arr[1];
        int min = arr[0];
        int divided = min;

        while(divided>0) {
            if(max%min == 0) {
                gcd = min;
                return arr[1]*arr[0]/gcd;
            }
            else {
                divided = max%min;
                max = min;
                min = divided;
            }
        }
        
        return -1;
    }
    
    //public static void main(String[] args) throws Exception {
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

        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String readLine = br.readLine();
        int size = Integer.valueOf(readLine.split(" ")[0]);
        int questions = Integer.valueOf(readLine.split(" ")[1]);
        String[] dicArr = new String[size];
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<size; i++) {
            String name = br.readLine();
            //dicArr[i] = name + "_" + i;
            //dicArr[i] = i+1 + "_" + name;
            dicArr[i] = name + "_" + (i+1);
        }
        Arrays.sort(dicArr);
        for(int i=0; i<dicArr.length; i++) {
            System.out.println(dicArr[i]);
        }
        bw.write(sb.toString());
       bw.flush();
       bw.close();*/

        //      안쓴 알파벳 소문자 오름차순으로 출력
        //      다 썼으면 "perfect" 출력

        /*
        System.out.println(MGsolution(
            "His comments came after Pyongyang " +
            "announced it had a plan to fire four " +
            "missiles near the US territory of Guam."
        ));//bjkqvwxz
        */

        //      1987년 시작해서 11987 되기 전에 겹치는 숫자가 없는 제일 작은 연도, 없으면 -1
        //System.out.println(MGsolution2(1987));

        //      숫자만 뽑아서 두 수의 합 구하기
        //System.out.println(MGsolution3("1dsg11asdfg1", "asdf8889"));//10000


        /*Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while(sc.hasNext()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(a == 0 || b == 0 || c == 0) {
                break;
            }
            else {
                int[] arr = new int[3];
                arr[0] = a;
                arr[1] = b;
                arr[2] = c;
                Arrays.sort(arr);
                if(Math.pow(arr[0], 2) + Math.pow(arr[1], 2) == Math.pow(arr[2], 2)) {
                    sb.append("right").append(System.lineSeparator());
                }
                else if(arr[0]%3 == arr[1]/4 && arr[1]/4 == arr[2]/5 &&
                    arr[0]%3 == 0 && arr[1]%4 == 0 && arr[2]%5 == 0) {
                    sb.append("right").append(System.lineSeparator());
                }
                else {
                    sb.append("wrong").append(System.lineSeparator());
                }
            }
        }
        System.out.println(sb);*/


        /*Scanner sc = new Scanner(System.in);
        int maxNum = sc.nextInt();
        Queue<Integer> q = new LinkedList();
        
        for(int i=1; i<maxNum+1; i++) {
            q.offer(i);
        }
        
        int num = 0;
        while(!q.isEmpty()) {
            if(q.size() == 1) {
                num = q.peek();
                break;
            }
            num = q.poll();
            num = q.poll();
            q.offer(num);
        }
        
        System.out.println(num);*/

        /*Scanner sc = new Scanner(System.in);
        int caseSize = sc.nextInt();
        int[] caseArr = new int[caseSize];
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<caseArr.length; i++) {
            int printsCnt = sc.nextInt();
            int targetIdx = sc.nextInt();
            Queue<Print> q = new LinkedList<>();
            for(int j=0; j<printsCnt; j++) {
                Print p = new Print(j, sc.nextInt());
                q.offer(p);
            }

            
            int cnt = 0;
            while(!q.isEmpty()) {
                Print qPoll = q.poll();
                for(Print qData : q) {
                    if(qPoll.data < qData.data) {
                        q.offer(qPoll);
                        qPoll = null;
                        break;
                    }
                }
                if(qPoll != null) {
                    cnt++;
                    if(qPoll.id == targetIdx) {
                        sb.append(cnt).append(System.lineSeparator());
                    }
                }
            }
        }
        System.out.println(sb);*/


        

        /*Scanner sc = new Scanner(System.in);
        int afternoon = sc.nextInt();
        int night = sc.nextInt();
        int goal = sc.nextInt();
        int cnt = (int)(Math.ceil((goal-night) / (double)(afternoon-night)));

        System.out.println(cnt);*/


        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int size = Integer.parseInt(br.readLine());
        String[] commandsArr = new String[size];
        Queue<Integer> q = new LinkedList();
        StringBuilder sb = new StringBuilder();

        int offerVal = 0;
        int backVal = 0;
        for(int i=0; i<commandsArr.length; i++) {
            String commands = br.readLine();
            if(commands.contains("push")) {
                String[] pushCommArr = commands.split(" ");
                commands = pushCommArr[0];
                offerVal = Integer.parseInt(pushCommArr[1]);
            }
            switch(commands) {
                case "push" :
                    q.offer(offerVal);
                    backVal = offerVal;
                break;
                case "pop" :
                    sb.append(q.isEmpty() ? -1 : q.poll()).append(System.lineSeparator());
                break;
                case "size" :
                    sb.append(q.size()).append(System.lineSeparator());
                break;
                case "empty" :
                    sb.append(q.isEmpty() ? 1 : 0).append(System.lineSeparator());
                break;
                case "front" :
                    sb.append(q.isEmpty() ? -1 : q.peek()).append(System.lineSeparator());
                break;
                case "back" :
                    sb.append(q.isEmpty() ? -1 : backVal).append(System.lineSeparator());
                break;
                default :
                break;
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();*/

        /*String input = sc.next();
        input = input.toUpperCase();
        int cnt = 0;
        String speling = "";
        int spelingCnt = 0;
        for(int i=0; i<input.length(); i++) {
            if(i==0) cnt++;
            if(i==input.length()-1) continue;
            if(speling.isEmpty() && input.charAt(i) == input.charAt(i+1)) {
                cnt++;
                speling = Character.toString(input.charAt(i));
                spelingCnt = cnt;
            }
            else {
                if(!speling.isEmpty() && spelingCnt == cnt && input.charAt(i) == input.charAt(i+1)) {
                    speling = "?";
                }
                else {
                    cnt = 0;
                }
            }
        }
        System.out.println(speling);*/

        /*int size = sc.nextInt();
        int[] arr = new int[size];

        int target = sc.nextInt();

        for(int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }

        String answer = "";
        for(int i=0; i<size; i++) {
            if(target > arr[i]) {
                answer += arr[i] + " ";
            }
        }
        System.out.println(answer);*/



        /*int[] arr = new int[11];
        for(int i=0; i<10; i++) {
            arr[i] = sc.nextInt();
            arr[i] = arr[i] % 42;
        }

        Arrays.sort(arr);

        int cnt = 0;
        for(int i=0; i<11; i++) {
            if(i==0) cnt++;
            if(i==10) continue;
            if(i!= 0 && arr[i] != arr[i+1]) {
                cnt++;
            }
        }
        System.out.println(cnt);*/
        
        
		/*int size;
		size = sc.nextInt();
        int[] arr = new int[size];
		for(int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int max = arr[size-1];

        double sum = 0;
        for(int i=0; i<size; i++) {
            sum += (arr[i] / (double)max * 100);
        }
        System.out.println((sum / (double)size));*/

        /*Scanner sc = new Scanner(System.in);
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
        System.out.println(rowGuardsNeeds);*/
        


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
    //}
}
