package composite;

public class Button implements ComponentGrafic{
    @Override
    public void disable() {
        System.out.println("Componenta a fost dezactivata");
    }
}
