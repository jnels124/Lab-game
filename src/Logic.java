
/**
 * Acts as the central hub of the game.
 * 
 * @author Josh Gillham
 * @version 10-29-12
 */
public class Logic {
    /** Used to signal an illegal move direction. */
    class BadDirectionException extends Exception {}
    
    /**
     * Initializes the class.
     * 
     * @param character is the player.
     * @param maze is the maze.
     * 
     * @throws NullPointerException if either character or maze is null.
     * @throws IllegalArgumentException if the characters position is off the map.
     */
    public Logic( Character character, Maze maze ) {
        throw new UnsupportedOperationException();
    }
    
    /**
     * Sets/resets local fields. Starts the game. Called be the constructor.
     * 
     * Post Conditions:
     * -character is at the starting position.
     * 
     * @param character is the player.
     * @param maze is the maze.
     * 
     * @throws NullPointerException if either character or maze is null.
     */
    public final void newMaze( Character character, Maze maze ) {
        throw new UnsupportedOperationException();
    }
    
    /**
     * Sets/resets local fields. Starts the game. Can be called to restart the game.
     * 
     * Post Conditions:
     * -character is at the starting position.
     */
    public final void newMaze( ) {
        throw new UnsupportedOperationException();
    }
    
    /**
     * Causes the player to move in the direction specified.
     * 
     * @param direction is the direction to move.
     * 
     * @throws BadDirectionException when the direction is not allowed by the maze.
     */
    public void makeMove( Direction direction ) throws BadDirectionException {
        throw new UnsupportedOperationException();
    }
    
    /**
     * Gets the character.
     * 
     * @return the character.
     */
    public Character getCharacter() {
        throw new UnsupportedOperationException();
    }
}

