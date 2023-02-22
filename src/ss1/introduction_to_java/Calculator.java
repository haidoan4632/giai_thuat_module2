package ss1.introduction_to_java;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) throws RuntimeException {
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Input number 1: ");
                int number1 = Integer.parseInt(scanner.nextLine());
                System.out.println("Input number 2: ");
                int number2 = Integer.parseInt(scanner.nextLine());
                int choice;
                do {
                    System.out.println("Lựa chọn phép tính: ");
                    System.out.println("1.Phép cộng: ");
                    System.out.println("2.Phép trừ: ");
                    System.out.println("3.Phép nhân: ");
                    System.out.println("4.Phép chia: ");
                    choice = Integer.parseInt(scanner.nextLine());
                    switch (choice) {
                        case 1:
                            int theSum = sum(number1, number2);
                            System.out.println("Tổng của 2 số vừa nhập là: " + theSum);
                            break;
                        case 2:
                            int theSubtraction = subtraction(number1, number2);
                            System.out.println("Hiệu của 2 số vừa nhập là: " + theSubtraction);
                            break;
                        case 3:
                            int theMultiplication = multiplication(number1, number2);
                            System.out.println("Tích của 2 số vừa nhập là: " + theMultiplication);
                            break;
                        case 4:
                            int theDivision = division(number1, number2);
                            System.out.println("Thương của 2 số vừa nhập là: " + theDivision);
                            break;
                        default:
                    }

                } while (true);
            } catch (NumberFormatException ignored) {
                System.out.println("Bạn cần nhập vào giá trị là 1 số để chương trình chạy: ");
            }
        } while (true);


    }

    public static int sum(int number1, int number2) {
        return number1 + number2;
    }

    public static int subtraction(int number1, int number2) {
        return number1 - number2;
    }

    public static int multiplication(int number1, int number2) {
        return number1 * number2;
    }

    public static int division(int number1, int number2) {
        return number1 / number2;
    }
}
