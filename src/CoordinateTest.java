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
}
