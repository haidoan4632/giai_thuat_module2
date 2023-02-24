package ss10_fruit_magement.service;

import ss10_fruit_magement.model.Fruit;
import ss10_fruit_magement.repository.FruitRepository;

public class FruitService implements IFruitService {
    FruitRepository fruitRepository = new FruitRepository();

    @Override
    public void display() {
        fruitRepository.display();
    }

    @Override
    public void add(Fruit fruit) {
        fruitRepository.add(fruit);
    }
}
