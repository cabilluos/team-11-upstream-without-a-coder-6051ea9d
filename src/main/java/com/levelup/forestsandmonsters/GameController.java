package com.levelup.forestsandmonsters;

import java.awt.Point;

public class GameController {
    Character character;
    static final String DEFAULT_CHARACTER_NAME = "Character";

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
        // TODO: Implement startGame - Should probably create tiles and put the character
        // on them?
        // TODO: Should also update the game results?
    }

    public GameStatus getStatus() {
        return this.status;
    }

    public void setCharacterPosition(Point coordinates) {
        // TODO: IMPLEMENT THIS TO SET CHARACTERS CURRENT POSITION -- exists to be testable
    }

    public void setCurrentMoveCount(int moveCount) {
        // TODO: IMPLEMENT THIS TO SET CURRENT MOVE COUNT -- exists to be testable
    }

    public int getTotalPositions() {
        // TODO: IMPLEMENT THIS TO GET THE TOTAL POSITIONS FROM THE MAP -- exists to be
        // testable
        return -10;
    }

}
