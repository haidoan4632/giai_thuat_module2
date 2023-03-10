package ss5_access_modifier;

public class EmployeeABC {
    private String nameEmployee;
    private String number;
    private String departmentWork;
    public static String nameCompany1;

    //dòng lệnh tạo biến static: mục đích  sử dụng để tham chiếu thuộc tính chung của tất cả đối tượng
    // (mà không là duy nhất cho mỗi đối tượng. (Tên công ty là ABC)
    static {
        nameCompany1 = "ABC";
    }

    public EmployeeABC() {
    }

    public EmployeeABC(String nameEmployee, String number, String departmentWork, String nameCompany) {
        this.nameEmployee = nameEmployee;
        this.number = number;
        this.departmentWork = departmentWork;
    }

    //thể hiện tính bao đóng
    public String getNameEmployee() {
        return nameEmployee;
    }

    //thể hiện tính bao đóng
    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    //thể hiện tính bao đóng
    public String getNumber() {
        return number;
    }

    //thể hiện tính bao đóng
    public void setNumber(String number) {
        this.number = number;
    }

    //thể hiện tính bao đóng
    public String getDepartmentWork() {
        return departmentWork;
    }

    //thể hiện tính bao đóng
    public void setDepartmentWork(String departmentWork) {
        this.departmentWork = departmentWork;
    }

//thể hiện tính bao đóng
    public static String getNameCompany1() {
        return nameCompany1;
    }

    public static void setNameCompany1(String nameCompany1) {
        EmployeeABC.nameCompany1 = nameCompany1;
    }

    @Override
    public String toString() {
        return "EmployeeABC{" +
                "nameEmployee='" + nameEmployee + '\'' +
                ", number='" + number + '\'' +
                ", departmentWork='" + departmentWork + '\'' +
                ", nameCompany1='" + nameCompany1 + '\'' +
                '}';
    }
}
