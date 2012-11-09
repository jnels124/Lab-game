

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.awt.event.KeyEvent;
import java.awt.Container;
import java.awt.Component;

/**
 * The test for GUI
 *
 * @author  Josh Gillham
 * @version 11-9-12
 */
public class GUITest {
    /**
     * Counts the number of TileArtists in the JFrame by recursively
     *  moving through each component and comparing.
     *  
     * @param root is the root of the Container tree.
     * 
     * @return the count of TileArtists
     */
    public int countTileArtists( Container root ) {
        int counter = 0;
        // Get the sub components.
        Component[] comps = root.getComponents();
        for ( Component comp : comps ) {
            // Count only instances of TileArtist.
            if ( comp instanceof TileArtist ) {
                ++counter;
            }
            // Traverse sub lists.
            if ( comp instanceof Container ) {
                counter += countTileArtists( (Container)comp );
            }
        }
        return counter;
    }
    
    /**
     * Provides a testing instrument for GUI.
     */
    class MockGUI extends GUI {
        /** Holds the number of repaint() calls. */
        int totalRepaintCalls = 0;
        
        /**
         * Calls the parent constructor.
         * 
         * @param game the instance of Logic.
         */
        public MockGUI( Logic game ) {
            super( game );
        }
        
        /**
         * Counts the number of calls.
         */
        public void repaint() {
            ++totalRepaintCalls;
        }
    }
    /**
     * Proves we can build the object successfully.
     */
    @Test
    public void testConstructor() {
        try {
            new GUI( new TestInstrumentLogic() );
        }
        catch ( Exception e ) {
            fail( "Should not through an error." );
        }
    }
    
    /**
     * Prove that GUI creates the correct TileArtists.
     */
    @Test
    public void testConstructor_CreatesTileArtists() {
        GUI instance = new GUI( new TestInstrumentLogic() );
        Component[] comps = instance.getContentPane().getComponents();
        int counter = countTileArtists( instance.getContentPane() );
        // There should be 9 tileArtists
        assertEquals( 9, counter );
    }
    
    /**
     * Proves that playerMoved() calls repaint().
     */
    @Test
    public void testPlayerMoved() {
        MockGUI mck = new MockGUI( new TestInstrumentLogic() );
        mck.playerMoved();
        // Repaint() should be called everytime the player moves.
        assertEquals( 1, mck.totalRepaintCalls );
    }
    
    /**
     * Proves that keyReleased() calls Logic.makeMove() and passes 
     *  it the correct direction.
     */
    @Test
    public void testKeyPressed() {
        TestInstrumentLogic game = new TestInstrumentLogic();
        MockGUI mck = new MockGUI( game );
        // Key codes to test.
        int[] keyCodes = {
            KeyEvent.VK_UP,
            KeyEvent.VK_DOWN,
            KeyEvent.VK_LEFT,
            KeyEvent.VK_RIGHT
        };
        // Each direction corresponds to the key codes by the
        //  position in the array.
        Direction[] associatedDir = {
            Direction.North,
            Direction.South,
            Direction.West,
            Direction.East
        };
        // The arrays should be the same size.
        assertEquals( keyCodes.length, associatedDir.length );
        // Test each arrow key.
        for ( int i = 0; i <  keyCodes.length; ++i ) {
            // Create the key event from the propper key code.
            @SuppressWarnings( "deprecation" )
            KeyEvent key = new KeyEvent( null, 0, 0, 0, keyCodes[ i ] );
            mck.keyReleased( key );
            // makeMove() should be called for each key press.
            assertEquals( i, game.makeMoveCalls );
            // makeMove() should have been called with the
            //  corresponding direction.
            assertEquals( associatedDir[ i ], game.lastDirection );
        }
    }
}
