
/**
 * Holds the column and row corresponding to the position in the maze.
 * 
 * @author Josh Gillham, Jessie
 * @version 10-29-12
 */
public class Coordinate implements Cloneable {
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
        this.setColumn( column );
        this.setRow( row );
    }
    
    /**
     * Accesses the column.
     * 
     * @return the column.
     */
    public int getColumn() {
        return this.column;
    }
    
    /**
     * Accesses the row.
     * 
     * @return the row.
     */
    public int getRow() {
        return this.row;        
    }
    
    /**
     * Sets the column.
     * 
     * Post Conditions:
     * -this.column is set to col.
     * 
     * @param col is the new column.
     * 
     * @throws IllegalArgumentException when column is less than 0.
     */
    public void setColumn( int col ) {
        if( this.column < 0 ) { 
            throw new IllegalArgumentException("Column needs to be greater than 0!");
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
     * 
     * @throws IllegalArgumentException when row is less than 0.
     */
    public void setRow( int row ) {
        if( this.row < 0 ) { 
            throw new IllegalArgumentException("Row needs to be greater than 0!");
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
            default:
                throw new UnsupportedOperationException();
        }
        
    }
    
    /**
     * Copies the data inside to a new instance.
     * 
     * @return the new instance.
     */
    public Coordinate clone() throws CloneNotSupportedException  {
        return (Coordinate)super.clone();
    }
}
