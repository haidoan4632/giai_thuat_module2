package ss13_search.repository;

import ss13_search.model.SpendingClass;
import ss13_search.utils.IdNotFoundException;
import ss13_search.utils.SpendingClassComparator;
import ss13_search.utils.UniqueIDException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SpendingClassRepository implements ISpendingClassRepository {
    final static List<SpendingClass> spendingClassList = new ArrayList<>();

    static {
        spendingClassList.add(new SpendingClass("5", "bo3", "20/14", "8", "đích"));
        spendingClassList.add(new SpendingClass("1", "bo", "20/10", "8", "không"));
        spendingClassList.add(new SpendingClass("2", "crush", "20/11", "8", "đạt"));
        spendingClassList.add(new SpendingClass("4", "bo2", "20/13", "8", "mục"));
        spendingClassList.add(new SpendingClass("3", "bo1", "20/12", "8", "được"));
    }

    @Override
    public void display() {

        for (SpendingClass spendingClass : spendingClassList) {
            System.out.println(spendingClass);
        }
    }

    @Override
    public void add(SpendingClass spendingClass) throws UniqueIDException {
        for (SpendingClass spendingClass1 : spendingClassList) {
            if (spendingClass1.getMaChiTieu().equals(spendingClass.getMaChiTieu())) {
                throw new UniqueIDException("Không thể thêm dữ liệu do mã chi tiêu đã tồn tại, cần nhập mảng chi tiêu không trùng");
            }
        }
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
    public void delete(String code) throws IdNotFoundException {
        for (SpendingClass spendingClass1 : spendingClassList)
            if (spendingClass1.getMaChiTieu().equals(code)) {
                spendingClassList.remove(spendingClass1);
            }else {
                throw new IdNotFoundException("Không thể xóa do code không tồn tại trong mảng");
            }
        }
//        spendingClassList.removeIf(spendingClass -> (spendingClass.getMaChiTieu()).equals(code));
//chưa hiểu dòng code comment

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
        List<SpendingClass> spendingClassList1 = new ArrayList<>();
        for (int i = 0; i < spendingClassList.size(); i++) {
            if (spendingClassList.get(i).getTenChiTieu().contains(SpendingName)) {
                spendingClassList1.add(spendingClassList.get(i));
            }
        }
        return spendingClassList1;
    }

    //e bị sai chô này. lỗi ngoại lệ của chức năng 6 là indexoutofboundsexception
    @Override
    public void sortName() {
        Collections.sort(spendingClassList);
        for (SpendingClass spendingClass : spendingClassList) {
            System.out.println(spendingClass);
        }
    }

    @Override
    public void sortSoTienChi() {
        Collections.sort(spendingClassList, new SpendingClassComparator());
        for (SpendingClass spendingClass : spendingClassList) {
            System.out.println(spendingClass);
        }
    }
}

