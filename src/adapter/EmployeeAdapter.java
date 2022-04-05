package adapter;

public class EmployeeAdapter implements SalaryAdapter {
    private SalaryEuro money;

    public EmployeeAdapter(SalaryEuro money) {
        this.money = money;
    }

    @Override
    public double getMoney() {

        return convertEurotoLei(money.getMoney());
    }

    private double convertEurotoLei(double m) {
        return m * 21.60;
    }
}


