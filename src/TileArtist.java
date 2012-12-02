import javax.swing.JLabel;
import java.awt.Graphics;
import java.net.URL;
import java.awt.image.BufferedImage;
import java.util.Set;

/**
 * Handles drawing resources.
 * 
 * @author Angel Preciado, Josh Gillham
 * @version 10-29-12.2
 */
public class TileArtist extends JLabel {
    private URL url;
    private BufferedImage img;
    private Logic localGame;
    private Direction direction;
    private Set<Direction> walls;
    
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
        if( game == null )
            throw new NullPointerException( "TileArtist initialized with null game." );
        this.setMinimumSize( new java.awt.Dimension( 32, 32 ) );
        this.localGame = game;
        direction = dir;
    }
        
    /**
     * Ask for walls corresponding to the passed in coordinates
     * @param int y the row value of the coordinate
     * @param int x the column value of the coordinate
     * @return set walls these contain the Direction types that tell us where the walls should be
     */
    public Set<Direction> getSetOfWalls(int x, int y){
        Coordinate newCoords = new Coordinate(x,y);
         this.localGame.getMaze().getWall(newCoords);
         return null;
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
        super.paintComponent( g );
        g.drawLine( 0, 0, getWidth(), 0 );
        g.drawLine( 0, getHeight() - 1, getWidth(), getHeight() - 1 );
        g.drawLine( 0, 0, 0, getHeight() );
        g.drawLine( getWidth() - 1, 0, getWidth() - 1, getHeight() );
        //make sure Logic game is not null!
        if(this.localGame==null){
            throw new NullPointerException();
        }
        try {
            // Get the position which corresponds to this tile.
            Coordinate relPosition = this.localGame.getCharacter().getCoordinate().clone();
            // nulls mean center so we don't need to change the position.
            if( this.direction != null ) {
                relPosition.translate( this.direction );
            } else {
                java.awt.image.BufferedImage img = javax.imageio.ImageIO.read( new java.io.File( "chr.png" ) );
                g.drawImage( img, getWidth() / 2 - img.getWidth() / 2, getHeight() / 2 - img.getHeight() / 2, null );
            }
            Maze maze = this.localGame.getMaze();
            
            // Only paint tiles which are on the map.
            if ( !maze.contains( relPosition ) ) {
                // Paint empty squares.
                return;
            }
            // Get the list of walls for the position which corresponds to the tile.
            Set< Direction > walls = maze.getWall( relPosition ).getDirections();
            // Draw each wall.
            for( Direction wall : walls ) {
                switch( wall ) {
                    case North:
                        g.drawLine( 5, 5, getWidth() - 5, 5 );
                        break;
                    case East:
                        g.drawLine( getWidth() - 5, 5, getWidth() - 5, getHeight() - 5 );
                        break;
                    case South:
                        g.drawLine( 5, getHeight() - 5, getWidth() - 5, getHeight() - 5 );
                        break;
                    case West:
                        g.drawLine( 5, 5, 5, getHeight() - 5 );
                        break;
                }
            }
        } catch ( Exception e ) {
            e.printStackTrace();
        }
    }
}
