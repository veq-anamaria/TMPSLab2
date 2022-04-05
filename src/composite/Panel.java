package composite;

import java.util.List;
import java.util.ArrayList;

public class Panel implements  ComponentGrafic{
    private final List<ComponentGrafic> childComponentGrafic = new ArrayList<>();

    //Adds the graphic to the composition.
    public void add(ComponentGrafic grafic) {
        childComponentGrafic.add(grafic);
    }

    //Prints the graphic.
    @Override
    public void disable() {
        for (ComponentGrafic grafic : childComponentGrafic) {
            grafic.disable();  //Delegation
        }
    }

}
