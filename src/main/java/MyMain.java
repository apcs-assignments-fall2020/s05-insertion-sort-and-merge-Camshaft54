import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyMain {

    // Sorts the ArrayList using insertion sort
    public static ArrayList<Integer> insertionSort(ArrayList<Integer> list) {
        ArrayList<Integer> outList = new ArrayList<>();
        for (int toInsert : list) {
            for (int j = 0; j < outList.size(); j++) {
                if (outList.get(j) >= toInsert) {
                    outList.add(j, toInsert);
                    break;
                } else if (j == outList.size() - 1) {
                    outList.add(toInsert);
                    break;
                }
            }
            if (outList.size() == 0) {
                outList.add(toInsert);
            }
        }
        return outList;
    }

     // Merges two sorted arrays into one large combined
     // sorted array
     // You may assume arr1 and arr2 are the same length
    public static int[] merge(int[] arr1, int[] arr2) {
        int[] arr = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, arr, 0, arr1.length);
        System.arraycopy(arr2, 0, arr, arr1.length, arr2.length);
        System.out.println(Arrays.toString(arr));
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : arr) {
            list.add(i);
        }
        int[] sorted = new int[arr.length];
        list = insertionSort(list);
        for (int i = 0; i < arr.length; i++) {
            sorted[i] = list.get(i);
        }
        return sorted;
    }

    public static void main(String[] args) {
        merge(new int[]{1, 2}, new int[]{0, 3});
    }
}
