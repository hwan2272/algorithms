import java.util.*;
public class PriorityQUEUE {
    static StringBuilder sb = new StringBuilder();

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<AbsNums> pq = new PriorityQueue<>();
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            int data = sc.nextInt();
            if(data != 0) {
                AbsNums nums = new AbsNums(Math.abs(data), data);
                pq.offer(nums);
            }
            else {
                if(pq.isEmpty()) {
                    sb.append(0).append(System.lineSeparator());
                }
                else {
                    sb.append(pq.peek().realNum).append(System.lineSeparator());
                    pq.poll();
                }
            }
        }
    }

    public static class AbsNums implements Comparable<AbsNums> {
        int absNum;
        int realNum;

        public AbsNums(int absNum, int realNum) {
            this.absNum=absNum;
            this.realNum=realNum;
        }

        @Override
        public int compareTo(AbsNums o) {
            if(this.absNum == o.absNum) return this.realNum-o.realNum;
            else return this.absNum-o.absNum;
        }
    }
}
