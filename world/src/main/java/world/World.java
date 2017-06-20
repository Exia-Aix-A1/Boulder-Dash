package world;

import engine.TickListener;
import world.elements.block.Block;
import world.elements.entity.Entity;
import world.elements.entity.Character;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class World implements ICreateWorld, IWorld {
    private String name;
    private Dimension dimension;
    private int score;
    private int diamonds_left;
    private Date startTime;
    private ArrayList<Entity> entities;
    private ArrayList<Block> blocks;
    private Character character;

    private int timeRemaining;

    public World(String name, Dimension dimension, int diamonds_left, int timeRemaining){
        this.name = name;
        this. dimension = dimension;
        this.diamonds_left = diamonds_left;
        this.timeRemaining = timeRemaining;

        this.entities = new ArrayList<>();
        this.blocks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getTimeRemaining() {
        return timeRemaining;
    }

    @Override
    public Dimension getDimension() {
        return dimension;
    }

    public ArrayList<Block> getBlocks() {
        return blocks;
    }

    public ArrayList<Entity> getEntities() {
        return entities;
    }

    public Character getCharacter() {
        return character;
    }

    public Date getStartTime() {
        return startTime;
    }

    public int getDiamonds_left() {
        return diamonds_left;
    }

    public int getScore() {
        return score;
    }

    @Override
    public void addEntity(Entity entity){
        if(entity instanceof Character){
            this.character = (Character) entity;
        }else{
            this.entities.add(entity);
        }
    }

    @Override
    public void addBlock (Block block){
        this.blocks.add(block);
    }


    @Override
    public IControllable getControllable() {
        return null;
    }

    @Override
    public Collection<JComponent> getComponents() {
        Collection<JComponent> components = new ArrayList<>();
        components.addAll(blocks);
        components.addAll(entities);
        if (character != null){
            components.add(character);
        }
        return components;
    }

    @Override
    public Collection<TickListener> getTickListeners() {
        Collection<TickListener> tickListeners = new ArrayList<>();
        tickListeners.addAll(this.entities);
        tickListeners.add(this.character);

        return tickListeners;
    }
}
