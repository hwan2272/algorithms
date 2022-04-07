import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.stream.Collector;
public class QUEUE {
    //큐 : 선입선출, 후입후출 (FIFO)

    //자주쓰는 메소드
    //Queue.offer
    //Queue.poll
    //Queue.peek
    //Queue.contains
    //Queue.size

    public static void main(String[] args) throws Exception {
        QUEUE qs = new QUEUE();
        int[] progresses = {95, 90, 99, 99, 80, 99}; 
        int[] speeds = {1, 1, 1, 1, 1, 1};
        //int[] progresses = {2,2,1,2}; 
        //int[] speeds = {1,1,1,1};
        for(int data : qs.solution(progresses, speeds)) System.out.print(data + " ");
        /*int[] arr = {1,2,3,4,5,6};
        int[] queue = new int[6];

        int size = 0;

        //queue에 데이터를 삽입
        System.out.print("IN :  ");
        for(int data : arr) {
            queue[size++] = data;
            System.out.print(data + " ");
        }

        //queue에서 데이터를 추출(선입선출, 후입후출)
        System.out.print("  OUT : ");
        for(int i=0; i<queue.length; i++) {
            System.out.print(queue[i] + " ");
        }*/
    }

    /*public static void solution() {
        Queue<Integer> Q = new LinkedList<>(); //초기화선언
        List<Integer> arr = new ArrayList();
        int[] arr2 = arr.stream().collect(

    }*/

    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        
        List<Integer> answerArr = new ArrayList();
        Queue<Prog> q = new LinkedList();
        int[] daysArr = new int[progresses.length];
        
        for(int i=0; i<progresses.length; i++) {
            if(progresses[i] != 100) {
                int days = ((100 - progresses[i]) / speeds[i]);
                if(((100 - progresses[i]) % speeds[i]) != 0) {
                    days = ((100 - progresses[i]) / speeds[i]) + 1;
                }
                daysArr[i] = days;
            }
        }
        
        for(int i=0; i<daysArr.length; i++) {
            Prog prog = new Prog(i, daysArr[i]);
            q.offer(prog);
        }
        
        int cnt = 0;
        while(!q.isEmpty()) {
            Prog prog = q.poll();
            int progIndex = prog.id;
            for(int i=progIndex; i<daysArr.length; i++) {
                if(daysArr[i] != -1) {
                    if(prog.day >= daysArr[i]) {
                        cnt++;
                        daysArr[i] = -1;
                        if(i == daysArr.length-1) {
                            answerArr.add(cnt);
                            cnt = 0;
                            break;
                        }
                    }
                    else {
                        answerArr.add(cnt);
                        cnt = 0;
                        break;
                    }
                }
                else {
                    break;
                }
            }
        }
        
        answer = new int[answerArr.size()];
        for(int i=0; i<answerArr.size(); i++) {
            answer[i] = answerArr.get(i);
        }

        return answer;
    }
    
    class Prog {
        int id;
        int day = 0;
        
        public Prog(int id, int day) {
            this.id = id;
            this.day = day;
        }
    }
}
