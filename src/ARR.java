import java.util.*;
public class ARR {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // 입력값예시
        // 5

        // 정수값 입력(타겟이될 배열의 사이즈)
        int size = sc.nextInt();

        //정수 배열 생성(동적사이즈)
        int[] intArr = new int[size];
        /*for(int i=0; i<intArr.length; i++) {
            intArr[i] = sc.nextInt(); //동적사이즈 만큼 입력받은 데이터로 배열값 생성 (정수)
        }*/
        for(int i=0; i<intArr.length; i++) {
            intArr[i] = i;
        }
        solutionInt2(intArr);
        
        /*int[] intArr = new int[size+2];
        intArr[0] = 1;
        intArr[1] = 1;
        solutionInt3(intArr);
        */


        //문자열 배열
        /*String[] stringArr = new String[size];
        for(int i=0; i<stringArr.length; i++) {
            stringArr[i] = sc.next(); //동적사이즈 만큼 입력받은 데이터로 배열값 생성 (문자열) // aBc25 bdc99 20Df8 28d5630 9876Asf
        }
        //solutionStr(stringArr);
        //solutionStr2(stringArr);
        //solutionStr3(stringArr);
        //solutionStr4(stringArr);
        //solutionStr5(stringArr);
        solutionStr6(stringArr);*/
    }

    public static void solutionInt(int[] intArr) {
        for(int data : intArr) {
            System.out.print(data + " ");
        }
        System.out.println();
    }

    public static void solutionInt2(int[] intArr) {
        //소수찾기 (에라토스테네스의 체)
        int[] ansArr = new int[intArr.length+1];
        int len = intArr.length;

        ansArr[0] = ansArr[1] = 1;
        
        for(int i=2; i*i<=len; i++){
            if(ansArr[i] != 1){
            	for(int j=i*i; j<=len; j+=i) ansArr[j] = 1;                
            }        
        }    
        
        // 소수 출력
        for(int k=1; k<=len; k++){
        	if(ansArr[k] != 1) System.out.print(k+" ");        
        }
    }

    public static void solutionInt3(int[] intArr) {
        //피보나치수열
        String answer = "";
        int[] answerArr = new int[intArr.length];
        answerArr[0] = 1;
        answerArr[1] = 1;
        for(int i=2; i<intArr.length; i++) {
            intArr[i] = intArr[i-1] + intArr[i-2]; 
            answerArr[i] = intArr[i-1] + intArr[i-2]; 
        }
        for(int data : answerArr) {
            System.out.print(data + ",");
        }
    }

    public static void solutionStr(String[] strArr) {
        for(String data : strArr) {
            System.out.print(data + " ");
        }
        System.out.println();
    }

    public static void solutionStr2(String[] strArr) {
        //문자열중 숫자 찾기
        String answer = "";
        for(String data : strArr) {
            for(int i=0; i<data.length(); i++) {
                if(Character.isDigit(data.charAt(i))) {
                    answer += data.charAt(i);
                }
            }
            answer += " ";
        }
        System.out.println(answer);
    }

    public static void solutionStr3(String[] strArr) {
        //문자열 거꾸로출력
        String answer = "";
        for(String data : strArr) {
            StringBuilder sb = new StringBuilder(data).reverse();
            for(int i=0; i<sb.length(); i++) {
                answer += sb.charAt(i);
            }
            answer += " ";
        }
        System.out.println(answer);
    }

    public static void solutionStr4(String[] strArr) {
        //ascii 출력
        String answer = "";
        for(String data : strArr) {
            for(int i=0; i<data.length(); i++) {
                answer += (int)data.charAt(i);
            }
            answer += " ";
        }
        System.out.println(answer);
    }

    public static void solutionStr5(String[] strArr) {
        //문자열 대소문자 역출력ascii 출력
        //A-Z : 65 ~ 90
        //a-z : 97 ~ 122
        String answer = "";
        for(String data : strArr) {
            for(int i=0; i<data.length(); i++) {
                if(data.charAt(i) >= 65 && data.charAt(i) <= 90) {
                    answer += (data.charAt(i) + 32) + " ";
                }
                else if(data.charAt(i) >= 97 && data.charAt(i) <= 120) {
                    answer += (data.charAt(i) - 32) + " ";
                }
                else {
                    answer += data.charAt(i) + " ";
                }
            }
            answer += " ";
        }
        System.out.println(answer);
    }

    public static void solutionStr6(String[] strArr) {
        //문자열 대소문자 역출력
        //A-Z : 65 ~ 90
        //a-z : 97 ~ 122
        String answer = "";
        for(String data : strArr) {
            for(int i=0; i<data.length(); i++) {
                if(data.charAt(i) >= 65 && data.charAt(i) <= 90) {
                    answer += Character.toString((char)(data.charAt(i) + 32));
                }
                else if(data.charAt(i) >= 97 && data.charAt(i) <= 120) {
                    answer += Character.toString((char)(data.charAt(i) - 32));
                }
                else {
                    answer += data.charAt(i);
                }
            }
            answer += " ";
        }
        System.out.println(answer);
    }
}
