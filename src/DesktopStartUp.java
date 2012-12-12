
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
            { Wall.CORNERNW, Wall.HALLEW, Wall.CORNERNE  },
            { Wall.HALLNS, Wall.DEADENDN, Wall.HALLNS  },
            { Wall.HALLNS, Wall.CORNERSW, Wall.CORNERSE },
            { Wall.CORNERSW, Wall.SIDEN, Wall.DEADENDE },
            { Wall.DEADENDW, Wall.EMPTY, Wall.DEADENDE },
            { Wall.DEADENDW, Wall.SIDEE, Wall.BLOCK },
            { Wall.CORNERNW, Wall.EMPTY, Wall.DEADENDE },
            { Wall.DEADENDS, Wall.SIDEW, Wall.SIDES }
        };
        Logic game = new Logic( new Character( new Coordinate( 1, 1 ) ), new Maze( lab ) );
        GUI ui = new GUI( game );
        game.setGameEventsListener( ui );
    }
    
    
}
