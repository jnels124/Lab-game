

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The Character test.
 *
 * @author  Josh Gillham
 * @version 11-8-12
 */
public class CharacterTest {
    /**
     * Proves the constructor can create objects without errors.
     */
    @Test
    public void testConstructor() {
        try {
            new Character( new Coordinate( 0, 0 ) );
        }
        catch ( Exception e ) {
            fail( "Should not throw an Exception." );
        }
    }
    
    /**
     * Proves getCoordinate returns the value assigned in the constructor.
     */
    @Test
    public void testGetCoordinate() {
        Coordinate c = new Coordinate( 0, 0 );
        Character instance = new Character( c );
        assertTrue( c == instance.getCoordinate() );
    }
}
