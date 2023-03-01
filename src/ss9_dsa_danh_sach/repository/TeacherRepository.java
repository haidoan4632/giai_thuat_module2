package ss9_dsa_danh_sach.repository;

import ss9_dsa_danh_sach.model.GiangVien;

import java.util.ArrayList;
import java.util.List;

public class TeacherRepository implements ITeacherRepository {
    public static List<GiangVien> giangVienList = new ArrayList<GiangVien>();

    static {
        giangVienList.add(new GiangVien("1", "abc", "1/1/1", "nam", "xyz"));
        giangVienList.add(new GiangVien("2", "ABC", "2/2/2", "nu", "XYZ"));
    }

    @Override
    public String findById(String id) {
        for (GiangVien i : giangVienList) {
            if (i.getCode() == id) {
                return id;
            }
        }
        return null;
    }

    @Override
    public void add(GiangVien giangVien) {
        giangVienList.add(giangVien);
    }

    @Override
    public void remove(String id) {
        for (int i = 0; i < giangVienList.size(); i++) {
            if ((giangVienList.get(i).getCode()).equals(id)) {
                giangVienList.remove(giangVienList.get(i));
            }
        }
    }

    @Override
    public void display() {
        for (GiangVien giangVien : giangVienList) {
            System.out.println(giangVien.toString());
        }
    }
}
