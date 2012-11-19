
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
        Wall[][] lab = {
            { Wall.CORNERNW, Wall.SIDEN, Wall.CORNERNE  },
            { Wall.SIDEW, Wall.EMPTY, Wall.SIDEE  },
            { Wall.CORNERSW, Wall.SIDES, Wall.CORNERSW  }
        };
        Logic game = new Logic( new Character( new Coordinate( 1, 1 ) ), new Maze( lab ) );
        GUI ui = new GUI( game );
    }
    
    
}
