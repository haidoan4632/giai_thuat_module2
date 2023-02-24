package ss12_java_collection.controller;

import ss10_fruit_magement.model.Fruit;
import ss12_java_collection.service.Fruit1Service;

import java.util.Scanner;

public class Fruit1Manager {
    public static void main(String[] args) {
        Fruit1Service fruit1Service = new Fruit1Service();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("-----Menu-----");
            System.out.println("1.Hiển thị danh sách: ");
            System.out.println("2.Thêm: ");
            System.out.println("3. Thoát: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Display list fruit");
                    fruit1Service.display();
                    break;
                case 2:
                    System.out.println("Add fruit");
                    System.out.println("Inpur name: ");
                    String name = scanner.nextLine();
                    System.out.println("Input type: ");
                    String type = scanner.nextLine();
                    System.out.println("Input date Product: ");
                    String dateProduct = scanner.nextLine();
                    System.out.println("Nhập hạn sử dụng: ");
                    String hanSuDung = scanner.nextLine();
                    System.out.println("Nguồn gốc: ");
                    String source = scanner.nextLine();
                    System.out.println("Input price: ");
                    String price = scanner.nextLine();
                    Fruit fruit1 = new Fruit(name, type, dateProduct, hanSuDung, source, price);
                    fruit1Service.add(fruit1);
                    break;
                case 3:
                    System.exit(0);
            }
        } while (true);
    }
}
