import java.util.Set;

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
     * @param columns is the total columns in the maze.
     * @param rows is the total rows in the maze.
     * 
     * @throws IllegalArgumentException if columns or rows are less than 1.
     */
    public Maze( int columns, int rows ) {
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
     * Accesses the set of possible directions the player can move from this position on
     *  the map.
     * 
     * @param position is the place on the maze to check.
     * 
     * @return the set of all possible moves.
     * 
     * @throws NullPointerException when position is null.
     */
    public Set< Direction > getChoices( Coordinate position ) {
        throw new UnsupportedOperationException();
    }
}
