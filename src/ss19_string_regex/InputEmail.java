package ss19_string_regex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class InputEmail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập địa chỉ email, các email phải cách nhau bởi dấu chấm phẩy");
        String allEmail = scanner.nextLine();
        String[] arrEmail = allEmail.split(",");
        System.out.println("In ra mảng chứa các email: ");
        System.out.println(Arrays.toString(arrEmail));
        System.out.println("Chuyển từ array sang arrayList:");
        ArrayList<String> emailRegex = new ArrayList<String>(Arrays.asList(arrEmail));
            for (int i = 0; i < emailRegex.size(); i++) {
                if (emailRegex.get(i).matches(Regex.checkEmail())) {
                   emailRegex.remove(emailRegex.get(i));
                   i--;
                }
            }
        System.out.println("Mảng trả về những địa chỉ email không hợp lệ:");
        System.out.println(emailRegex);
    }
}
// do {
//            System.out.println("Input address email: ");
//            email = scanner.nextLine();
//            if (!email.matches(Regex.checkEmail())) {
//                System.out.println("Input again!");
//            }
//        } while (!email.matches(Regex.checkEmail()));