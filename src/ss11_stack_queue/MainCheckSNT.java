package ss11_stack_queue;

import java.util.Scanner;

public class MainCheckSNT {
    public static void main(String[] args) {
        CheckSNT checkSNT = new CheckSNT();
        Scanner scanner = new Scanner(System.in);
        int number;
        int choice;
        do {
            System.out.println("Nhập lựa chọn kiểm tra SNT: ");
            System.out.println("1.Liệt kê SNT theo stack: ");
            System.out.println("2.Liệt kê SNT theo queue: ");
            System.out.println("3.Exit: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Nhập vào số cần kiểm tra: ");
                    number = Integer.parseInt(scanner.nextLine());
                     CheckSNT.useStack(number);
                    break;
                case 2:
                    System.out.println("Nhập vào số cần kiểm tra: ");
                    number = Integer.parseInt(scanner.nextLine());
                     CheckSNT.useQueue(number);
                    break;
            }
        } while (true);
    }
}
