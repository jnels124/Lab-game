import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

/**
 * Handles the general interaction with the user.
 * 
 * @author Josh Gillham
 * @version 10-29-12
 */
public abstract class UI implements KeyListener, GameEvent {
    /** Unused event. */
    public void keyPressed( KeyEvent e ) {}
    
    /**
     * Called when the user releases a key.
     */
    public void keyReleased( KeyEvent e ) {
        throw new UnsupportedOperationException();
    }
    
    /** Unused event. */
    public void keyTyped( KeyEvent e ) {}
}

