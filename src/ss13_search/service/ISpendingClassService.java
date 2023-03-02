package ss13_search.service;

import ss13_search.model.SpendingClass;

public interface ISpendingClassService {
    void display();

    void add(SpendingClass spendingClass);

    void delete(String code);

    void edit(String code);
}
