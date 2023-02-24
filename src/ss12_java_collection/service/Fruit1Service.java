package ss12_java_collection.service;

import ss10_fruit_magement.model.Fruit;
import ss12_java_collection.repository.Fruit1Repository;

public class Fruit1Service implements IFruit1Service {
    Fruit1Repository fruit1Repository = new Fruit1Repository();

    @Override
    public void display() {
fruit1Repository.display();
    }

    @Override
    public void add(Fruit fruit) {

    }
}
