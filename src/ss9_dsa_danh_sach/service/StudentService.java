package ss9_dsa_danh_sach.service;

import ss9_dsa_danh_sach.model.HocVien;
import ss9_dsa_danh_sach.repository.StudentRepository;

public class StudentService implements IStudentService {
    StudentRepository studentRepository = new StudentRepository();

    @Override
    public HocVien findById(String id) {
        studentRepository.findById(id);
        return null;
    }

    @Override
    public void add(HocVien hocVien) {
        studentRepository.add(hocVien);
    }

    @Override
    public void remove(String id) {
        studentRepository.remove(id);
    }

    @Override
    public void display() {
        studentRepository.display();
    }
}
