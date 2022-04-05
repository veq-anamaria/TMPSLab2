package composite;

public class Client {
    public static void main(String[] args) {
        Button button1 = new Button();
        Button button2 = new Button();
        Button button3 = new Button();
        Button button4 = new Button();

        //Creates two composites containing the buttons
        Panel panel1 = new Panel();
        panel1.add(button1);
        panel1.add(button2);
        panel1.add(button3);

        Panel panel2 = new Panel();
        panel2.add(button4);

        //Create another panel that contains two buttons
        Panel panel3 = new Panel();
        panel3.add(panel1);
        panel3.add(panel2);

        //Prints the complete panel (Four times the string "Ellipse").
        panel3.disable();

    }
}
