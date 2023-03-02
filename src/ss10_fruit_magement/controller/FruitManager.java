package ss10_fruit_magement.controller;

import ss10_fruit_magement.model.Fruit;
import ss10_fruit_magement.service.FruitService;

import java.util.Scanner;

public class FruitManager {
    public static void main(String[] args) {
        FruitService fruitService = new FruitService();
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
                    fruitService.display();
                    break;
                case 2:
                    fruitService.add();
                    break;
                case 3:
                    System.exit(0);
            }
        } while (true);
    }
}
