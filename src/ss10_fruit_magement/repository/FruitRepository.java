package ss10_fruit_magement.repository;

import ss10_fruit_magement.model.Fruit;

import java.util.ArrayList;
import java.util.List;

public class FruitRepository implements IFruitRepository {
    public static final List<Fruit> fruitList = new ArrayList<>();

    static {
        fruitList.add(new Fruit("Quýt", "tạm", "01/01/2006", "01/01/2020", "không rõ xuất xứ", "tu"));
        fruitList.add(new Fruit("Cam", "ngon", "02/02/2000", "02/02/2020", "không rõ xuất xứ", "10$"));
        fruitList.add(new Fruit("Bưởi", "tuyệt vời", "01/01/2000", "01/01/2023", "không rõ xuất xứ", "20$"));
    }

    @Override
    public void display() {
        for (Fruit fruit : fruitList) {
            System.out.println(fruit.toString());
        }
    }

    @Override
    public void add(Fruit fruit) {
        fruitList.add(fruit);
    }
}
