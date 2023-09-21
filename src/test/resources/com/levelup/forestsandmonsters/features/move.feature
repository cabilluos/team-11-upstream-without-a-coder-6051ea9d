Feature: Move in a direction 
    
    I want to move my character. If they attempt to 
    move past a boundary, the move results in no change in position but does increment move count.

    <img src="images/sbe.png" width="300">

    Scenario Outline: Move in a direction
        Given the character starts at position with XCoordinates <startingPositionX> 
        And starts at YCoordinates <startingPositionY>
        And the player chooses to move in <direction>
        And the current move count is <startingMoveCount>
        When the character moves
        Then the character is now at position with XCoordinates <endingPositionX>
        And YCoordinates <endingPositionY>
        And the new move count is <endingMoveCount>
        Examples:
            | startingPositionX | startingPositionY | direction | startingMoveCount | endingPositionX | endingPositionY | endingMoveCount |
            | 1 | 1 | NORTH | 0 | 1 | 1 | 1 |
            | 1 | 1 | SOUTH | 1 | 1 | 2 | 2 |
            | 2 | 1 | NORTH | 1 | 2 | 1 | 2 |
            | 2 | 1 | WEST | 2 | 1 | 1 | 3 |
            | 1 | 1 | SOUTH | 3 | 1 | 2 | 4 |
            | 7 | 10 | EAST | 300 | 8 | 10 | 301 |
            | 3 | 9 | NORTH | 400 | 3 | 8 | 401 |
            | 2 | 10 | EAST | 451 | 3 | 10 | 452 |
            | 1 | 6 | SOUTH | 13 | 1 | 7 | 14 |
