package com.levelup.forestsandmonsters;
import com.levelup.forestsandmonsters.Position;
import com.levelup.forestsandmonsters.GameController.DIRECTION;
import com.levelup.forestsandmonsters.GameController;
import com.levelup.forestsandmonsters.GameMap;

public class Character {

    public static String DEFAULT_NAME = "Bob";
    String name;
    Position currentPosition;
    private GameMap map;
    private int moveCount = 0;

    public Character() {
        int defaultPosX = 1;
        int defaultPosY = 1;
        this.setName(DEFAULT_NAME);
        currentPosition = new Position(defaultPosX, defaultPosY);
    }

    public Character(String lName) {
        int defaultPosX = 1;
        int defaultPosY = 1;
        this.setName(lName);
        currentPosition = new Position(defaultPosX, defaultPosY);
    }

    public Character(String lName, GameMap lMap) {
        int defaultPosX = 1;
        int defaultPosY = 1;
        this.setName(lName);
        this.enterMap(lMap);
        currentPosition = new Position(defaultPosX, defaultPosY);
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

    public void enterMap(GameMap lMap){
        map = lMap;
    }

    public int getMoveCount(){
        return moveCount;
    }

    public void move(DIRECTION direction) {
        System.out.println("Current positionX:"+currentPosition.coordinates.x);
        System.out.println("Current positionY:"+currentPosition.coordinates.y);
        Position newPosition;
        newPosition = map.calculatePosition(currentPosition, direction);
        moveCount++;
    }
}