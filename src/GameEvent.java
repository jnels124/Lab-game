
/**
 * Sends messages from the Logic to the UI.
 * 
 * @author Josh Gillham
 * @version 10-29-12
 */
public interface GameEvent {
    /** Tells the UI that the player won the game.*/
    public void playerWins( );
    /** Tells the UI that the player has moved. Maybe it should update the tiles. */
    public void playerMoved( );
}
