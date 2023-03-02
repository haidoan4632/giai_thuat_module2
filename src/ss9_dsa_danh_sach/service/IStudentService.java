package ss9_dsa_danh_sach.service;

import ss9_dsa_danh_sach.model.HocVien;

public interface IStudentService {
    String findById(String id);

    void add(HocVien hocVien);

    void remove(String id);

    void display();

}
