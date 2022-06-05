package ge.itvet.main;


import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer[] array = new Integer[Integer.parseInt(scanner.nextLine())];
        String[] array1 = scanner.nextLine().split(" ");

        for (int i = 0; i < array1.length; i++) {
            array[i] = Integer.parseInt(array1[i]);
        }

        System.out.println(uniqueElementsWithCollections(array));
        scanner.close();

    }

    public static int uniqueElements(int[] arr) {
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

    public static int uniqueElementsWithCollections(Integer[] arr) {

        ArrayList<Integer> arrayList = new ArrayList<>(List.of(arr));
        Set<Integer> integerSet = new HashSet<>(List.of(arr));


        integerSet.forEach(arrayList::remove);
        arrayList.forEach(integerSet::remove);

        return integerSet.size();

    }
}
