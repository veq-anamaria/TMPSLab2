package proxy;

public class Main {
    public static void main(String[] args) {
        Games games =new ProxyGame("Plato");

        games.start();
        System.out.println("");

        games.start();
    }
}
