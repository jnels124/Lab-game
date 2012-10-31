<h1>
Labyrinth Maze
</h1>

<h2>
DESCRIPTION:
</h2>
<p>
The player will find the exit to a corn maze. The player will use the arrow keys to navigate the twists and turns in the maze. The GUI will show 9-tiles with the player at the center tile. The outer 8 tiles represent the surroundings of the player. As the player navigates through the maze, the GUI will show the tiles changing. The player wins when they exit the maze.
<br>
</p>

<h2>
FEATURES:
</h2>
-Exit the maze.
<br>
-Use the arrow keys to navigate.
<br>
-9-tile GUI display.
<br>

<h2>
CLASS SUMMARY:
</h2>
<h3>
Logic
</h3>
-Accepts a move if valid and commits it into the game.
<br>
-Calls a GameEvent when the game has been won.
<br>
-Calls a GameEvent when the player has moved.
<br>

<h3>
Maze
</h3>
-Gets a list of possible moves.
<br>
-Information is stored as a 2D Wall array.
<br>
-Loads a maze from a file.
<br>

<h3>
Character
</h3>
-Contains the current position in the maze.
<br>

<h3>
TileArtist
</h3>
-Draws/updates the map tiles on the GUI.
<br>

<h3>
UI
</h3>
-Receives key presses and submits them to the Logic.
<br>
-Shows the player.
<br>
-Shows the player's surroundings.
<br>
-Shows game stats i. e. scores and time limits.
<br>
-Shows the player when they win.
<br>
-Asks the player if they want to play again.
<br>

<h3>
Messenger
</h3>
-Notifies the UI the game is won.
<br>
-Notifies the UI the player has moved.
<br>

<h3>
Wall
</h3>
-Holds information about which directions are blocked.
<br>

<h2>
GAME SCENARIOS:
</h2>
<h4>
Player presses a key
<h4>
-JFrame class calls event listener UI.keyReleased().
<br>
-keyReleased() calls Logic.makeMove().
<br>
-makeMove() checks maze.getWall().getDirections() to ensure move is valid.
<br>
-makeMove() checks maze.contains() to see if the move is inside the map.
<br>
-If not inside, the player has won the game and ui.playerWins() is called.
<br>
-If valid, Logic updates the character position with character.getCoordinate().translate().
<br>
-If valid, Logic calls UI.playerMoved() to tell it the view should be updated.
<br>
-If valid, UI calls TileArtist.repaint() for each tile.
<br>
-If valid, eventually repaint() will call paintComponent().
<br>
-If valid, paintComponent() updates the screen. 
<br>

<h3>
Game Starts Up
</h3>
-main creates/loads the maze.
<br>
-main creates a new character in the starting position (starting position could be random).
<br>
-main creates a new Logic class
<br>
-main creates a new UI.
<br>
-main sets the event listener in Logic to the UI.
<br>

<h3>
Player wins
</h3>
-logic.makeMove() calls ui.playerWins()
<br>
-GUI shows the player won.
<br>
-GUI asks the player if they want to play again.
<br>
-GUI calls logic.newMaze() to restart the game.
<br>
