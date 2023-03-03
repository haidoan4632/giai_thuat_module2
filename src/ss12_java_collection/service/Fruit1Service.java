package ss12_java_collection.service;

import ss12_java_collection.controller.Fruit1Manager;
import ss12_java_collection.model.Fruit1;
import ss12_java_collection.repository.Fruit1Repository;
import ss12_java_collection.repository.IFruit1Repository;

import java.util.Scanner;

public class Fruit1Service implements IFruit1Service {
    IFruit1Repository fruit1Repository = new Fruit1Repository();
    Scanner scanner = new Scanner(System.in);
    Fruit1 fruit1 = new Fruit1();

    @Override
    public void display() {
        do {
            System.out.println("Display list fruit");
            System.out.println("1.Duyệt theo key-set");
            System.out.println("2.Duyệt theo entry-set");
            System.out.println("3.Trở lại menu chính");
            int choice1 = Integer.parseInt(scanner.nextLine());
            switch (choice1) {
                case 1:
                    fruit1Repository.display();
                    break;
                case 2:
                    fruit1Repository.display1();
                    break;
                case 3:
                    Fruit1Manager.displayMenuFruit1();
                default:
                    System.out.println("Bạn cần nhập đúng lựa chọn ");
            }

        } while (true);
    }

    @Override
    public void add() {
        System.out.println("Add fruit");
        System.out.println("Add key Map:");
        String key = scanner.nextLine();
        System.out.println("Input name: ");
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
        Fruit1 fruit1 = new Fruit1(name, type, dateProduct, hanSuDung, source, price);
        fruit1Repository.add(key, fruit1);
    }
    @Override
    public void remove() {
        System.out.println("Nhập vào key bạn muốn xóa: ");
        String key = scanner.nextLine();
        String result = fruit1Repository.findKey(key);
        if (result != null) {
            fruit1Repository.remove(key);
        }
    }

    @Override
    public void edit() {
        System.out.println("Nhập vào key bạn muốn chỉnh sửa: ");
        String key1 = scanner.nextLine();
        String result1 = fruit1Repository.findKey(key1);
        if (result1 == null) {
            System.out.println("Không tìm thấy key");
        }
        if (result1 != null) {
            System.out.println("Edit fruit");
            System.out.println("Input new name: ");
            String name1 = scanner.nextLine();
            System.out.println("Input new type: ");
            String type1 = scanner.nextLine();
            System.out.println("Input new Product: ");
            String dateProduct1 = scanner.nextLine();
            System.out.println("Input hạn sử dụng mới: ");
            String hanSuDung1 = scanner.nextLine();
            System.out.println("Nguồn gốc mới: ");
            String source1 = scanner.nextLine();
            System.out.println("Input new price: ");
            String price1 = scanner.nextLine();
            Fruit1 fruit2 = new Fruit1(name1, type1, dateProduct1, hanSuDung1, source1, price1);
            fruit1Repository.edit(key1, fruit2);
        }
    }
}
