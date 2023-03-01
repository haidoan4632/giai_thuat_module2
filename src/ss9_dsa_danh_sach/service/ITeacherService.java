package ss9_dsa_danh_sach.service;

import ss9_dsa_danh_sach.model.GiangVien;

public interface ITeacherService {
    String findById(String id);

    void add(GiangVien giangVien);

    void remove(String id);

    void display();
}
