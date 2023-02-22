package ss2_loop.bai_2;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number1: ");
        int number1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Input number2: ");
        int number2 = Integer.parseInt(scanner.nextLine());
        int average;
        int uocChungMax = 1;
        int boiChungMin;
        if (number1 >= number2) {
            for (int i = 1; i < number1; i++) {
                if (number1 % i == 0 && number2 % i == 0) {
                    uocChungMax = i;
                }
            }
        } else {
            for (int i = 1; i < number2; i++) {
                if (number1 % i == 0 && number2 % i == 0) {
                    uocChungMax = i;
                }
            }
        }
        System.out.println("Ước chung lớn nhất của 2 số là: ");
        System.out.println(uocChungMax);
        boiChungMin = number1 * number2 / uocChungMax;
        System.out.println("Bội chung nhỏ nhất của 2 số là: ");
        System.out.println(boiChungMin);
        average = (uocChungMax + boiChungMin) / 2;
        System.out.println("Trung bình cộng của UCLN và BCNN là: ");
        System.out.println(average);
    }
}
