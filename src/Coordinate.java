
/**
 * Holds the column and row corresponding to the position in the maze.
 * 
 * @author Josh Gillham
 * @version 10-29-12
 */
/*ToDO: Verify when Exception should be thrown for accessors
 *      Set values for Enum directions so translate can be implemented correct
   */
public class Coordinate {
    /**
     * Holds the column for the Coordinate Object
     */
    private int column;
    
    /**
     * Holds the column for the Coordinate Object
     */
    private int row;
    
    /**
     * Initializes the class.
     * 
     * @param column is the x position in the maze.
     * @param row is the y position in the map.
     * 
     * @throws IllegalArgumentException when column or row is less than 0.
     */
    public Coordinate( int column, int row ) {
        if ( column < 0 || row < 0 ) {
            throw new UnsupportedOperationException();
        } 
        else {
            this.column = column;
            this.row = row;   
        }
    }
    
    /**
     * Accesses the column.
     * 
     * @return the column.
     */
    public int getColumn() {
        if( this.column < 0 ) { // TODO: verify when exception should actually be thrown 
            throw new UnsupportedOperationException();
        }
        return this.column;
    }
    
    /**
     * Accesses the row.
     * 
     * @return the row.
     */
    public int getRow() {
        if( this.row < 0 ) { // TODO: verify when exception should actually be thrown 
            throw new UnsupportedOperationException();
        } 
        return this.row;        
    }
    
    /**
     * Sets the column.
     * 
     * Post Conditions:
     * -this.column is set to col.
     * 
     * @param col is the new column.
     */
    public void setColumn( int col ) {
        if( this.column < 0 ) { 
            throw new UnsupportedOperationException("Column needs to be greater than 0!");
        } 
        else {
            this.column = col;
        } 
    }
    
    /**
     * Sets the row.
     * 
     * Post Conditions:
     * -this.row is set to row.
     * 
     * @param row is the new row.
     */
    public void setRow( int row ) {
        if( this.row < 0 ) { 
            throw new UnsupportedOperationException("Row needs to be greater than 0!");
        } 
        else {
            this.row = row;
        }
    }
    
    /**
     * Moves the position according to the direction and by 1 unit.
     * 
     * @param direction the direction to move the position in.
     * 
     * @throw NullPointerException when direction is null.
     */
    public void translate( Direction direction ) {
        // throw new UnsupportedOperationException();
        switch( direction ) {
            case North : 
                this.row--;
                break;
            case NorthEast : 
                this.row--;
                this.column++;
                break;
            case NorthWest :
                this.row--;
                this.column--;
                break;
            case East :
                this.column++;
                break;
            case South :
                this.row++;
                break;
            case SouthEast :
                this.row++;
                this.column++;
                break;
            case SouthWest : 
                this.row++;
                this.column--;
                break;
            case West : 
                this.column--;
                break;
            //default :
        }
        
    }
}
