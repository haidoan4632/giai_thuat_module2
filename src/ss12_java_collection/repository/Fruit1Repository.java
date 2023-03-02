package ss12_java_collection.repository;

import ss12_java_collection.model.Fruit1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Fruit1Repository implements IFruit1Repository {
    public static final Map<String, Fruit1> map = new LinkedHashMap<>();

    static {
        map.put("1", new Fruit1("Táo", "vip", "1", "10", "vn", "1$"));
        map.put("2", new Fruit1("Sung", "vip1", "2", "20", "vn1", "2$"));
        map.put("3", new Fruit1("Đào", "vip2", "3", "30", "vn2", "3$"));
    }

    @Override
    public void display() {
        Set<String> set = map.keySet();
        for (String key : set) {
            System.out.println(key + " " + map.get(key));
        }
    }

    @Override
    public void display1() {
        for (Map.Entry<String, Fruit1> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    @Override
    public void add(String key, Fruit1 fruit) {
        map.put(key, fruit);
    }

    @Override
    public String findKey(String key) {
        for (Map.Entry<String, Fruit1> entry : map.entrySet()) {
            if (key.equals(entry.getKey())) {
                return key;
            }
        }
        return null;
    }

    @Override
    public void remove(String key) {
        map.remove(key);
    }

    @Override
    public void edit(String key, Fruit1 fruit1) {

    }
}
