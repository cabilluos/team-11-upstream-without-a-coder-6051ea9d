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
        String s = new String("Erin");
        Character testObj = new Character(s);
        assertEquals(s,testObj.getName());
    }

    @Test
    public void setPositionTest() {
        int x = 4;
        int y = 5;
        Character testObj = new Character();
        testObj.setPosition(x,y);
        assertEquals(4, testObj.currentPosition.coordinates.x);
        assertEquals(5, testObj.currentPosition.coordinates.y);
    }

    @Test
    public void getPositionTest() {
        Character testObj = new Character();
        Position curPosition = testObj.getPosition();
        assertEquals(1, curPosition.coordinates.x);
        assertEquals(1, curPosition.coordinates.y);
    }

}