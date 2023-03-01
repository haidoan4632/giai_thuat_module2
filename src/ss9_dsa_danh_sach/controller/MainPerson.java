package ss9_dsa_danh_sach.controller;

import ss9_dsa_danh_sach.model.GiangVien;
import ss9_dsa_danh_sach.model.HocVien;
import ss9_dsa_danh_sach.service.StudentService;
import ss9_dsa_danh_sach.service.TeacherService;

import java.util.Scanner;

public class MainPerson {
    public void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        TeacherService teacherService = new TeacherService();
        StudentService studentService = new StudentService();
        do {
            System.out.println("-----Chọn chức năng theo số-----");
            System.out.println("1.Thêm mới giảng viên hoặc học sinh: ");
            System.out.println("2.Xóa giảng viên hoặc học sinh: ");
            System.out.println("3.Xem danh sách giảng viên hoặc học sinh: ");
            System.out.println("4.Thoát: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    do {
                        System.out.println("1.Thêm mới giảng viên hoặc học sinh: ");
                        System.out.println("1.Thêm giảng viên: ");
                        System.out.println("2.Thêm học sinh: ");
                        System.out.println("3.Return menu: ");
                        int choice1 = Integer.parseInt(scanner.nextLine());
                        switch (choice1) {
                            case 1:
                                System.out.println("1.Thêm giảng viên: ");
                                GiangVien giangVien;
                                System.out.println("Mã giảng viên: ");
                                String code = scanner.nextLine();
                                System.out.println("Tên giảng viên: ");
                                String name = scanner.nextLine();
                                System.out.println("Ngày tháng năm sinh: ");
                                String date = scanner.nextLine();
                                System.out.println("Giới tính: ");
                                String gender = scanner.nextLine();
                                System.out.println("Chuyên môn: ");
                                String expertise = scanner.nextLine();
                                giangVien = new GiangVien(code, name, date, gender, expertise);
                                teacherService.add(giangVien);
                                break;
                            case 2:
                                System.out.println("1.Thêm học sinh: ");
                                HocVien hocVien;
                                System.out.println("Mã học viên: ");
                                String code1 = scanner.nextLine();
                                System.out.println("Tên học viên: ");
                                String name1 = scanner.nextLine();
                                System.out.println("Ngày tháng năm sinh: ");
                                String date1 = scanner.nextLine();
                                System.out.println("Giới tính: ");
                                String gender1 = scanner.nextLine();
                                System.out.println("Lớp học viên: ");
                                String className = scanner.nextLine();
                                System.out.println("Điểm học viên: ");
                                String score = scanner.nextLine();
                                hocVien = new HocVien(code1, name1, date1, gender1, className, score);
                                studentService.add(hocVien);
                                break;
                            case 3:
                                displayMainMenu();
                            default:
                                System.out.println("Bạn vui lòng nhập lựa chọn phù hợp");
                        }
                    } while (true);
                case 2:
                    do {
                        System.out.println("Xóa giảng viên hoặc học sinh: ");
                        System.out.println("1.Xóa giảng viên: ");
                        System.out.println("2.Xóa học viên: ");
                        int choice2 = Integer.parseInt(scanner.nextLine());
                        switch (choice2) {
                            case 1:
                                System.out.println("1.Xóa giảng viên: ");
                                System.out.println("Nhập id giảng viên muốn xóa: ");
                                String id = scanner.nextLine();
                                if (teacherService.findById(id) != null) {

                                    do {
                                        System.out.println("1.Yes");
                                        System.out.println("2.No");
                                        int choice4 = Integer.parseInt(scanner.nextLine());
                                        switch (choice4) {
                                            case 1:
                                                teacherService.remove(id);
                                                break;
                                            case 2:
                                                displayMainMenu();
                                            default:
                                                System.out.println("Bạn vui lòng nhập lựa chọn phù hợp");
                                        }
                                    } while (true);

                                } else {
                                    System.out.println("Không tìm thấy id của giảng viên bạn muốn xóa: ");
                                }
                                break;
                            case 2:
                                System.out.println("2.Xóa học viên: ");
                                System.out.println("Nhập id học viên muốn xóa: ");
                                String id1 = scanner.nextLine();
                                if (studentService.findById(id1) != null) {
                                    do {
                                        System.out.println("1.Yes");
                                        System.out.println("2.No");
                                        int choice5 = Integer.parseInt(scanner.nextLine());
                                        switch (choice5) {
                                            case 1:
                                                studentService.remove(id1);
                                                break;
                                            case 2:
                                                displayMainMenu();
                                            default:
                                                System.out.println("Bạn vui lòng nhập lựa chọn phù hợp");
                                        }
                                    } while (true);
                                } else {
                                    System.out.println("Không tìm thấy id của học viên bạn muốn xóa: ");
                                }
                                break;
                            case 3:
                                displayMainMenu();
                            default:
                                System.out.println("Bạn vui lòng nhập lựa chọn phù hợp");
                        }
                    } while (true);
                case 3:

                    do {
                        System.out.println("Xem danh sách giảng viên hoặc học sinh: ");
                        System.out.println("1.Xem danh sách giảng viên: ");
                        System.out.println("2.Xem danh sách học viên: ");
                        System.out.println("3.Trở về menu chính: ");
                        int choice3 = Integer.parseInt(scanner.nextLine());
                        switch (choice3) {
                            case 1:
                                System.out.println("Xem danh sách giảng viên: ");
                                teacherService.display();
                                break;
                            case 2:
                                System.out.println("2.Xem danh sách học viên: ");
                                studentService.display();
                                break;
                            case 3:
                                displayMainMenu();
                            default:
                                System.out.println("Bạn vui lòng nhập lựa chọn phù hợp");
                        }
                    } while (true);
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Bạn vui lòng nhập lựa chọn phù hợp");
            }
        } while (true);

    }
}
