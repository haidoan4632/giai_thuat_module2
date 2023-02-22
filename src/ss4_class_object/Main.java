package ss4_class_object;

public class Main {
    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        doctor.setNameDoctor("Doãn Hải");
        doctor.setAddress("Đà Nẵng city");
        doctor.setEmail("doanhai01287181543@gmail.com");
        doctor.setNumber("0971181490");
        doctor.setPosition("Học viên");
        String result = doctor.toString();
        System.out.println(result);
    }
}
