public class SORT {
    //정렬
    //선택정렬, 버블정렬, 삽입정렬, 병합정렬, 퀵정렬

    public static void main(String[] args) throws Exception {
        //int arr[] = {3,5,8,11,6,9};
        //int arr[] = {11,10,9,8,7,6,5};
        //int arr[] = {12,11,9,17,25,66,1};
        int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        selectionSort(arr);
        bubbleSort(arr);
        insertionSort(arr);
        //mergeSort(arr);
        //quickSort(arr);
    }

    public static void selectionSort(int[] arr) { //선택정렬
        //i=0, j=1 부터 돌면서 작은값과 큰값을 서로 선택하여 교체함
        //{3,5,8,11,6,9} i=3
        //{3,5,8,11,6,9} i=5
        //{3,5,6,11,8,9} i=6
        //{3,5,6,8,11,9} i=8
        //{3,5,6,8,9,11} i=9
        //총횟수 (n*(n-1))/2
        //시간복잡도 O(n^2) 오더엔제곱

        int n = arr.length;
        int count = 0;
        for(int i=0; i<n-1; i++) {
            int idx = i;
            for(int j=i+1; j<n; j++) {
                count++;
                if(arr[j] < arr[idx]) {
                    idx=j;
                }
                
            }
            int tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
        }
        System.out.println("selectionSort::: ");
        for(int data : arr) {
            System.out.print(data + " ");
        }
        System.out.print("횟수" + count);
        System.out.println();
    }

    public static void bubbleSort(int[] arr) { //버블정렬
        //i=0, j=1 부터 돌면서 바로 뒤의값과 비교하여 교체
        //{3,5,8,11,6,9} i=3
        //{3,5,8,11,6,9} i=5
        //{3,5,8,11,6,9} i=8
        //{3,5,8,6,11,9} i=11인데 swap되면서 6
        //{3,5,8,6,9,11} i=9 //최대값11
        
        //{3,5,8,6,9} i=3 //최대값 제외 나머지 정렬시작
        //{3,5,8,6,9} i=5
        //{3,5,6,8,9} i=8인데 swap되면서 6
        //{3,5,6,8,9} i=8 //정렬완료
        //총횟수 (n*(n-1))/2
        //시간복잡도 O(n^2) 오더엔제곱

        int n = arr.length;
        int count = 0;
        for(int i=0; i<n-1; i++) {
            for(int j=0; j<n-1-i; j++) {
                count++;
                if(arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
                
            }
        }
        System.out.println("bubbleSort::: ");
        for(int data : arr) {
            System.out.print(data + " ");
        }
        System.out.print("횟수" + count);
        System.out.println();
    }

    public static void insertionSort(int[] arr) { //삽입정렬
        //작은값을 사이에 삽입하여 정렬시킴
        //최소값이 맨 앞에 오도록 정렬
        //{3,5,8,11,6,9}
        //{3,5,6,8,11,9} 6을 8앞에 삽입
        //{3,5,6,8,9,11} 9를 11앞에 삽입
        //총횟수 (n-1)
        //시간복잡도 O(n-1) 오더엔마이너스1

        int n = arr.length;
        int count = 0;
        for(int i=1; i<n; i++) {
            int tmp = arr[i];
            int j = 0;
            for(j=i-1; j>=0; j--) {
                count++;
                if(arr[j]>tmp) {
                    arr[j+1] = arr[j];
                }
                else {
                    //continue;
                    break;
                }
                
            }
            arr[j+1] = tmp;
        }
        System.out.println("insertionSort::: ");
        for(int data : arr) {
            System.out.print(data + " ");
        }
        System.out.print("횟수" + count);
        System.out.println();
    }

    public static void mergeSort(int[] arr) { //병합정렬
        //반씩 나누어 정렬시키고, 합침
        //나눌때 최소 요소가 1개가 되도록 계속 나눔
        //분할,정복,병합
        //{3,5,8,11,6,9}
        //{3,5,8}{11,6,9} //반나눔 
        //{3}{5,8}{11,6,9} //요소가 2개이므로 1개될때까지 다시 나눔
        //{3}{5}{8}{11,6,9} //요소 1개
        //{3,5,8}{11,6,9}
        //{3,5,8}{11},{6,9} //요소가 2개이므로 1개될때까지 다시 나눔
        //{3,5,8}{11},{6},{9}
        //{3,5,8}{6,9,11}
        //{3,5,6,8,9,11}
        //시간복잡도 O(n log n) 오더엔로그엔

    }

    public static void quickSort(int[] arr) { //퀵정렬
        //Pivot, Wall
        //Pivot이라는 기준이 될 수를 지정
        //Wall을 지정
        //배열을 돌아서 Pivot 보다 작은 수를 Wall바로 오른쪽앞에있는 수와 swap하고 Wall을 땡김
        //순회종료시 Wall바로 오른쪽앞에있는 수와 swap

        //{3,5,8,11,6,9} //pivot 9
        //{|3,5,8,11,6,9} //Wall은 제일 처음 수 앞으로
        //{|3,5,8,11,6,9} //i=3, 9보다 작으므로 3과 swap하고 Wall을 땡김 (=자기자신swap이 일어나므로 변화없고 Wall만 이동)
        //{3,|5,8,11,6,9} //i=5, 9보다 작으므로 5와 swap하고 Wall을 땡김 (=자기자신swap이 일어나므로 변화없고 Wall만 이동)
        //{3,5,|8,11,6,9} //i=8, 9보다 작으므로..(이하생략)
        //{3,5,8,|11,6,9} //i=11, 9보다 크므로 변화없음
        //{3,5,8,|11,6,9} //i=6, 9보다 작으므로..(이하생략)
        //{3,5,8,6,|11,9} //i=11, 9보다 크므로 변화없음
        //{3,5,8,6,|11,9} //i=9 순회를 마쳤으므로 11과 swap
        //{3,5,8,6,9,11} //1회차 종료, 9와 11은 빠지고(9는 순회마쳤고 11은 item이 1개이므로) 다음 pivot은 6로 지정
        //{|3,5,8,6} //Wall은 제일 처음 수 앞으로
        //{|3,5,8,6} //i=3, 6보다 작으므로..(이하생략)
        //{3,|5,8,6} //i=5, 6보다 작으므로..(이하생략)
        //{3,5,|8,6} //i=8, 6보다 크므로 변화없음
        //{3,5,|8,6} //i=6, 순회를 마쳤으므로 8과 swap
        //{3,5,6,8} //2회차 종료, 6와 8은 빠지고(6는 순회마쳤고 8은 item이 1개이므로) 다음 pivot은 5로 지정
        //{|3, 5} //Wall은 제일 처음 수 앞으로
        //{|3, 5} //i=3, 5보다 작으므로..(이하생략)
        //{3, |5} //i=5, 순회를 마침과 동시에 item이 1개씩이므로 둘다 빠지고 종료
        //최종 {3,5,6,8,9,11}

        //시간복잡도 O(n log n) 오더엔로그엔, worst case : O(n^2)
        //메모리를 따로 사용하지 않음
        //space complexity O(n) 오더엔
    }
}
