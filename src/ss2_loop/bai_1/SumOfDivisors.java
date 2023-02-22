package ss2_loop.bai_1;

import java.util.Scanner;

public class SumOfDivisors {
    public static void main(String[] args) {
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Input number: ");
                int number = Integer.parseInt(scanner.nextLine());
                int sum = 0;
                if (number > 0) {
                    for (int i = 1; i < number; i++) {
                        if (number % i == 0) {
                            sum = sum + i;
                        }
                    }
                    System.out.println("Tổng các ước: " + sum);
                } else {
                    System.out.println("Bạn cần nhập vào 1 số lớn hơn 0");
                }
            } catch (NumberFormatException e) {
                System.out.println("Bạn cần nhập vào 1 giá trị số: ");
            }
        } while (true);


    }
}
