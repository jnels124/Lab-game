

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
    /**
     * Proves that the constructor can create the object without errors.
     */
    @Test
    public void testConstructor() {
        try {
            new Maze( TestInstrumentLogic.lab );
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
        Maze instance = new Maze( TestInstrumentLogic.lab );
        // Check each of the four corners of the map.
        assertTrue( instance.contains( new Coordinate( 0, 0 ) ) );
        assertTrue( instance.contains( 
            new Coordinate( TestInstrumentLogic.lab[0].length - 1, 0 ) )
        );
        assertTrue( instance.contains( 
            new Coordinate( TestInstrumentLogic.lab[0].length - 1, TestInstrumentLogic.lab.length - 1 ) )
        );
        assertTrue( instance.contains( 
            new Coordinate( 0, TestInstrumentLogic.lab.length - 1 ) )
        );
    }
    
    /**
     * Proves that getWall() will return the wall corresponding to the
     *  position on the map.
     */
    @Test
    public void testGetWall() {
        Maze instance = new Maze( TestInstrumentLogic.lab );
        // For each wall in the 2D array check for the same Wall
        //  at that coordinate.
        for ( int r = 0; r < TestInstrumentLogic.lab.length; ++r ) {
            for ( int c = 0; c < TestInstrumentLogic.lab[0].length; ++c ) {
                // Each Wall reference should be the same.
                assertTrue( TestInstrumentLogic.lab[r][c] == 
                    instance.getWall( new Coordinate( c, r ) ) );
            }
        }
    }
}
