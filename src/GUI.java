
/**
 * Displays a JFrame with the 9-tile maze view.
 * 
 * @author Josh Gillham 
 * @version 10-29-12
 */
public class GUI extends UI {
    /**
     * Initializes the GUI class. Gets the JFrame displayed with 
     *  the correct appearance.
     * 
     * @param game the reference to the game class.
     * 
     * @throws NullPointerException when game is null.
     */
    public GUI( Logic game ) {
        super( game );
        throw new UnsupportedOperationException();
    }
    
    /**
     * Tells the UI that the player won the game.
     * 
     * Post Conditions:
     * -the GUI shows the player they win.
     */
    public void playerWins( ) {
        throw new UnsupportedOperationException();
    }
    /**
     * Tells the UI that the player has moved. The GUI repaints the tiles.
     * 
     * Post Conditions:
     * -each tile's repaint() method is called.
     */
    public void playerMoved( ) {
        throw new UnsupportedOperationException();
    }
}
