package flyweight;
import java.util.HashMap;

public class FactoryShape {
    private static final HashMap squareMap = new HashMap();

    public static Shape getSquare(String color) {
        Square square = (Square) squareMap.get(color);

        if(square == null) {
            square = new Square(color);
            squareMap.put(color, square);
            System.out.println("Creating circle of color : " + color);
        }
        return square;
    }
}
