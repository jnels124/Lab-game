

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.Set;
import java.util.TreeSet;

/**
 * This tests Wall.
 *
 * @author  Josh Gillham
 * @version 11-8-12
 */
public class WallTest {
    /**
     * Proves the constructor can create a Wall object without an error.
     */
    @Test
    public void testConstructor() {
        try {
            //Set< Direction > directions = new TreeSet< Direction >();
            //Wall.WALLN;
            //Wall.WALLW;
            //Wall.WALLS;
        } catch( Exception e ) {
            fail( "Should not throw an exception" );
        }
    }
    
    /**
     * Proves getDirections returns the same object as passed in the constructor.
     */
    @Test
    public void testGetDirections() {
        Set< Direction > directions = new TreeSet< Direction >();
        directions.add( Direction.North );
        Wall wall = Wall.SIDEN;
        assertEquals( directions, wall.getDirections() );
        directions.add( Direction.West );
        wall = Wall.CORNERNW;
        assertEquals( directions, wall.getDirections() );
        directions.add( Direction.South );
        wall = Wall.DEADENDW;
        assertEquals( directions, wall.getDirections() );
    }
}
