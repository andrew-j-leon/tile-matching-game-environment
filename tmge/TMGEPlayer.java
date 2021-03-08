package tmge;

/**
 * Holds the player's name, score, number of tile matches,
 * and player number (PLAYER_1 or PLAYER_2).
 * @author Andrew Leon
 *
 */
public abstract class TMGEPlayer {
	/**
	 * Determines whether a player is player1 or player2.
	 * Used to determine the player's controls. 
	 * @author Andrew Leon
	 *
	 */
	public enum PlayerNumber {
		PLAYER_1, PLAYER_2
	}
	
	/**
	 * Determines if this player uses player1's controls or
	 * player2's controls.
	 */
	protected PlayerNumber playerNumber;
	/**
	 * This player's name.
	 */
	protected String name;
	/**
	 * This player's current score.
	 */
	protected int score;
	/**
	 * The number of rows this player has cleared.
	 */
	protected int numTileMatches;
	
	/**
	 * Create a new player with a score of 0, tile matches of
	 * 0, and the provided name and player number.
	 * @param name The player's name.
	 * @param playerNumber Whether this player is player1 or
	 * player2.
	 */
	public TMGEPlayer(String name, PlayerNumber playerNumber) {
		this.score = 0;
		this.numTileMatches = 0;
		this.name = name;
		this.playerNumber = playerNumber;
	}
	
	/**
	 * @return This player's player number. Used to determine
	 * this player's control scheme.
	 */
	public PlayerNumber getPlayerNumber() {
		return this.playerNumber;
	}
	
	/**
	 * Change the player's score by the amount given.
	 * @param theChange Added to the player's score.
	 */
	public void changeScore(int theChange) {
		this.score += theChange;
	}
	
	/**
	 * Change the count of how many rows this player has cleared
	 * by the given amount.
	 * @param theChange Added to the player's count of how many rows
	 * they've cleared.
	 */
	public void changeRowsCleared(int theChange) {
		this.numTileMatches += theChange;
	}
	
	/**
	 * @return This player's current score.
	 */
	public int getScore() {
		return this.score;
	}
	
	/**
	 * @return The number of rows this player has cleared.
	 */
	public int getRowsCleared() {
		return this.numTileMatches;
	}
	
	/**
	 * @return This player's name.
	 */
	public String getName() {
		return this.name;
	}
}
