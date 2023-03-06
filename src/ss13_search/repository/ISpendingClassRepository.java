package ss13_search.repository;

import ss13_search.model.SpendingClass;

import java.util.List;

public interface ISpendingClassRepository {
    void display();

    void add(SpendingClass spendingClass);

    SpendingClass findCode(String code);

    void delete(String code);

    String edit(String code);

    List<SpendingClass> findSpendingName(String SpendingName);


    void sortName();

//    int sortSoTienChi();
}
