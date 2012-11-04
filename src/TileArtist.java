import javax.swing.JLabel;
import java.awt.Graphics;

/**
 * Handles drawing resources.
 * 
 * @author Josh Gillham
 * @version 10-29-12
 */
public class TileArtist extends JLabel {
    /**
     * Initializes the artist class.
     * 
     * @param game used to get the information about the walls.
     * @param dir is the direction in respect to the character or 
     *  null for center.
     * 
     * @throws NullPointerException when game is null.
     */
    public TileArtist( Logic game, Direction dir ) {
        throw new UnsupportedOperationException();
    }
    
    /**
     * Draws the correct tile in respect to the character.
     * 
     * Outline:
     * .Creates a copy of the character's coordinate.
     * .Calls the translate method in that copy.
     * .Retrieves the map's wall for that coordinate.
     * .Paints according to the wall's blocked directions.
     * 
     * Post Conditions:
     * -The correct drawing appears.
     * 
     * Testing suggestions:
     * -Pass mock a graphics class and over ride the lineTo method. 
     *  Ensure that lineTo is called with the correct parameters.
     * 
     * @param g is the graphics canvas.
     * 
     * @throws NullPointerException if g is null.
     */
    @Override
    public void paintComponent( Graphics g ) {
        throw new UnsupportedOperationException();
    }
}
