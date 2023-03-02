package ss12_java_collection.controller;

import ss12_java_collection.service.Fruit1Service;

import java.util.Scanner;

public class Fruit1Manager {
    public static void displayMenuFruit1() {
        Fruit1Service fruit1Service = new Fruit1Service();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("-----Menu-----");
            System.out.println("1.Hiển thị danh sách: ");
            System.out.println("2.Thêm: ");
            System.out.println("3.Xóa: ");
            System.out.println("4.Sửa: ");
            System.out.println("5. Thoát: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    fruit1Service.display();
                case 2:
                    fruit1Service.add();
                    break;
                case 3:
                    fruit1Service.remove();
                    break;
                case 4:
                    fruit1Service.edit();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Bạn cần nhập đúng: ");
            }
        } while (true);
    }
}
