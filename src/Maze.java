/**
 * Holds the maze in a 2D array.
 *
 * @author Josh Gillham, Jesse Nelson
 * @version 11/07/2012 Windows 8(x64) Java 1.7 U9
 */
public class Maze {
    private Wall [][] maze;
    
    /**
     * Initializes the class.
     * 
     * @param maze is the maze as a 2D array.
     * 
     * @throws NullPointerException if maze is null or any 
     *  one of the Wall references is null.
     */
    public Maze( Wall[][] maze ) {
        this.maze = maze;
    }
    
    /**
     * Checks if the coordinate can be found in the maze.
     * 
     * @param position is the coordinate to check for.
     * 
     * @return true if the position can be found in the maze OR false otherwise.
     * 
     * @throws NullPointerException when position is null
     */
    public boolean contains( Coordinate position ) { 
        if( position == null ) {
            throw new NullPointerException("contains was called with a null value!");
        } 
        
        if( position.getRow() < 0 || position.getColumn() < 0 ) {
           return false;
        } 
        
        return position.getRow() < this.maze.length && position.getColumn() < this.maze[0].length;       
    }
    
    /**
     * Accesses the set of possible directions the player can move from this 
     * position on the map.
     * 
     * @param position is the place on the maze to check.
     * 
     * @return the set of all possible moves.
     * 
     * @throws ArrayIndexOutOfBoundsException when position is not inside the maze.
     */
    public Wall getWall( Coordinate position ) {
        if( !contains( position ) ) {
            throw new ArrayIndexOutOfBoundsException("getWall was called with a position outside the maze!");
        }
      
        return maze[position.getRow()][position.getColumn()];
    }
}
