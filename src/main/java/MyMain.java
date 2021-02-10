import java.util.ArrayList;
import java.util.Arrays;

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
        int[] arr = new int[arr1.length * 2];
        int count1 = 0;
        int count2 = 0;
        while (count1 + count2 < arr.length) {
            if (count2 == arr2.length) {
                arr[count1+count2] = arr1[count1];
                count1++;
            } else if (count1 == arr1.length) {
                arr[count2+count1] = arr2[count2];
                count2++;
            } else {
                if (arr1[count1] < arr2[count2]) {
                    arr[count1+count2] = arr1[count1];
                    count1++;
                } else {
                    arr[count1+count2] = arr2[count2];
                    count2++;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(merge(new int[]{1, 2}, new int[]{0, 3})));
    }
}
