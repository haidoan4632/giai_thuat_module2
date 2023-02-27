package tt1_bai1;

import java.util.Arrays;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        int result = checkNumber(arr);
        if (result == 1) {
            System.out.println("Mảng đẹp");
        } else System.out.println("Mảng xấu");
    }

    public static int checkNumber(int[] array) {
        int count = 1;
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] <= array[j]) {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        int[] array1 = new int[10];
        for (int j = 1; j < array.length; j++) {
            if (array[j] == array[j - 1]) {
                count = count + 1;
            }

        }
        System.out.println(Arrays.toString(array1));
        return 1;
    }
}
