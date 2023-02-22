package ss3_array_method.bai_2;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        System.out.println("Tính trung bình cộng các số nguyên ở vị trí lẻ trong mảng: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng: ");
        int sum = 0;
        int count = 0;
        int size = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập phần tử thứ " + i + "của mảng: ");
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int j = 0; j < arr.length; j++) {
            if (j % 2 == 0) {
                sum = sum + arr[j];
                count++;
            }
        }
        System.out.println(sum);
        float average = (float) sum / count;
        System.out.println("Kết quả: ");
        System.out.println(average);
    }
}
