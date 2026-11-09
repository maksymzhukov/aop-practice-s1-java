package homework.h12;

// https://leetcode.com/problems/relative-sort-array/
public class T2 {
  public int[] relativeSortArray(int[] arr1, int[] arr2) {
    int[] count = new int[1001];
    int[] result = new int[arr1.length];

    for (int value : arr1) {
      count[value]++;
    }

    int index = 0;

    for (int value : arr2) {
      while (count[value] > 0) {
        result[index++] = value;
        count[value]--;
      }
    }

    for (int value = 0; value <= 1000; value++) {
      while (count[value] > 0) {
        result[index++] = value;
        count[value]--;
      }
    }

    return result;
  }
}
