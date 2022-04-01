import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
public class QUEUE {
    //큐 : 선입선출, 후입후출

    public static void main(String[] args) throws Exception {
        int[] arr = {1,2,3,4,5,6};
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
        }
    }
}