TITLE:
Corn Maze

DESCRIPTION:
The player will find the exit to a corn maze. The player will use the arrow keys to navigate the twists and turns in the maze. The GUI will show 9-tiles with the player at the center tile. The outer 8 tiles represent the surroundings of the player. As the player navigates through the maze, the GUI will show the tiles changing. The player wins when they exit the maze.

FEATURES:
-Exit the maze.
-Use the arrow keys to navigate.
-9-tile GUI display.

STRUCTURE:
Logic
-Orchestrates the game logic.

Maze
-Gets a list of possible moves.
-Information is stored as a 2D array.
-Gest the squares surrounding a certain position.


Character
-Contains the current position in the maze.

Artist
-Draws/updates the player on the GUI.
-Draws/updates the map tiles on the GUI.

UI
-Receives key presses and submits them to the Logic.
-Shows the player.
-Shows the player's surroundings.
-Shows game stats i. e. scores and time limits.

Messenger:
-allows the logic to update the UI.


