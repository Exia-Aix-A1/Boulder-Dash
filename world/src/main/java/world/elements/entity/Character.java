package world.elements.entity;

import world.Dimension;
import world.Position;
import world.Permeability;

import java.awt.*;

public class Character extends Entity {

    private static String SPRITE = "";
    private static Permeability PERMEABILITY = Permeability.PERMEABLE;
    public Character(Position position, Dimension dimension) {
        super(position, dimension, SPRITE, PERMEABILITY);
        this.setBackground(Color.RED);
    }
}