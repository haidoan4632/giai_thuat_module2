package ss13_search.controller;

import ss13_search.service.ISpendingClassService;
import ss13_search.service.SpendingClassService;

import java.util.Scanner;

public class SpendingClassManager {
    public static void displayMainMenu() {
        ISpendingClassService spendingClassService = new SpendingClassService();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("---Quản lý chi tiêu---");
            System.out.println("1.Hiển thị danh sách: ");
            System.out.println("2.Thêm chi tiêu: ");
            System.out.println("3.Xóa chi tiêu: ");
            System.out.println("4.Sửa chi tiêu: ");
            System.out.println("5. Tìm kiếm theo mã chi tiêu: ");
            System.out.println("6. Tìm kiếm gần đúng theo tên chi tiêu: ");
            System.out.println("7.Sắp xếp theo tên");
            System.out.println("8.Sắp xếp theo số tiền tăng giảm dần, nếu số tiền tiêu giống nhau thì sắp xếp theo tên tăng dần");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("1.Hiển thị danh sách: ");
                    spendingClassService.display();
                    break;
                case 2:
                    System.out.println("2.Thêm chi tiêu: ");
                    spendingClassService.add();
                    break;
                case 3:
                    System.out.println("3.Xóa chi tiêu: ");
                    spendingClassService.delete();
                    break;
                case 4:
                    System.out.println("4.Sửa chi tiêu: ");
                    spendingClassService.edit();
                    break;
                case 5:
                    System.out.println("5. Tìm kiếm theo mã chi tiêu: ");
                    spendingClassService.findMaChiTieu();
                    break;
                case 6:
                    System.out.println("6. Tìm kiếm gần đúng theo tên chi tiêu: ");
                    spendingClassService.findSpendingName();
                    break;
                case 7:
                    System.out.println("Sắp xếp theo tên: ");
                    spendingClassService.sortName();
                    break;
                case 8:
                    System.out.println("Sắp xếp theo số tiền tăng giảm dần, nếu số tiền tiêu giống nhau thì sắp xếp theo tên tăng dần");
                    spendingClassService.sortSoTienChi();
                    break;
                default:
                    System.out.println("Cần nhập lựa chọn đúng");
            }
        } while (true);
    }
}
