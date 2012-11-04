import java.io.File;

/**
 * Holds the maze in a 2D array.
 *
 * @author Josh Gillham
 * @version 10-30-12
 */
public class Maze {
    /**
     * Initializes the class.
     * 
     * @param maze is the maze as a 2D array.
     * 
     * @throws NullPointerException if maze is null or any 
     *  one of the Wall references is null.
     */
    public Maze( Wall[][] maze ) {
        throw new UnsupportedOperationException();
    }
    
    /**
     * Checks if the coordinate can be found in the maze.
     * 
     * @param position is the coordinate to check for.
     * 
     * @return true if the position can be found in the maze OR false otherwise.
     */
    public boolean contains( Coordinate position ) {
        throw new UnsupportedOperationException();
    }
    
    /**
     * Accesses the set of possible directions the player can move from this 
     * position on the map.
     * 
     * @param position is the place on the maze to check.
     * 
     * @return the set of all possible moves.
     * 
     * @throw NullPointerException when position is null.
     * @throw OutOfBoundsException when position is not inside the maze.
     */
    public Wall getWall( Coordinate position ) {
        throw new UnsupportedOperationException();
    }
}
