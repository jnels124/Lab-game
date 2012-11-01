<h1>
Labyrinth Maze
</h1>
<h2>
Resources
</h2>
Download Git Client: <a href="http://windows.github.com">Windows</a>, <a href="http://mac.github.com">Mac</a>
<br><br>
Git:
<a href="http://git-scm.com/book">Git Book</a>, <a href="http://gitready.com">Git Reference</a>, <a href="http://gitfu.wordpress.com">Git Advanced Tricks</a>
<br><br>

<h2>
WHO ARE WE:
</h2>
We are the Intermediate Game Programming Group at Metropolitan State University of Denver.
<h2>
CONTRIBUTING:
</h2>
Checkout our <a href="https://groups.google.com/d/forum/msudenver-int-game-group">forum</a> to see where we are going with this project.
<br>
Anyone is free to contribute. Just follow the steps below:
<br>
1. Fork the project.
<br>
2. Clone your fork.
<br>
3. Get to work.
<br>
4. On the fork click pull request.
<br><br>

Alternatively:
<br>
1. <a href="https://github.com/jgillham/Lab-game/zipball/master">Download</a> the source.
<br>
2. Get to work.
<br>
3. Submit your work to this <a href="mailto:usajoshgillham@gmail.com">address</a>.
<br>
<p>
I welcome you to become part of our google discussion group. We will discuss new features, concerns, and bugs. You can also be a decider of our next game project. Find us <a href="https://groups.google.com/d/forum/msudenver-int-game-group">here</a>.
</p><br>

<h2>
DESCRIPTION:
</h2>
<p>
The goal will be to find the exit of the maze. The player will use the arrow keys to navigate the twists and turns. The player wins when they exit the maze.
</p><br>
<p>
The GUI will show 9-tiles with the player's character at the center tile. The outer 8 tiles represent the surroundings of the player. As the player navigates through the maze, the GUI will show the tiles changing.
</p><br>

<h2>
FEATURES:
</h2>
-Exit the maze.
<br>
-Use the arrow keys to navigate.
<br>
-9-tile GUI display.
<br>
-Restart the game after winning.
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
-Places the character into the starting position at the beginning of the game.
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
-Checks if a coordinate is within the bounds of the maze.
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
-Asks the player if they want to play again and, if so, starts the new game.
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
Player Presses A Key
</h4>
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
-main creates a new character.
<br>
-main creates a new Logic class
<br>
-Logic constructor calls newMaze()
<br>
-newMaze() sets the starting position (could be random).
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
