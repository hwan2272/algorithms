import java.util.Scanner;
import java.util.Stack;

public class STACK {
    //스택 : 선입후출, 후입선출 (FILO)
    //오버플로우와 언더플로우가 존재 (일정 사이즈 이상 담을수없다)

    //자주쓰는 메소드
    //Stack.push
    //Stack.pop
    //Stack.peek
    //Stack.size

    public static void main(String[] args) throws Exception {
        /*int[] arr = {1,2,3,4,5,6};
        int[] stack = new int[6];

        int size = 0;

        //stack에 데이터를 삽입
        System.out.print("IN :  ");
        for(int data : arr) {
            stack[size++] = data;
            System.out.print(data + " ");
        }
        
        //stack에서 데이터를 추출(선입후출, 후입선출)
        System.out.print("  OUT : ");
        for(int i=stack.length-1; i>-1; i--) {
            System.out.print(stack[i] + " ");
        }*/
        solution();
    }

    public static void solution() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<size; i++) {
            String input = sc.next();
            char[] inputArr = input.toCharArray();
            String tmp = "";
            Stack<Character> s = new Stack();
            for(char charData : inputArr) {
                if(charData == '(') {
                    s.push(charData);
                }
                else if(charData == ')') {
                    if(!s.isEmpty()) {
                        s.pop();
                    }
                    else {
                        tmp += charData;
                    }
                }
            }
            if(!s.isEmpty() || !tmp.equals("")) {
                sb.append("NO").append(System.lineSeparator());
            }
            else {
                sb.append("YES").append(System.lineSeparator());
            }
        }
        System.out.println(sb);

        /*Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        Stack<Integer> s = new Stack();
        StringBuilder sb = new StringBuilder();

        int sum = 0;
        for(int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] != 0) {
                s.push(arr[i]);
            }
            else {
                s.pop();
            }
        }

        for(int num : s) {
            sum += num;
        }
        System.out.println(sum);*/
        

        

        /*Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String[] commandsArr = new String[size+1];
        Stack<Integer> s = new Stack();
        StringBuilder sb = new StringBuilder();

        int offerVal = 0;
        for(int i=0; i<commandsArr.length; i++) {
            String commands = sc.nextLine();
            if(commands.contains("push")) {
                String[] pushCommArr = commands.split(" ");
                commands = pushCommArr[0];
                offerVal = Integer.parseInt(pushCommArr[1]);
            }
            switch(commands) {
                case "push" :
                    s.push(offerVal);
                break;
                case "pop" :
                    sb.append(s.isEmpty() ? -1 : s.pop()).append(System.lineSeparator());
                break;
                case "size" :
                    sb.append(s.size()).append(System.lineSeparator());
                break;
                case "empty" :
                    sb.append(s.isEmpty() ? 1 : 0).append(System.lineSeparator());
                break;
                case "top" :
                    sb.append(s.isEmpty() ? -1 : s.lastElement()).append(System.lineSeparator());
                break;
                default :
                break;
            }
        }
        System.out.println(sb);*/
    }
}
