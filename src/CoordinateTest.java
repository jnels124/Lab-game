import org.junit.Test;
import java.util.*;

import junit.framework.TestCase;

/**
 * Tests Coordinate.
 * 
 * @author Josh Gillham, Alfonso, Jessie
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
     * Proves the constructor will throw the proper exception.
     */
    @Test
    public void testConstructor_badArguments() {
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
    
    /**
     * Proves the constructor can set the row.
     */
    @Test
    public void testGetRow() {
         Coordinate instance = new Coordinate(2,0);
         assertEquals( 0, instance.getRow() );
    }
    
    /**
     * Proves the constructor can set the column.
     */
    @Test
    public void testGetColumn() {
         Coordinate instance = new Coordinate(2,0);
         assertEquals( 2, instance.getColumn() );
    }
    
    /**
     * Proves the row getter can return the value of the setter.
     */
    @Test
    public void testGetAndSetRow() {
        Coordinate instance = new Coordinate(2,0);
        instance.setRow( 5 );
        assertEquals( 5, instance.getRow() );
        instance.setRow( 15 );
        assertEquals( 15, instance.getRow() );
    }
    
    /**
     * Proves the row getter can return the value of the setter.
     */
    @Test
    public void testGetAndSetColumn() {
        Coordinate instance = new Coordinate(2,0);
        instance.setColumn( 5 );
        assertEquals( 5, instance.getColumn() );
        instance.setColumn( 15 );
        assertEquals( 15, instance.getColumn() );
    }
    
    /**
     * Proves the translate will move the position of the coordinate in
     *  the corresponding direction.
     */
    @Test
    public void testTranslate() {
        Coordinate instance = new Coordinate(3,3);
        instance.translate( Direction.North );
        assertEquals( 3, instance.getColumn() );
        assertEquals( 2, instance.getRow() );
        
        instance.translate( Direction.NorthEast );
        assertEquals( 4, instance.getColumn() );
        assertEquals( 1, instance.getRow() );
        
        instance.translate( Direction.East );
        assertEquals( 5, instance.getColumn() );
        assertEquals( 1, instance.getRow() );
        
        instance.translate( Direction.SouthEast );
        assertEquals( 6, instance.getColumn() );
        assertEquals( 2, instance.getRow() );
        
        instance.translate( Direction.South );
        assertEquals( 6, instance.getColumn() );
        assertEquals( 3, instance.getRow() );
        
        instance.translate( Direction.SouthWest );
        assertEquals( 5, instance.getColumn() );
        assertEquals( 4, instance.getRow() );
        
        instance.translate( Direction.West );
        assertEquals( 4, instance.getColumn() );
        assertEquals( 4, instance.getRow() );
        
        instance.translate( Direction.NorthWest );
        assertEquals( 3, instance.getColumn() );
        assertEquals( 3, instance.getRow() );
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
