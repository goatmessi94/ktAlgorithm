package Sort;

public class Merge {
    private static int[] sorted; //임시 배열?

    public static void merge_sort(int[] a) {

        sorted = new int[a.length];
        merge_sort(a, 0, a.length - 1);
        sorted = null;
    }

    private static void merge_sort(int[] a, int left, int right) {

        //부분 리스트가 1개의 원소를 갖고 있는 경우 return한다.
        if (left == right) return ;

        int mid = (left + right / 2 ); //절반 위치

        merge_sort(a, left, mid); // 재귀 함수
        merge_sort(a, mid +1 , right); // 재귀 함수
    }

    public static void main(String[] args) {
        int[] a = {3,4,1,2,5,6,};
        merge_sort(a);

    }
}
