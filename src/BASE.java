import java.util.Scanner;

public class BASE {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a의값 ");
        int a = scanner.nextInt(); 
        System.out.println("b의값 ");
        int b = scanner.nextInt(); 
        System.out.println("c의값 ");
        int c = scanner.nextInt(); 
        getMax(a,b,c);
        getMed(a,b,c);
        judgeSign(a);

        System.out.println("d의값 : 1부터d까지의 합을 구함 ");
        int d = scanner.nextInt(); 
        //sumWhile(d);
        sumForPos(d);

        System.out.println("e의값 : 삼각형 그리기 ");
        int e = scanner.nextInt(); 
        drawTriangle(e);
        //drawPyramid(e);

        scanner.close();
    }

    private static void getMax(int a, int b, int c) {
        System.out.println("최대값 " + (
            (a>b && a>c)?
            a:
            (b>a && b>c)?
            b:
            (c>a && c>b)?
            c:
            a));
    }

    private static void getMed(int a, int b, int c) {
        int result = 0;
        if(a>=b) {
            if(b>=c) {
                result = b;
            }
            else if (a <= c) {
                result = a;
            }
            else {
                result = c;
            }
        }
        else if (a > c) {
            result = a;
        }
        else if (b > c) {
            result = c;
        }
        else {
            result = b;
        }
        System.out.println("중앙값 " + result);
    }

    private static void judgeSign(int a) {
        if(a>0) {
            System.out.println("a는 양수입니다. " + a);
        }
        else if(a<0) {
            System.out.println("a는 음수입니다. " + a);
        }
        else {
            System.out.println("a는 0입니다. ");
        }
    }

    private static void sumWhile(int d) {

        int sum = 0;
        /*int i = 1;

        while(i <= d) {
            sum += i;
            i++;
        }*/

        for(int i=1; i <= d; i++) {
            sum += i;
        }

        System.out.println("1부터 d까지의 합 " + sum);
    }

    private static void sumForPos(int d) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("입력값이 1보다 작습니다. 재입력해주세요.");
            d = scanner.nextInt();
        }
        while(d <= 0);
        sumWhile(d);

        //scanner.close();
    }

    private static void drawTriangle(int e) {
        for(int i=1; i<=e; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*private static void drawPyramid(int e) {
        
        for(int i=1;i<=e;i++) {
            for(int j=1;j<=i;j++) {
                if(e%2 == 0) {
                    System.out.print("* ");    
                }
                else {
                    System.out.print(" ");
                }
            
            }
            System.out.println();
        }
    }*/
}
