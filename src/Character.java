
/**
 * Holds information about the players character such as position.
 * 
 * @author Josh Gillham
 * @version 10-29-12
 */
public class Character {
    private Coordinate position;
    /**
     * Initializes the class.
     * 
     * @param position the starting position of the character.
     * 
     * @throws NullPointerException when position is null.
     */
    public Character( Coordinate position ) {
        this.position = position;
    }
    
    /**
     * Accesses the position.
     * 
     * @return the position.
     */
    public Coordinate getCoordinate( ) {
        return position;
    }
}

