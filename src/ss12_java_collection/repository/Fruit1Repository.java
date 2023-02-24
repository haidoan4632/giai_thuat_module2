package ss12_java_collection.repository;

import ss10_fruit_magement.model.Fruit;
import ss12_java_collection.model.Fruit1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Fruit1Repository implements IFruit1Repository {
    public static final Map<String, Fruit1> map = new LinkedHashMap<>();

    static {
        map.put("vip", new Fruit1("Táo", "vip", "1", "10", "vn", "1$"));
        map.put("vip1", new Fruit1("Sung", "vip1", "2", "20", "vn1", "2$"));
        map.put("vip2", new Fruit1("Đào", "vip2", "3", "30", "vn2", "3$"));
    }

    @Override
    public void display() {
        Set<String> set = map.keySet();
        for (String key : set) {
            System.out.println(key + " " + map.get(key));
        }
    }

    @Override
    public void add(Fruit fruit) {

    }
}
