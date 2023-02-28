package ss9_dsa_danh_sach.service;

import ss9_dsa_danh_sach.model.GiangVien;
import ss9_dsa_danh_sach.model.HocVien;

public interface ITeacherService {
    GiangVien findById(String id);

    void add(GiangVien giangVien);

    void remove(String id);

    void display();
}
