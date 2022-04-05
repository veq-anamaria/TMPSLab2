package adapter;

public class Main {
    public static void main(String[] args) {
        SalaryEuro employee = new Employee();
        SalaryAdapter employeeAdapter = new EmployeeAdapter(employee);
        System.out.println("Salariul in euro " + employee.getMoney());
        System.out.println("Salariul convertit in lei " + employeeAdapter.getMoney());
    }
}





