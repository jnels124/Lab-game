import java.util.Set;
import java.util.TreeSet;

/**
 * Provides a tool to creaet a logic instance for testing.
 * 
 * @author Josh Gillham
 * @version 11-9-12
 */
public class TestInstrumentLogic extends Logic {
    /** Holds the dead end. */
    static public Set< Direction > deadEnd = new TreeSet< Direction >();
    /** Holds the hall way. */
    static public Set< Direction > hall = new TreeSet< Direction >();
    /** Holds the corner. */
    static public Set< Direction > corner = new TreeSet< Direction >();
    /** Holds the side. */
    static public Set< Direction > side = new TreeSet< Direction >();
    /** Holds the test labyrinth. */
    static public Wall[][] lab = {
        { new Wall( deadEnd ), new Wall( corner ), new Wall( hall ) },
        { new Wall( deadEnd ), new Wall( side ), new Wall( hall ) },
        { new Wall( deadEnd ), new Wall( corner ), new Wall( hall ) },
    };
    /** Holds the starting coordinate. */
    static Coordinate start = new Coordinate( 1, 1 );
    /** Holds the test character. */
    static Character chr = new Character( start );
    /** Holds the test maze. */
    static Maze maze = new Maze( lab );
    static int makeMoveCalls = 0;
    Direction lastDirection = null;
    
    /**
     * Static constructor.
     */
    {
        // Compose a dead end with 3 walls.
        deadEnd.add( Direction.North );
        deadEnd.add( Direction.East );
        deadEnd.add( Direction.West );
        
        // Compose a hall way with 2 paralell walls.
        hall.add( Direction.East );
        hall.add( Direction.West );
        
        // Compose a corner with 2 adjacent walls.
        corner.add( Direction.North );
        corner.add( Direction.East );
        
        // Compose a side with only 1 wall.
        side.add( Direction.North );
    }
    
    /**
     * Creates the objects needed to run tests.
     */
    public TestInstrumentLogic() {
        super( chr, maze );
    }
    /**
     * Counts number calls to makeMove().
     * 
     * @param direction is the direction passed by the GUI.
     */
    public void makeMove( Direction direction ) throws BadDirectionException {
        ++this.makeMoveCalls;
        this.lastDirection = direction;
    }
}
