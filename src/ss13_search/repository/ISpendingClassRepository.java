package ss13_search.repository;

import ss13_search.model.SpendingClass;
import ss13_search.utils.IdNotFoundException;
import ss13_search.utils.UniqueIDException;

import java.util.List;

public interface ISpendingClassRepository {
    void display();

    void add(SpendingClass spendingClass) throws UniqueIDException;

    SpendingClass findCode(String code);

    void delete(String code) throws IdNotFoundException;

    String edit(String code);

    List<SpendingClass> findSpendingName(String SpendingName);


    void sortName();

    void sortSoTienChi();
}
