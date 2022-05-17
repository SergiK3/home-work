package ge.itvet.main;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = {5,-55,99,6,0};
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void insertionSort(int[] A) {
        int key = 0;
        int i = 0;
        for (int j = 1; j < A.length; j++) {
            key = A[j];
            i = j - 1;
            while (i >= 0 && A[i] > key) {
                A[i + 1] = A[i];
                i = i - 1;
                A[i + 1] = key;
            }

        }
    }


}
