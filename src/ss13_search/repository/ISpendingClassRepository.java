package ss13_search.repository;

import ss13_search.model.SpendingClass;

public interface ISpendingClassRepository {
    void display();

    void add(SpendingClass spendingClass);

   SpendingClass findCode(String code);

    void delete(String code);

    void edit(String code);
}