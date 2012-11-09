

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.Set;
import java.util.TreeSet;

/**
 * Tests Maze.
 *
 * @author  Josh Gillham
 * @version 11-8-12
 */
public class MazeTest {
    /** Holds the dead end. */
    Set< Direction > deadEnd = new TreeSet< Direction >();
    /** Holds the hall way. */
    Set< Direction > hall = new TreeSet< Direction >();
    /** Holds the corner. */
    Set< Direction > corner = new TreeSet< Direction >();
    /** Holds the side. */
    Set< Direction > side = new TreeSet< Direction >();
    /** Holds the test labyrinth. */
    Wall[][] lab = {
        { new Wall( deadEnd ), new Wall( corner ), new Wall( hall ) },
        { new Wall( deadEnd ), new Wall( side ), new Wall( hall ) },
        { new Wall( deadEnd ), new Wall( corner ), new Wall( hall ) },
    };
    
    /**
     * Creates the objects needed to run tests.
     */
    public MazeTest() {
        // Compose a dead end with 3 walls.
        deadEnd.add( Direction.North );
        deadEnd.add( Direction.East );
        deadEnd.add( Direction.West );
        
        // Compose a hall way with 2 paralell walls.
        hall.add( Direction.East );
        hall.add( Direction.West );
        
        // Compose a corner with 2 adjacent walls.
        corner.add( Direction.North );
        corner.add( Direction.East );
        
        // Compose a side with only 1 wall.
        side.add( Direction.North );
    }
    
    /**
     * Proves that the constructor can create the object without errors.
     */
    @Test
    public void testConstructor() {
        try {
            new Maze( lab );
        }
        catch ( Exception e ) {
            fail( "Should not through an Exception." );
        }
    }
    
    /**
     * Proves contains() will return true when the position is within the
     *  maze array.
     */
    @Test
    public void testContains() {
        Maze instance = new Maze( lab );
        // Check each of the four corners of the map.
        assertTrue( instance.contains( new Coordinate( 0, 0 ) ) );
        assertTrue( instance.contains( 
            new Coordinate( lab[0].length - 1, 0 ) )
        );
        assertTrue( instance.contains( 
            new Coordinate( lab[0].length - 1, lab.length - 1 ) )
        );
        assertTrue( instance.contains( 
            new Coordinate( 0, lab.length - 1 ) )
        );
    }
    
    /**
     * Proves that getWall() will return the wall corresponding to the
     *  position on the map.
     */
    @Test
    public void testGetWall() {
        Maze instance = new Maze( lab );
        // For each wall in the 2D array check for the same Wall
        //  at that coordinate.
        for ( int r = 0; r < lab.length; ++r ) {
            for ( int c = 0; c < lab[0].length; ++c ) {
                // Each Wall reference should be the same.
                assertTrue( lab[r][c] == 
                    instance.getWall( new Coordinate( c, r ) ) );
            }
        }
    }
}
