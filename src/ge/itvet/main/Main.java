package ge.itvet.main;


import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(uniqueElements(1, 2, 3, 4, 2, 5, 1, 6, 7));

    }

    public static int uniqueElements(int... arr) {
        int notUniqueElement = 0;
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length; i++) {
                if (j != i && arr[j] == arr[i]) {
                    notUniqueElement++;
                    break;
                }
            }
        }
        return arr.length - notUniqueElement;
    }
}
