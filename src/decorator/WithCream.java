package decorator;

public class WithCream extends CakeDecorator {
    public WithCream(Cake cake) {//constructor matching super
        super(cake);
    }

    public String decorate() {
        return super.decorate() + decorateWithCream();
    }

    private String decorateWithCream() {
        return " Decorate with Cream ";
    }
}
