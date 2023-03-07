package ss13_search.utils;

import ss13_search.model.SpendingClass;

import java.util.Comparator;

public class SpendingClassComparator implements Comparator<SpendingClass> {
    @Override
    public int compare(SpendingClass o1, SpendingClass o2) {
        int result = o2.getSoTienChiTieu().compareTo(o1.getSoTienChiTieu());
        int result1 = o1.getTenChiTieu().compareTo(o2.getTenChiTieu());
        if (result!=0){
            return result;
        }else if (result==0){
            return result1;
        }
        return result;
    }
}
