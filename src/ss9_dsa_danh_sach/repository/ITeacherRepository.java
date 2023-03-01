package ss9_dsa_danh_sach.repository;

import ss9_dsa_danh_sach.model.GiangVien;

public interface ITeacherRepository {
    String findById(String id);

    void add(GiangVien giangVien);

    void remove(String id);

    void display();
}
