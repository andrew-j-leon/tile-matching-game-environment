package tmge;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;

/**
 * Manages the graphical user interface of the TMGE game.
 * Displays the game on the left and the player's stats on the
 * right.
 * @author Andrew Leon
 */
public abstract class TMGEGui {
	/**
	 * The width of the game screen (in pixels).
	 */
	protected int gameScreenWidth;
	/**
	 * The height of the game screen (in pixels).
	 */
	protected int screenHeight;
	/**
	 * The width of the stats screen (in pixels).
	 */
	protected int statsScreenWidth;
	
	/**
	 * Contains the overall layout (game on left, stats on right)
	 */
	protected Pane pane;
	/**
	 * The Tetris scene
	 */
	protected Scene scene;
	/**
	 * The game's title (e.g. "TETRIS" or "Dr. Mario").
	 */
	protected String gameTitle;
	
	public TMGEGui(Scene scene, Pane pane, int gameScreenWidth, int screenHeight,
			       int statsScreenWidth, String gameTitle) {
		this.scene = scene;
		this.pane = pane;
		this.gameScreenWidth = gameScreenWidth;
		this.screenHeight = screenHeight;
		this.statsScreenWidth = statsScreenWidth;
		this.gameTitle = gameTitle;
	}
}
