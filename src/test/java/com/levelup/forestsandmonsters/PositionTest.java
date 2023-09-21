package com.levelup.forestsandmonsters;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PositionTest {
    @Test 
    public void initializationSetsXCoordinates () {
        Position position = new Position(6, 7);
        assertEquals(6, position.coordinates.x);
    }
    
    @Test 
    public void initializationSetsYCoordinates () {
        Position position = new Position(6, 7);
        assertEquals(7, position.coordinates.y);
    }
}

