package com.levelup.forestsandmonsters;

import com.levelup.forestsandmonsters.GameController.DIRECTION;

public class GameMap {

    private int startXCoordinate = 1;
    private int startYCoordinate = 1;

    private int xDimension = 10;
    private int yDimension = 10;

    private Position positions[][];

    public GameMap(int xDimension, int yDimension) {
        // result positions
        this.positions = new Position[xDimension][yDimension];

        // initialize x positions
        for (int x=0 ; x < xDimension ; x++) {
            // initialize y positions
            for (int y=0 ; y < yDimension ; y++) {
                positions[x][y] = new Position(x, y);
            }
        }

        // initializing x dimesion
        this.xDimension = xDimension;
        // initializing y dimesion
        this.yDimension = yDimension;
    }

    public Position[][] getPositions() {
        return this.positions;
    }

    public Position calculatePosition(Position starPosition, DIRECTION direction) {

        // set coordinates
        int xCoordinates = starPosition.coordinates.x;
        int yCoordinates = starPosition.coordinates.y;

        // calculate position to the north
        if (DIRECTION.NORTH.equals(direction)) {
            yCoordinates--;
        }

        // calculate position to the south
        if (DIRECTION.SOUTH.equals(direction)) {
            yCoordinates++;
        }

        // calculate position to the west
        if (DIRECTION.WEST.equals(direction)) {
            xCoordinates--;
        }

        // calculate position to the east
        if (DIRECTION.EAST.equals(direction)) {
            xCoordinates++;
        }

        Position newPosition = new Position(xCoordinates, yCoordinates);
        
        if (this.isPositionValid(newPosition)) {
            return newPosition;
        } else {
            return starPosition;
        }        
        
    }

    private boolean isPositionValid(Position positionCoordinates) {
        boolean result = true;

        if (positionCoordinates.coordinates.y < startYCoordinate) {
            result = false;
        } else if (positionCoordinates.coordinates.y >= yDimension ) {
            result = false;
        } else if (positionCoordinates.coordinates.x < startXCoordinate ) {
            result = false;
        } else if (positionCoordinates.coordinates.x >= xDimension ) {
            result = false;
        }

        return result;
    }

    public int getTotalPositions() {
        return this.xDimension * this.yDimension;
    }
    
}
