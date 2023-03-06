package nhappp;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Model> modelSet = new HashSet<>();

        modelSet.add(new Model("a", "v"));
        modelSet.add(new Model("a", "v"));

        for (Model model : modelSet) {
            System.out.println(model);
        }

//        Set<String> set = new HashSet();
//        set.add("1","2");
//        set.add("2");
//        System.out.println(set);
    }
}
