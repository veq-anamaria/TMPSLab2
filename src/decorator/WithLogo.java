package decorator;

public class WithLogo extends CakeDecorator {
    public WithLogo(Cake cake) {//constructor matching super
        super(cake);
    }

    public String decorate() {
        return super.decorate() + decorateWithLogo();
    }

    private String decorateWithLogo() {
        return " Decorate with Logo ";
    }
}
