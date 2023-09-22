package com.levelup.forestsandmonsters;
import com.levelup.forestsandmonsters.GameController.DIRECTION;
import com.levelup.forestsandmonsters.GameMap;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CharacterTest {
    @Test
    public void InitializeDefaultCharacter() {
        Character testObj = new Character();
        assertEquals(Character.DEFAULT_NAME,testObj.getName());
    }

    @Test
    public void InitializeNamedCharacter() {
        String defaultCharacter = new String("Erin");
        Character testObj = new Character(defaultCharacter);
        assertEquals(defaultCharacter,testObj.getName());
    }

    @Test
    public void setPositionTest() {
        int arbitraryPosX = 4;
        int arbitraryPosY = 5;
        Character testObj = new Character();
        testObj.setPosition(arbitraryPosX,arbitraryPosY);
        assertEquals(arbitraryPosX, testObj.currentPosition.coordinates.x);
        assertEquals(arbitraryPosY, testObj.currentPosition.coordinates.y);
    }

    @Test
    public void getPositionTest() {
        int abritraryPosX = 1;
        int abritraryPosY = 1;
        Character testObj = new Character();
        Position curPosition = testObj.getPosition();
        assertEquals(abritraryPosX, curPosition.coordinates.x);
        assertEquals(abritraryPosY, curPosition.coordinates.y);
    }

    @Test
    public void enterMapTest() {
        Character testObj = new Character();
        GameMap map = new GameMap(10,10);
        testObj.enterMap(map);
        assertNotNull(map);
    }

    @Test
    public void moveTest() {
        Character testObj = new Character();
        GameMap map = new GameMap(10,10);
        testObj.enterMap(map);
        testObj.move(GameController.DIRECTION.NORTH);
    }

        //assertEquals(GameController.DIRECTION.NORTH, curPosition.coordinates.x);

}