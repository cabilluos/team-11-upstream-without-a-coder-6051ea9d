package com.levelup.forestsandmonsters;

//import static org.junit.Assert.assertNotNull;
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
        int arbitrary_posX = 4;
        int arbitrary_posY = 5;
        Character testObj = new Character();
        testObj.setPosition(arbitrary_posX,arbitrary_posY);
        assertEquals(arbitrary_posX, testObj.currentPosition.coordinates.x);
        assertEquals(arbitrary_posY, testObj.currentPosition.coordinates.y);
    }

    @Test
    public void getPositionTest() {
        int abritrary_posX = 1;
        int abritrary_posY = 1;
        Character testObj = new Character();
        Position curPosition = testObj.getPosition();
        assertEquals(abritrary_posX, curPosition.coordinates.x);
        assertEquals(abritrary_posY, curPosition.coordinates.y);
    }

}