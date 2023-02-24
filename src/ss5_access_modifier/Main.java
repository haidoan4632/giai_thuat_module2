package ss5_access_modifier;

public class Main {
    public static void main(String[] args) {
        EmployeeABC employeeABC = new EmployeeABC();

        employeeABC.setNameEmployee("Hải");
        employeeABC.setNumber("0905 999 999");
        employeeABC.setDepartmentWork("văn phòng");
        EmployeeABC.setNameCompany1("ABC vip");
        System.out.println(employeeABC.toString());
    }
}
