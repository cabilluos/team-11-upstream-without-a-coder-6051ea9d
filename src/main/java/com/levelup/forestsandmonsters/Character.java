package com.levelup.forestsandmonsters;
import com.levelup.forestsandmonsters.Position;
import com.levelup.forestsandmonsters.GameController;

public class Character {

    public static final String DEFAULT_NAME = "Bob";
    String name;
    Position currentPosition; 

    public Character() {
        int default_posX = 1;
        int default_posY = 1;
        this.setName(DEFAULT_NAME);
        currentPosition = new Position(default_posX, default_posY);
    }

    public Character(String lName) {
        int default_posX = 1;
        int default_posY = 1;
        this.setName(lName);
        currentPosition = new Position(default_posX, default_posY);
    }

    public void setName(String lName){
        name = lName;
    }

    public String getName(){
        return name;
    }

    public void setPosition(int posX, int posY){
        currentPosition.coordinates.setLocation(posX, posY);
    }

    public Position getPosition(){
        return currentPosition;
    }

}