package decorator;

public class Main {
    public static void main(String[] args) {
        Cake cake1 = new WithCream(new BirthdayCake());
        System.out.println(cake1.decorate());

        Cake cake2 = new WithCandles(new WithCream(new WithCream(new BirthdayCake())));
        System.out.println(cake2.decorate());

        Cake cake3 = new WithLogo(new WithCandles(new WithCream(new BirthdayCake())));
        System.out.println(cake3.decorate());
    }
}
