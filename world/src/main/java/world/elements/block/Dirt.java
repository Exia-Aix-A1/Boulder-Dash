package world.elements.block;

import world.Dimension;
import world.Permeability;
import world.Position;
import world.Permeability;

import java.awt.*;

public class Dirt extends Block{

    private static String SPRITE = "";
    private static Permeability PERMEABILITY = Permeability.PERMEABLE;

    public Dirt(Position position, Dimension dimension){
        super(position, dimension, SPRITE, PERMEABILITY);
        this.setBackground(Color.ORANGE);
    }
}