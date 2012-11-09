

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
            Set< Direction > directions = new TreeSet< Direction >();
            directions.add( Direction.North );
            new Wall( directions );
            directions.add( Direction.West );
            new Wall( directions );
            directions.add( Direction.South );
            new Wall( directions );
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
        Wall wall = new Wall( directions );
        assertEquals( directions, wall.getDirections() );
        directions.add( Direction.West );
        wall = new Wall( directions );
        assertEquals( directions, wall.getDirections() );
        directions.add( Direction.South );
        wall = new Wall( directions );
        assertEquals( directions, wall.getDirections() );
    }
}
