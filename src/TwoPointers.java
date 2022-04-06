import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TwoPointers {
    //투 포인터 알고리즘
    //배열2개에 대해 p1, p2사용하여 while탐색후 합치기
    //!!!이미 정렬된 오름차순 배열일시 적용 가능 (정렬되지 않았다면 Arrays.sort로 정리해주고 사용)

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for(int i=0; i<n; i++) {
            arr1[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for(int i=0; i<m; i++) { 
            arr2[i] = sc.nextInt();
        }

        solutionTp1(n, m, arr1, arr2);
    }

    public static void solutionTp1(int n, int m, int[] arr1, int[] arr2) {
        List<Integer> answerArr = new ArrayList<Integer>();
        int p1 = 0;
        int p2 = 0;

        Arrays.sort(arr1); //2 4 8
        Arrays.sort(arr2); //11 6 1 23 7 17 9 => 1 6 7 9 11 17 23

        while(p1 < n && p2 < m) {
            if(arr1[p1] < arr2[p2]) {
                answerArr.add(arr1[p1++]);
            }
            else {
                answerArr.add(arr2[p2++]);
            }
        }
        while(p1 < n) {
            answerArr.add(arr1[p1++]);
        }
        while(p2 < m) {
            answerArr.add(arr2[p2++]);
        }

        System.out.println(answerArr);
    }

    public static void solutionTp2(int n, int m, int[] arr1, int[] arr2) {
        //sliding window
        //p1~p2의 범위가 1씩 증가하며 일정 범위(창문,window) 쭉 밀고가는(slide) 형태
        //{3,5,6,7,9,11} 에서 2씩 탐색하라
        //{3,5} p1=3, p2=5
        //{5,6} p1=5, p2=6
        //{6,7} p1=6, p2=7
        //{7,9} p1=7, p2=9
        //{9,11} p1=9, p2=11

    }
}
