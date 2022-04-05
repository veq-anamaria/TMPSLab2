package adapter;

public class EuroToLeiAdaptor implements SalaryLei {
    private SalaryEuro money;

    public EuroToLeiAdaptor(SalaryEuro money) {
        this.money = money;
    }

    @Override
    public double getAmount() {

        return convertEurotoLei(money.getAmount());
    }

    private double convertEurotoLei(double m) {
        return m * 21.60;
    }
}


