package ss3_array_method.bai_1;

import java.util.Scanner;

public class FindNumberInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 2, 7, 6, 2, 8, 9};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tìm sự tồn tại của số nguyên trong mảng: ");
        System.out.println("Nhập vào 1 số nguyên");
        int number = Integer.parseInt(scanner.nextLine());
        int location = 0;
        for (int i = 0; i < arr.length; i++) {
            if (number == arr[i]) {
                location = i;
            }
        }
        if (location == 0) {
            System.out.println("Không tìm thấy giá trị của phần tử vừa nhập trong mảng");
        } else {
            System.out.println("Vị trí xuất hiện cuối cùng trong mảng của phần tử vừa nhập là: " + location);
        }
    }
}
