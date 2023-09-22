package com.levelup.forestsandmonsters;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;


public class GameControllerTestDan extends GameControllerTest {

    private GameController controller = null;

    @Before
    public void init() {
        //initialize game controller
        this.controller = new  GameController();
    } 

    @Test
    public void initializationCreatesResults() {
        assertNotNull(this.controller.status);
    }

    @Test
    public void createCharacterDefaultTest() {
        // create a character in the controller
        this.controller.createCharacter(null);
        // validate
        assertEquals(GameController.DEFAULT_CHARACTER_NAME, this.controller.status.characterName);
    }

    @Test
    public void createCharacterTest() {
        // create a static character name
        String characterName = "Mad Randy";
        // create a character in the controller
        this.controller.createCharacter(characterName);
        // validate
        assertEquals(this.controller.status.characterName, characterName);
    }

}
