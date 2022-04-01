public class SORT {
    //정렬
    //선택정렬, 거품정렬, 삽입정렬, 병합정렬, 퀵정렬

    public static void main(String[] args) throws Exception {
        int arr[] = {3,5,8,11,6,9};
        selectionSort(arr);
        bubbleSort(arr);
        insertionSort(arr);
        mergeSort(arr);
        quickSort(arr);
    }

    public static void selectionSort(int[] arr) { //선택정렬
        //
    }

    public static void bubbleSort(int[] arr) { //거품정렬
        //
    }

    public static void insertionSort(int[] arr) { //삽입정렬
        //작은값을 사이에 삽입하여 정렬시킴
        //최소값이 맨 앞에 오도록 정렬
    }

    public static void mergeSort(int[] arr) { //병합정렬
        //반씩 나누어 정렬시키고, 합침
        //분할,정복,병합
    }

    public static void quickSort(int[] arr) { //퀵정렬
        //반씩 나누어 정렬시키고, 합침
        //분할,정복
    }
}
