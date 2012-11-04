
import org.junit.Test;

import junit.framework.TestCase;


public class CoordinateTest extends TestCase {

	@Test
	public void testCoordinate() {
		//fail("Not yet implemented");
		  try {
		      new Coordinate(2,0);
		    }
		    catch ( Exception e ) {
		      fail( "Should not throw an exception." );
		    }
	}

	@Test
	public void testEquals() {
		fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

}
