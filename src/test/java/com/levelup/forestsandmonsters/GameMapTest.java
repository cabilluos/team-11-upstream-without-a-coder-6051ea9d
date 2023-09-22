package com.levelup.forestsandmonsters;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


import org.junit.Before;
import org.junit.Test;

import com.levelup.forestsandmonsters.GameController.DIRECTION;

public class GameMapTest {

    private GameMap map;
    private int mapXDimension = 10;
    private int mapYDimension = 10;

    @Before
    public void init() {
        this.map = new GameMap(this.mapXDimension, this.mapYDimension);
    } 

    @Test
    public void initializationGameMapTest() {
        assertEquals(this.mapXDimension, this.map.getPositions().length);
        assertEquals(this.mapYDimension, this.map.getPositions()[0].length);        
    }

    ///////////////////////////////
    // non-bonce calculate position tests
    @Test 
    public void calculatePositionNonBonceNorthTest() {
        // selecting a valid position x= 5 and y = 5 valid position
        Position startingPosition = new Position(5, 5);
        DIRECTION direction = DIRECTION.NORTH;

        // checking if the final position is the right one
        Position calculatedPosition = this.map.calculatePosition(startingPosition, direction);

        // testing x axis
        assertEquals(startingPosition.coordinates.x, calculatedPosition.coordinates.x);

        // testing y axis
        assertEquals(new Position(5, 4).coordinates.y, calculatedPosition.coordinates.y);
    }

    @Test 
    public void calculatePositionNonBonceSouthTest() {
        // selecting a valid position x= 5 and y = 5 valid position
        Position startingPosition = new Position(5, 5);
        DIRECTION direction = DIRECTION.SOUTH;

        // checking if the final position is the right one
        Position calculatedPosition = this.map.calculatePosition(startingPosition, direction);

        // testing x axis
        assertEquals(startingPosition.coordinates.x, calculatedPosition.coordinates.x);

        // testing y axis
        assertEquals(new Position(5, 6).coordinates.y, calculatedPosition.coordinates.y);
    }

    @Test 
    public void calculatePositionNonBonceLeftTest() {
        // selecting a valid position x= 5 and y = 5 valid position
        Position startingPosition = new Position(5, 5);
        DIRECTION direction = DIRECTION.WEST;

        // checking if the final position is the right one
        Position calculatedPosition = this.map.calculatePosition(startingPosition, direction);
        Position targetPosition = new Position(4, 5);

        // testing x axis
        assertEquals(targetPosition.coordinates.x, calculatedPosition.coordinates.x);

        // testing y axis
        assertEquals(targetPosition.coordinates.y, calculatedPosition.coordinates.y);        
    }

    @Test 
    public void calculatePositionNonBonceRightTest() {
        // selecting a valid position x= 5 and y = 5 valid position
        Position startingPosition = new Position(5, 5);
        DIRECTION direction = DIRECTION.EAST;

        // checking if the final position is the right one
        Position calculatedPosition = this.map.calculatePosition(startingPosition, direction);
        Position targetPosition = new Position(6, 5);

        // testing x axis
        assertEquals(targetPosition.coordinates.x, calculatedPosition.coordinates.x);

        // testing y axis
        assertEquals(targetPosition.coordinates.y, calculatedPosition.coordinates.y);
    }

    @Test 
    public void calculatePositionBonceNorthTest() {
        // selecting a valid position x= 5 and y = 5 valid position
        Position startingPosition = new Position(1, 0);
        DIRECTION direction = DIRECTION.EAST;

        // checking if the final position is the right one
        Position calculatedPosition = this.map.calculatePosition(startingPosition, direction);
        Position targetPosition = startingPosition;

        // testing x axis
        assertEquals(targetPosition.coordinates.x, calculatedPosition.coordinates.x);

        // testing y axis
        assertEquals(targetPosition.coordinates.y, calculatedPosition.coordinates.y);
    }    

    @Test 
    public void calculatePositionBonceSouthTest() {
        // selecting a valid position x= 10 and y = 11 valid position
        Position startingPosition = new Position(10, 11);;
        DIRECTION direction = DIRECTION.EAST;

        // checking if the final position is the right one
        Position calculatedPosition = this.map.calculatePosition(startingPosition, direction);
        Position targetPosition = startingPosition;

        // testing x axis
        assertEquals(targetPosition.coordinates.x, calculatedPosition.coordinates.x);

        // testing y axis
        assertEquals(targetPosition.coordinates.y, calculatedPosition.coordinates.y);
    }

    @Test 
    public void calculatePositionBonceLeftTest() {
        // selecting a valid position x= 0 and y = 1 valid position
        Position startingPosition = new Position(0, 1);
        DIRECTION direction = DIRECTION.WEST;

        // checking if the final position is the right one
        Position calculatedPosition = this.map.calculatePosition(startingPosition, direction);
        Position targetPosition = startingPosition;

        // testing x axis
        assertEquals(targetPosition.coordinates.x, calculatedPosition.coordinates.x);

        // testing y axis
        assertEquals(targetPosition.coordinates.y, calculatedPosition.coordinates.y);
    }
    
    @Test 
    public void calculatePositionBonceRightTest() {
        // selecting a valid position x= 11 and y = 1 valid position
        Position startingPosition = new Position(11, 1);
        DIRECTION direction = DIRECTION.EAST;

        // checking if the final position is the right one
        Position calculatedPosition = this.map.calculatePosition(startingPosition, direction);
        Position targetPosition = startingPosition;

        // testing x axis
        assertEquals(targetPosition.coordinates.x, calculatedPosition.coordinates.x);

        // testing y axis
        assertEquals(targetPosition.coordinates.y, calculatedPosition.coordinates.y);
    }
    
    @Test 
    public void validateGetTotalPositions() {        
        int totalPosition = mapXDimension * mapYDimension;
        assertEquals(totalPosition, this.map.getTotalPositions());
    }  

}
