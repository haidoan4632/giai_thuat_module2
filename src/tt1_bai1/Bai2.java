package tt1_bai1;

import java.util.Arrays;

public class Bai2 {
    public static void main(String[] args) {
        int a = 4268;
        String s = String.valueOf(a);
        String[] b = s.split("");
        System.out.println(Arrays.toString(b));
        int b0 = Integer.parseInt(b[0]);
        int b1 = Integer.parseInt(b[1]);
        int b2 = Integer.parseInt(b[2]);
        int b3 = Integer.parseInt(b[3]);
        int[] arr = {b0, b1, b2, b3};
        int[] arr1 = new int[3];
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        arr1[0] = arr[0];
        arr1[1] = arr[1];
        arr1[2] = arr[2];
        String d = arr1[0] + "" + arr1[1] + "" + arr1[2];
        System.out.println(d);
    }
}
