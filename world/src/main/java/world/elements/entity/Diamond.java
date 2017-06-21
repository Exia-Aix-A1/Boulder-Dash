package world.elements.entity;

import world.Position;
import world.Permeability;

import java.awt.*;

public class Diamond extends Entity {

    private static String SPRITE = "Diamond.png";
    private static Permeability PERMEABILITY = Permeability.PERMEABLE;
    public Diamond(Position position, Dimension dimension){
        super(position, dimension, SPRITE, PERMEABILITY, 20);
    }

    @Override
    public void loadBehaviors() {

    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
