package ss9_dsa_danh_sach.service;

import ss9_dsa_danh_sach.model.GiangVien;
import ss9_dsa_danh_sach.repository.TeacherRepository;

public class TeacherService implements ITeacherService {
    TeacherRepository teacherRepository = new TeacherRepository();

    @Override
    public GiangVien findById(String id) {
        teacherRepository.findById(id);
        return null;
    }

    @Override
    public void add(GiangVien giangVien) {
        teacherRepository.add(giangVien);
    }

    @Override
    public void remove(String id) {
        teacherRepository.remove(id);
    }

    @Override
    public void display() {
        teacherRepository.display();
    }
}
