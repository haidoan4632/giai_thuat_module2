package ss13_search.service;

import ss13_search.model.SpendingClass;
import ss13_search.repository.ISpendingClassRepository;
import ss13_search.repository.SpendingClassRepository;
import ss13_search.utils.IdNotFoundException;
import ss13_search.utils.UniqueIDException;

import java.util.List;
import java.util.Scanner;

public class SpendingClassService implements ISpendingClassService {
    ISpendingClassRepository spendingClassRepository = new SpendingClassRepository();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        spendingClassRepository.display();
    }

    @Override
    public void add() {
        System.out.println("Mã chi tiêu: ");
        String maChiTieu = scanner.nextLine();
        System.out.println("Tên chi tiêu: ");
        String nameChiTieu = scanner.nextLine();
        System.out.println("Ngày chi tiêu: ");
        String ngayChiTieu = scanner.nextLine();
        System.out.println("Số tiền chi tiêu: ");
        String soTienChiTieu = scanner.nextLine();
        System.out.println("Mô tả thêm: ");
        String moTaThem = scanner.nextLine();
        try {
            spendingClassRepository.add(new SpendingClass(maChiTieu, nameChiTieu, ngayChiTieu, soTienChiTieu, moTaThem));
        } catch (UniqueIDException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete() {
        System.out.println("Nhập code cần xóa: ");
        String codeRemove = scanner.nextLine();
        try {
            spendingClassRepository.delete(codeRemove);
        } catch (IdNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void edit() {
        System.out.println("Nhập mã chi tiêu của đối tượng cần chỉnh sửa:");
        String code1 = scanner.nextLine();
        String result1 = spendingClassRepository.edit(code1);
        System.out.println("Chỉnh sửa chi tiêu: ");
        System.out.println("Mã chi tiêu: ");
        String maChiTieu = scanner.nextLine();
        System.out.println("Tên chi tiêu: ");
        String tenChiTieu = scanner.nextLine();
        System.out.println("Ngày chi tiêu: ");
        String ngayChiTieu = scanner.nextLine();
        System.out.println("soTienChiTieu: ");
        String soTienChiTieu = scanner.nextLine();
        System.out.println("Mô tả thêm: ");
        String moTaThem = scanner.nextLine();
        SpendingClass spendingClass = new SpendingClass(maChiTieu, tenChiTieu, ngayChiTieu, soTienChiTieu, moTaThem);
        if (result1 != null) {
            try {
                spendingClassRepository.add(spendingClass);
            } catch (UniqueIDException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void findMaChiTieu() {
        System.out.println("Nhập mã chi tiêu cần tìm kiếm: ");
        String maChiTieu = scanner.nextLine();
        SpendingClass result = spendingClassRepository.findCode(maChiTieu);
        System.out.println(result);
    }

    @Override
    public void findSpendingName() {
        System.out.println("Nhập tên chi tiêu cần tìm kiếm: ");
        String nameChiTieu = scanner.nextLine();
        List<SpendingClass> result = spendingClassRepository.findSpendingName(nameChiTieu);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }

    @Override
    public void sortName() {
        spendingClassRepository.sortName();
    }

    @Override
    public void sortSoTienChi() {
     spendingClassRepository.sortSoTienChi();
    }

}
