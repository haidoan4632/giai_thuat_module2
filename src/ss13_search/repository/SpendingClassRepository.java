package ss13_search.repository;

import ss13_search.model.SpendingClass;

import java.util.ArrayList;
import java.util.List;

public class SpendingClassRepository implements ISpendingClassRepository {
    final static List<SpendingClass> spendingClassList = new ArrayList<>();

    static {

        spendingClassList.add(new SpendingClass("1", "bo", "20/10", "2", "không"));
        spendingClassList.add(new SpendingClass("2", "crush", "20/11", "4", "đạt"));
        spendingClassList.add(new SpendingClass("3", "bo1", "20/12", "6", "được"));
        spendingClassList.add(new SpendingClass("4", "bo2", "20/13", "1", "mục"));
        spendingClassList.add(new SpendingClass("5", "bo3", "20/14", "8", "đích"));
    }

    @Override
    public void display() {

        for (SpendingClass spendingClass : spendingClassList) {
            System.out.println(spendingClass);
        }
    }

    @Override
    public void add(SpendingClass spendingClass) {
        spendingClassList.add(spendingClass);
    }

    @Override
    public SpendingClass findCode(String code) {
        for (SpendingClass spendingClass : spendingClassList) {
            if (spendingClass.getMaChiTieu().equals(code)) {
                return spendingClass;
            }
        }
        return null;
    }

    @Override
    public void delete(String code) {
        spendingClassList.removeIf(spendingClass -> (spendingClass.getMaChiTieu()).equals(code));
    }

    @Override
    public String edit(String code) {
        for (SpendingClass spendingClass : spendingClassList) {
            if ((spendingClass.getMaChiTieu()).equals(code)) {
                return code;
            }
        }
        return null;
    }

    @Override
    public List<SpendingClass> findSpendingName(String SpendingName) {
        List<SpendingClass>spendingClassList1 =new ArrayList<>();
        for (int i = 0; i < spendingClassList.size(); i++) {
            if (spendingClassList.get(i).getTenChiTieu().contains(SpendingName)) {
                spendingClassList1.add(spendingClassList1.get(i));
            }
        }
        return spendingClassList1;
    }
//e bị sai chô này. lỗi ngoại lệ của chức năng 6 là indexoutofboundsexception
    @Override
    public void sortName() {
        for (SpendingClass spendingClass : spendingClassList) {
            System.out.println(spendingClass);
        }
    }

//    @Override
//    public int sortSoTienChi() {
//s
//    }

}