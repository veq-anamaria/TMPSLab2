package decorator;

public class WithCandles extends CakeDecorator {

    //constructor matching super
    public WithCandles(Cake cake) {
        super(cake);
    }

    public String decorate() {
        return super.decorate() + decorateWithCandles();
    }

    private String decorateWithCandles() {
        return " Decorate with Candles ";
    }
}
