package com.levelup.forestsandmonsters;

import java.awt.Point;

public class GameController {
    Character character;    
    static final String DEFAULT_CHARACTER_NAME = "Character";

    int moveCount = 0;

    GameMap map;
    int MAP_DEFAULT_X_DIMENSION = 10, MAP_DEFAULT_Y_DIMENSION = 10;

    public void move(DIRECTION directionToMove) {
        // TODO: Implement move - should call something on another class
        // TODO: Should probably also update the game results
        character.move(directionToMove);
        this.status.currentPosition = character.getPosition().coordinates;
        this.status.moveCount = character.getMoveCount();
    }

    public class GameStatus {
        // TODO: Add other status data
        public String characterName;
        public Point currentPosition;
        // TODO: Write a failing unit test that will force you to set this to the right number
        public int moveCount;
    }

    GameStatus status;

    public GameController() {
        status = new GameStatus();        
    }

    // TODO: Ensure this AND CLI commands match domain model
    public static enum DIRECTION {
        NORTH, SOUTH, EAST, WEST
    }

    // Pre-implemented to demonstrate ATDD
    // TODO: Update this if it does not match your design
    public void createCharacter(String name) {
        if (name != null && !name.equals("")) {
            status.characterName = name;            
        } else {
            status.characterName = DEFAULT_CHARACTER_NAME;
        }

        // initialize the character
        this.character = new Character(status.characterName);        
    }

    public void startGame() {
        // initialize the map
        map = new GameMap(MAP_DEFAULT_X_DIMENSION,MAP_DEFAULT_Y_DIMENSION);
    }

    public GameStatus getStatus() {
        return this.status;
    }

    public void setCharacterPosition(Point coordinates) {
        if (this.character == null) {
            this.character = new Character();
        }
        // set the pass position into the status
        this.character.currentPosition = new Position(coordinates.x, coordinates.y);;

        // update the status information
        this.status.currentPosition = coordinates;
        this.status.moveCount = 0;
    }

    public void setCurrentMoveCount(int moveCount) {
        // TODO: IMPLEMENT THIS TO SET CURRENT MOVE COUNT -- exists to be testable
    }

    public int getTotalPositions() {
        return this.map.getTotalPositions();
    }

}

