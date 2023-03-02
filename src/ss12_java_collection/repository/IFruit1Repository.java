package ss12_java_collection.repository;

import ss12_java_collection.model.Fruit1;

public interface IFruit1Repository {
    void display();

    void display1();

    void add(String key, Fruit1 fruit);

    String findKey(String key);

    void remove(String key);

    void edit(String key, Fruit1 fruit1);
}
