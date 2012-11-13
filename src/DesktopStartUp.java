
/**
 * Launches the game.
 * 
 * @author Josh Gillham
 * @version 10-29-12
 */
public class DesktopStartUp {
    
    /**
     * Initializes the game and launches the UI.
     * 
     * @param args not used.
     */
    static public void main( String[] args ) {
        Logic game = new TestInstrumentLogic();
        GUI ui = new GUI( game );
        
    }
    
    
}
