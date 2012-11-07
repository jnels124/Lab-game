
import org.junit.Test;

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
        
        // Verify proper exception thrown on invalid column value
        try {
            new Coordinate(-1, 0);
            fail("Exception should have been thrown");
        }
        catch ( UnsupportedOperationException e ) {
            assertTrue(true);
        } 
        catch ( Exception e ) {
            fail("Incorrect Exception thrown ");
        }
        
        // Verify proper exception thrown on invalid row value
        try {
            new Coordinate(0, -1);
            fail("Exception should have been thrown");
        }
        catch ( UnsupportedOperationException e ) {
            assertTrue(true);
        } 
        catch ( Exception e ) {
            fail("Incorrect Exception thrown ");
        }
	}
	
	public void getColumnTest() {
	    
	    
	}
}
