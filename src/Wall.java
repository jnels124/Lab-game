import java.util.Set;
/**
 * Stores information on which directions are blocked.
 * 
 * @author Josh Gillham
 * @version 10-29-12
 */
public class Wall {
    Set< Direction > directions;
    /**
     * Initializes the class.
     * 
     * @param directions is a list of compass directions not 
     *  blocked with the wall.
     * 
     * @throw NullPointerException when directions is null.
     */
    public Wall( Set< Direction > directions ) {
        this.directions = directions;
    }
    
    /**
     * Accesses the list of directions not blocked by the wall.
     * 
     * @return the list of unblocked directions.
     */
    public Set< Direction > getDirections() {
        return this.directions;
    }
}
