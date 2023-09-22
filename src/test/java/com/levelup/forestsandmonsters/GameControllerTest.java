package com.levelup.forestsandmonsters;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
//import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.Test;

import com.levelup.forestsandmonsters.GameController.DIRECTION;

public class GameControllerTest {
    @Test
    public void initializationCreatesResults() {
        GameController testObj = new GameController();
        assertNotNull(testObj.status);
    }
    @Test
    public void moveCallCharactersMove() {
        GameController testObj = new GameController();
        FakeCharacter mockCharacter = new FakeCharacter();
        testObj.character = mockCharacter;

        testObj.move(DIRECTION.EAST);

        assertEquals(DIRECTION.EAST, mockCharacter.directionProvided);
    }
    @Test
    public void startGameInitializeMapAndGiveToCharacter() {
        GameController testObj = new GameController();
        FakeCharacter mockCharacter = new FakeCharacter();
        testObj.character = mockCharacter;
        testObj.startGame();
        assertNotNull(testObj.map);
        assertEquals(mockCharacter.STUBBED_NEW_POSITION.coordinates, mockCharacter.currentPosition.coordinates);
    }
    @Test
    public void numberOfPositions() {
        GameController testObj = new GameController();
        FakeCharacter mockCharacter = new FakeCharacter();
        testObj.character = mockCharacter;
        testObj.startGame();
        assertEquals(testObj.map.getTotalPositions(), 100);
    }
}
