import java.util.EnumSet;
/**
 * Each direction corresponds to compass vector.
 * 
 * @author Josh Gillham
 * @version 10-29-12
 */
public enum Direction {
    /** Up. */
    North, 
    /** Up Right. */
    NorthEast,
    /** Right. */
    East,
    /** Down Right. */
    SouthEast,
    /** Down. */
    South, 
    /** Down Left. */
    SouthWest,
    /** Left. */
    West,
    /** Up Left. */
    NorthWest
    ;
    /** Holds the four cardinal directions. */
    static public final EnumSet< Direction > CARDINAL = EnumSet.of( 
        North, East, South, West
    );
}
