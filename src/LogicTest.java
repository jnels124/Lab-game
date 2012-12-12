

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests Logic.
 *
 * @author  Josh Gillham
 * @version 11-9-12
 */
public class LogicTest {
    /** Provides a testing tool to receive game events. */
    class TestInstrumentGUI implements GameEvent {
        /** Holds the number of times playerMoved was called. */
        int playerMovedCalled = 0;
        /** Tells the UI that the player won the game.*/
        public void playerWins( ) {
            
        }
        
        /**
         * Tells the UI that the player has moved. Maybe it 
         *  should update the tiles.
         */
        public void playerMoved( ) {
            ++playerMovedCalled;
        }
    }
    /**
     * Proves the constructor can produce an object without errors.
     */
    @Test
    public void testConstructor() {
        try {
            new TestInstrumentLogic();
        }
        catch ( Exception e ) {
            fail( "Should not throw an exception." );
        }
    }
    
    /**
     * Proves that makeMove() moves the coordinates correctly.
     */
    @Test
    public void testMakeMove() {
        try {
            Logic game = new TestInstrumentLogic();
            // For each direction, move the player
            for ( Direction dir : Direction.CARDINAL ) {
                game.makeMove( dir );
            }
            Coordinate pos = game.getCharacter().getCoordinate();
            // The end position should be the same as the start.
            assertEquals( 1, pos.getRow() );
            assertEquals( 1, pos.getColumn() );
        }
        catch ( Exception e ) {
            fail( "Should not throw exception." );
        }
    }
    
    /**
     * Prove that getMaze() returns what the constructor sets.
     */
    @Test
    public void testGetMaze() {
        TestInstrumentLogic game = new TestInstrumentLogic();
        assertEquals( game.maze, game.getMaze() );
    }
    
    /**
     * Prove that getCharacter() returns what the constructor sets.
     */
    @Test
    public void testGetCharacter() {
        TestInstrumentLogic game = new TestInstrumentLogic();
        assertEquals( game.chr, game.getCharacter() );
    }
    
    /**
     * Prove that setGameEventsListener() can be set or unset
     *  without throwing exceptions.
     */
    @Test
    public void testSetGameEventsListener() {
        TestInstrumentLogic game = new TestInstrumentLogic();
        TestInstrumentGUI handler = new TestInstrumentGUI();
        try {
            // Set and unset the event handler.
            game.setGameEventsListener(null);
            game.setGameEventsListener(handler);
            game.setGameEventsListener(null);
        }
        catch ( Exception e ) {
            fail( "Should not throw an exception." );
        }
    }
    
    /**
     * Prove that playerMoved is called when the player moves.
     */
    @Test
    public void testEventPlayerMoved() {
        try {
            Logic game = new TestInstrumentLogic();
            TestInstrumentGUI handler = new TestInstrumentGUI();
            // Hook the event handler.
            game.setGameEventsListener(handler);
            int i = 0;
            // For each direction, move the player.
            for ( Direction dir : Direction.CARDINAL ) {
                // Move the player
                game.makeMove( dir );
                // Player moved should be called every time.
                assertEquals( ++i, handler.playerMovedCalled );
            }
        }
        catch ( Exception e ) {
            fail( "Should not throw exception." );
        }
    }
}
