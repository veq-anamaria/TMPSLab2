package adapter;

public class Main {
    public static void main(String[] args) {
        SalaryEuro employee = new Salary();
        SalaryLei employeeAdapter = new EuroToLeiAdaptor(employee);
        System.out.println("Salariul in euro " + employee.getAmount());
        System.out.println("Salariul convertit in lei " + employeeAdapter.getAmount());
    }
}





