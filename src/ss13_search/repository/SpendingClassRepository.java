package ss13_search.repository;

import ss13_search.model.SpendingClass;

import java.util.HashSet;
import java.util.Set;

public class SpendingClassRepository implements ISpendingClassRepository {
    final static Set<SpendingClass> spendingClassSet = new HashSet<>();

    static {
        spendingClassSet.add(new SpendingClass("1", "bồ", "20/10", "1B", "không"));
        spendingClassSet.add(new SpendingClass("2", "crush", "20/11", "2B", "đạt"));
        spendingClassSet.add(new SpendingClass("3", "bồ1", "20/12", "3B", "được"));
        spendingClassSet.add(new SpendingClass("4", "bồ2", "20/13", "4B", "mục"));
        spendingClassSet.add(new SpendingClass("5", "bồ3", "20/14", "5B", "đích"));
    }

    @Override
    public void display() {
        for (SpendingClass spendingClass : spendingClassSet) {
            System.out.println(spendingClass);
        }
    }

    @Override
    public void add(SpendingClass spendingClass) {
        spendingClassSet.add(spendingClass);
    }

    @Override
    public SpendingClass findCode(String code) {
        for (SpendingClass spendingClass : spendingClassSet) {
            if (spendingClass.getMaChiTieu().equals(code)) {
                return spendingClass;
            }
        }
        return null;
    }

    @Override
    public void delete(String code) {
        spendingClassSet.removeIf(spendingClass -> (spendingClass.getMaChiTieu()).equals(code));
    }

    @Override
    public String edit(String code) {
        for (SpendingClass spendingClass : spendingClassSet) {
            if ((spendingClass.getMaChiTieu()).equals(code)){
                return code;
            }
        }
        return null;
    }

    @Override
    public SpendingClass findSpendingName(String SpendingName) {
        for (SpendingClass spendingClass : spendingClassSet) {
            if ((spendingClass.getTenChiTieu()).contains(SpendingName)) {
                return spendingClass;
            }
        }
        //nhớ sửa
        return null;
    }
}
