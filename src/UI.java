import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

/**
 * Handles the general interaction with the user.
 * 
 * @author Josh Gillham
 * @version 10-29-12
 */
public abstract class UI implements KeyListener, GameEvent {
    /**
     * Initializes the class.
     * 
     * @param artist does the drawing
     */
    public UI( Logic game ) {
        throw new UnsupportedOperationException();
    }
    
    /** Unused event. */
    public void keyPressed( KeyEvent e ) {}
    
    /**
     * Called when the user releases a key.
     * 
     * @param e contains information about the event.
     */
    public void keyReleased( KeyEvent e ) {
        throw new UnsupportedOperationException();
    }
    
    /** Unused event. */
    public void keyTyped( KeyEvent e ) {}
}

