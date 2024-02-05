import java.util.ArrayList;

public class EmployeeManagementSystem {

    private ArrayList<String> employees = new ArrayList<>();

    public void addEmployee(String name) {
        employees.add(name);
    }

    public void removeEmployee(String name) {
        employees.remove(name);
    }

    public void getEmployees() {
        for (String employee : employees) {
            System.out.println(employee);
        }
    }

    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem();

        ems.addEmployee("Naz");
        ems.addEmployee("Onur");
        ems.addEmployee("Eda");

        ems.getEmployees();

        ems.removeEmployee("Onur");

        ems.getEmployees();
    }
}
