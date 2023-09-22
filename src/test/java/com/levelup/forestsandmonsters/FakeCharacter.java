package com.levelup.forestsandmonsters;
import com.levelup.forestsandmonsters.GameController.DIRECTION;

public class FakeCharacter extends Character {
    int moveCount;
    DIRECTION directionProvided;
    Position STUBBED_NEW_POSITION = new Position(4,3);
    Position currentPosition = new Position(1,1);
    public void move(DIRECTION direction) {
        this.directionProvided = direction;
        this.currentPosition = STUBBED_NEW_POSITION;
    }

    public void enterMap(GameMap m) {
        this.currentPosition = STUBBED_NEW_POSITION;
    }
    public void getMoveCount() {
        this.moveCount = 5;
    }
}