package ss9_dsa_danh_sach.repository;

import ss9_dsa_danh_sach.model.HocVien;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository {
    public static List<HocVien> hocVienList = new ArrayList<>();

    static {
        hocVienList.add(new HocVien("1", "Hải", "11/11/1111", "nam", "c12", "10"));
        hocVienList.add(new HocVien("2", "Hải1", "12/12/1212", "nam", "c11", "9"));
    }

    @Override
    public HocVien findById(String id) {
        for (HocVien i : hocVienList) {
            if (i.getCode() == id) {
                return i;
            }
        }
        return null;
    }

    @Override
    public void add(HocVien hocVien) {
        hocVienList.add(hocVien);
    }

    @Override
    public void remove(String id) {
        for (int i = 0; i < hocVienList.size(); i++) {
            if ((hocVienList.get(i).getCode()).equals(id)) {
                hocVienList.remove(hocVienList.get(i));
            }
        }
    }

    @Override
    public void display() {
        for (HocVien hocVien : hocVienList) {
            System.out.println(hocVien.toString());
        }
    }
}

