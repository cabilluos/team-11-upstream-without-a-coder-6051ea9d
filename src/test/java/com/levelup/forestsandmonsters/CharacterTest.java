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

}