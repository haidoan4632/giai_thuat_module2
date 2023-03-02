package ss10_fruit_magement.service;

import ss10_fruit_magement.model.Fruit;
import ss10_fruit_magement.repository.FruitRepository;

import java.util.Scanner;

public class FruitService implements IFruitService {
    FruitRepository fruitRepository = new FruitRepository();
    Scanner scanner = new Scanner(System.in);
    @Override
    public void display() {
        fruitRepository.display();
    }

    @Override
    public void add() {
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
        fruitRepository.add(fruit1);
    }
}
