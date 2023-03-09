package ss13_search.repository;

import ss13_search.data.ReadWriteBinaryFile;
import ss13_search.data.ReadWriteFile;
import ss13_search.model.SpendingClass;
import ss13_search.utils.IdNotFoundException;
import ss13_search.utils.SpendingClassComparator;
import ss13_search.utils.UniqueIDException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SpendingClassRepository implements ISpendingClassRepository {
    static List<SpendingClass> spendingClassList = new ArrayList<>();
    public static ReadWriteFile readWriteFile = new ReadWriteFile();
    public static ReadWriteBinaryFile readWriteBinaryFile = new ReadWriteBinaryFile();

//    static {
////        spendingClassList.add(new SpendingClass("5", "bo3", "20/14", "8", "đích"));
////        spendingClassList.add(new SpendingClass("1", "bo", "20/10", "8", "không"));
////        spendingClassList.add(new SpendingClass("2", "crush", "20/11", "8", "đạt"));
////        spendingClassList.add(new SpendingClass("4", "bo2", "20/13", "8", "mục"));
////        spendingClassList.add(new SpendingClass("3", "bo1", "20/12", "8", "được"));
//        try {
//            ReadWriteFile.WriteSpendingClass(spendingClassList);
//            ReadWriteBinaryFile.writeSpendingClassBinaryFile(spendingClassList);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
    @Override
    public void display() {
        try {
            spendingClassList = ReadWriteFile.ReadSpendingClass();
            spendingClassList = ReadWriteBinaryFile.readSpendingClassBinaryFile();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        for (SpendingClass spendingClass : spendingClassList) {
            System.out.println(spendingClass);
        }
    }
    @Override
    public void add(SpendingClass spendingClass) throws UniqueIDException {
        try {
            for (SpendingClass spendingClass1 : spendingClassList) {
                if (spendingClass1.getMaChiTieu().equals(spendingClass.getMaChiTieu())) {
                    throw new UniqueIDException("Không thể thêm dữ liệu do mã chi tiêu đã tồn tại, cần nhập mảng chi tiêu không trùng");
                }
            }
            spendingClassList.add(spendingClass);
            ReadWriteFile.WriteSpendingClass(spendingClassList);
            ReadWriteBinaryFile.writeSpendingClassBinaryFile(spendingClassList);
        } catch (UniqueIDException | IOException e) {
            e.printStackTrace();
        }
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
        try {
            spendingClassList = ReadWriteFile.ReadSpendingClass();
            spendingClassList = ReadWriteBinaryFile.readSpendingClassBinaryFile();
            for (int i = 0; i < spendingClassList.size(); i++) {
                if (spendingClassList.get(i).getMaChiTieu().equals(code)) {
                    spendingClassList.remove(spendingClassList.get(i));
                    ReadWriteFile.WriteSpendingClass(spendingClassList);
                    ReadWriteBinaryFile.writeSpendingClassBinaryFile(spendingClassList);
                    return;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        throw new IdNotFoundException("lỗi");
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
        List<SpendingClass> spendingClassList1 = new ArrayList<>();
        for (int i = 0; i < spendingClassList.size(); i++) {
            if (spendingClassList.get(i).getTenChiTieu().contains(SpendingName)) {
                spendingClassList1.add(spendingClassList.get(i));
            }
        }
        return spendingClassList1;
    }
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

