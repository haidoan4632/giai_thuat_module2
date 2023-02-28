package ss9_dsa_danh_sach.repository;

import ss9_dsa_danh_sach.model.HocVien;

public interface IStudentRepository {

    HocVien findById(String id);

    void add(HocVien hocVien);

    void remove(String id);

    void display();
}
