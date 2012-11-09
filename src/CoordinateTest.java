import org.junit.Test;
import java.util.*;

import junit.framework.TestCase;

/**
 * Tests Coordinate.
 * 
 * @author Alfonso
 * @version 11-5-12
 */
public class CoordinateTest extends TestCase {
    /**
     * Proves that a Coordinate object can be made without errors.
     */
    @Test
    public void testCoordinate() {
        try {
          new Coordinate(2,0);
        }
        catch ( Exception e ) {
          fail( "Should not throw an exception." );
        }
    }
    
    /**
     * Prove the object can be cloned.
     */
    @Test
    public void testClone() {
        Coordinate instance = new Coordinate( 2, 3 );
        try{
            Coordinate cpy = instance.clone();
                // Make sure they are pointing to seperate memory.
            assertFalse( instance == cpy );
                // Make sure the data is the same.
            assertEquals( instance.getRow(), cpy.getRow() );
            assertEquals( instance.getColumn(), cpy.getColumn() );
        }
        catch( CloneNotSupportedException e ) {
            fail( "Cloning should be supported." );
        }
    }
}
