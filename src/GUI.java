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
    
    public GUI( Logic game ) {
        super("Maze Game");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buildPanel();
        mainPanel.add(gamePanel, BorderLayout.CENTER);
        add(mainPanel);
        setLocationRelativeTo(null);
        setVisible(true);
        //throw new UnsupportedOperationException();
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
        N     = new JLabel("North tile");
        NW    = new JLabel("North West tile");
        NE    = new JLabel("North East tile");
        E     = new JLabel("East tile");
        W     = new JLabel("West tile");
        C     = new JLabel("Center tile");
        S     = new JLabel("South tile");
        SW    = new JLabel("South West tile");
        SE    = new JLabel("South East tile");
        
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
        throw new UnsupportedOperationException();
    }

    /** Unused event. */
    public void keyTyped( KeyEvent e ) { }
}
