import java.util.Set;
/**
 * Stores information on which directions are blocked.
 * 
 * @author Josh Gillham
 * @version 10-29-12
 */
public class Wall {
    /**
     * Initializes the class.
     * 
     * @param directions is a list of compass directions not 
     *  blocked with the wall.
     * 
     * @throw NullPointerException when directions is null.
     */
    public Wall( Set< Direction > directions ) {
        throw new UnsupportedOperationException();
    }
    
    /**
     * Accesses the list of directions not blocked by the wall.
     * 
     * @return the list of unblocked directions.
     */
    public Set< Direction > getDirections() {
        throw new UnsupportedOperationException();
    }
    
    /**
     * Moves the position according to the direction and by 1 unit.
     * 
     * @param direction the direction to move the position in.
     * 
     * @throw NullPointerException when direction is null.
     */
    public void translate( Direction direction ) {
        throw new UnsupportedOperationException();
    }

}
