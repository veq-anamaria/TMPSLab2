package flyweight;

public class Square implements Shape{
    private String color;
    private int h;
    private int w;

    public Square(String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setH(int h) {
        this.h = h;
    }

    public void setW(int w) {
        this.w = w;
    }

    public void draw() {
        System.out.println("Square: Draw() [Color : " + color + ", height : " + h + ", weight :" + w);
    }

}
