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
        //store the parameters locally for use by paintComponent
        localGame = new Logic();
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
     * Takes the Set<Direction> and decides which image should be loaded, or if we arent using images, where to draw the lines to indicate walls
     * @param Set<Directions> will include information on where the walls should be placed
     */
    public void drawWalls(Set<Direction> walls){
        
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
        //make sure Logic game is not null!
        if(this.localGame==null){
            throw new NullPointerException();
        }
        // here TileArtist decides what to do with the paramaters passed in using a switch statement
        switch(this.direction){
            case NorthWest: System.out.println("NorthWest Direction has been selected");
                            //get players coordinates
                            int row = localGame.getCharacter().getCoordinate().getRow();
                            int column = localGame.getCharacter().getCoordinate().getColumn();
                            //this should now correspond to the coordinates of the NW tile, another class should check that these statements dont go out of bounds of the maze
                            row--;
                            column--;
                            //get the location of walls for this tile using the new coords
                            //paint the correct 'walls'
                            drawWalls(getSetOfWalls(column, row));
                            break;
                
            case North: System.out.println("North Direction has been selected");
                            int row2 = localGame.getCharacter().getCoordinate().getRow();
                            int column2 = localGame.getCharacter().getCoordinate().getColumn();
                            //this should now correspond to the coordinates of the N tile, another class should check that these statements dont go out of bounds of the maze
                            row2--;
                            //get the location of walls for this tile using the new coords
                            //paint the correct 'walls'
                            drawWalls(getSetOfWalls(column2, row2));
                            break;
                
            case NorthEast: System.out.println("NorthEast Direction has been selected");
                            int row3 = localGame.getCharacter().getCoordinate().getRow();
                            int column3 = localGame.getCharacter().getCoordinate().getColumn();
                            //this should now correspond to the coordinates of the NE tile, another class should check that these statements dont go out of bounds of the maze
                            row3--;
                            column3++;
                            //get the location of walls for this tile using the new coords
                            //paint the correct 'walls'
                            drawWalls(getSetOfWalls(column3, row3));
                            break;
                
            case East: System.out.println("East Direction has been selected");
                            int row4 = localGame.getCharacter().getCoordinate().getRow();
                            int column4 = localGame.getCharacter().getCoordinate().getColumn();
                            //this should now correspond to the coordinates of the E tile, another class should check that these statements dont go out of bounds of the maze
                            column4++;
                            //get the location of walls for this tile using the new coords
                            //paint the correct 'walls'
                            drawWalls(getSetOfWalls(column4, row4));
                            break;
                
            case SouthEast: System.out.println("SouthEast Direction has been selected");
                            int row5 = localGame.getCharacter().getCoordinate().getRow();
                            int column5 = localGame.getCharacter().getCoordinate().getColumn();
                            //this should now correspond to the coordinates of the SE tile, another class should check that these statements dont go out of bounds of the maze
                            row5++;
                            column5++;
                            //get the location of walls for this tile using the new coords
                            //paint the correct 'walls'
                            drawWalls(getSetOfWalls(column5, row5));
                            break;
                
            case South: System.out.println("South Direction has been selected");
                            int row6 = localGame.getCharacter().getCoordinate().getRow();
                            int column6 = localGame.getCharacter().getCoordinate().getColumn();
                            //this should now correspond to the coordinates of the S tile, another class should check that these statements dont go out of bounds of the maze
                            row6++;
                            //get the location of walls for this tile using the new coords
                            //paint the correct 'walls'
                            drawWalls(getSetOfWalls(column6, row6));
                            break;
                
            case SouthWest: System.out.println("SouthWest Direction has been selected");
                            int row7 = localGame.getCharacter().getCoordinate().getRow();
                            int column7 = localGame.getCharacter().getCoordinate().getColumn();
                            //this should now correspond to the coordinates of the SW tile, another class should check that these statements dont go out of bounds of the maze
                            row7++;
                            column7--;
                            //get the location of walls for this tile using the new coords
                            //paint the correct 'walls'
                            drawWalls(getSetOfWalls(column7, row7));
                            break; 
                
            case West: System.out.println("West Direction has been selected");
                            int row8 = localGame.getCharacter().getCoordinate().getRow();
                            int column8 = localGame.getCharacter().getCoordinate().getColumn();
                            //this should now correspond to the coordinates of the NW tile, another class should check that these statements dont go out of bounds of the maze
                            column8--;
                            //get the location of walls for this tile using the new coords
                            //paint the correct 'walls'
                            drawWalls(getSetOfWalls(column8, row8));
                            break;    
        }
    }
}
