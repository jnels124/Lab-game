import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
/**
 * Displays a JFrame with the 9-tile maze view.
 * 
 * @author Josh Gillham 
 * @version 10-29-12
 */
public class GUI extends JFrame implements KeyListener, GameEvent {
    /**
     * Initializes the GUI class. Gets the JFrame displayed with 
     *  the correct appearance.
     * 
     * @param game the reference to the game class.
     * 
     * @throws NullPointerException when game is null.
     */

    //main panel will hold everthing inside the window, the gamepanel will hold the maze part of the game
    private JPanel          mainPanel, gamePanel;
    private JLabel          title, lSide, rSide, board, C, E, W, N, NW, NE, S, SE, SW;
    private final int       WINDOW_WIDTH = 650, WINDOW_HEIGHT = 250;
    private Logic game;
    
    public GUI( Logic game ) {
        super("Maze Game");
        if( game == null )
            throw new NullPointerException( );
        this.game = game;
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buildPanel();
        mainPanel.add(gamePanel, BorderLayout.CENTER);
        add(mainPanel);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    /**
    *
    *  Builds the panels for this class
    *
    */
    private void buildPanel()
    {
       //Creates all the JLabels
        title = new JLabel("The Maze Game.");
        lSide = new JLabel("Left side bar.");
        rSide = new JLabel("Right side bar.");
        board = new JLabel("Message Board (possibly)");
        // Game viewing area.
        // Don't change the order of creation.
        N     = new TileArtist( this.game, Direction.North );
        NW    = new TileArtist( this.game, Direction.NorthWest );
        NE    = new TileArtist( this.game, Direction.NorthEast );
        E     = new TileArtist( this.game, Direction.East );
        W     = new TileArtist( this.game, Direction.West );
        C     = new TileArtist( this.game, null ); // Null for center
        S     = new TileArtist( this.game, Direction.South );
        SW    = new TileArtist( this.game, Direction.SouthWest );
        SE    = new TileArtist( this.game, Direction.SouthEast );
        
        //Creates the panels
        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        gamePanel = new JPanel();
        gamePanel.setLayout(new GridLayout(3, 3));

        //Add JLabels to gamepanel
        gamePanel.add(NW);
        gamePanel.add(N);
        gamePanel.add(NE);
        gamePanel.add(W);
        gamePanel.add(C);
        gamePanel.add(E);
        gamePanel.add(SW);
        gamePanel.add(S);
        gamePanel.add(SE);

        //Add JLabels to mainPane (Might need to change these to something else instead of labels)
        mainPanel.add(title , BorderLayout.NORTH);
        mainPanel.add(lSide , BorderLayout.WEST);
        mainPanel.add(rSide , BorderLayout.EAST);
        mainPanel.add(board , BorderLayout.SOUTH);
        
    }

    /**
     * Tells the UI that the player won the game.
     * 
     * Post Conditions:
     * -the GUI shows the player they win.
     */
    public void playerWins( ) {
        throw new UnsupportedOperationException();
    }
    /**
     * Tells the UI that the player has moved. The GUI repaints the tiles.
     * 
     * Post Conditions:
     * -each tile's repaint() method is called.
     */
    public void playerMoved( ) {
        throw new UnsupportedOperationException();
    }
    
    /** Unused event. */
    public void keyPressed( KeyEvent e ) { }

    /**
     * Called when the user releases a key.
     * 
     * @param e contains information about the event.
     */
    public void keyReleased( KeyEvent e ) {
        try {
            switch( e.getKeyCode() ) {
                case KeyEvent.VK_UP:
                    this.game.makeMove( Direction.North );
                    break;
                case KeyEvent.VK_DOWN:
                    this.game.makeMove( Direction.South );
                    break;
                case KeyEvent.VK_LEFT:
                    this.game.makeMove( Direction.East );
                    break;
                case KeyEvent.VK_RIGHT:
                    this.game.makeMove( Direction.West );
                    break;
            }
        } catch ( Logic.BadDirectionException ex ) {
            System.out.println( "Bad direction." );
            // Maybe later we can play a sound
        }
    }

    /** Unused event. */
    public void keyTyped( KeyEvent e ) { }
}
