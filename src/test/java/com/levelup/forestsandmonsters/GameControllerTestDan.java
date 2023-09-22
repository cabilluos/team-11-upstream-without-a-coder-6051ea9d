package com.levelup.forestsandmonsters;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

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
        // check the status character-name
        assertEquals(GameController.DEFAULT_CHARACTER_NAME, this.controller.status.characterName);
        // check the character name
        assertEquals(GameController.DEFAULT_CHARACTER_NAME, this.controller.character.name);
    }

    @Test
    public void createCharacterWithNameTest() {
        // create a static character name
        String characterName = "Mad Randy";
        // create a character in the controller
        this.controller.createCharacter(characterName);
        // check the status character-name
        assertEquals(characterName, this.controller.status.characterName);
        // check the character name
        assertEquals(characterName, this.controller.character.name);
    }
}
