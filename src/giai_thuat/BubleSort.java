package giai_thuat;

import java.util.Arrays;

public class BubleSort {
    public static void bubleSort(int[] arr1) {
        int temp;
        for (int i = 0; i < arr1.length - 1; i++) {
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[j] <= arr1[i]) {
                    temp = arr1[j];
                    arr1[j] = arr1[i];
                    arr1[i] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr1));
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 3, 7, 9};
        bubleSort(arr);
    }
}
