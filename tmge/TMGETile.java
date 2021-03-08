package tmge;

import javafx.scene.shape.Rectangle;

/**
* A Tile is the smallest unit in a tile matching game.
* Shapes are comprised of tiles. Tiles manage
* their own position on the screen based on their position
* on the game mesh.
* @author Andrew Leon
*
*/
abstract public class TMGETile {	
	/**
	 * A javafx rectangle represents this Tile.
	 */
	protected Rectangle tile;
	/**
	 * The row this tile resides on in the game mesh.
	 */
	protected int row; 
	/**
	 * The column this tile resides on in the game mesh.
	 */
	protected int column;
	/**
	 * The length of this tile (in pixels). All tiles are squares.
	 */
	protected int tileLength;
	
	/**
	 * @param tile The javafx rectangle that represents this tile and is
	 * displayed to the screen.
	 * @param tileLength The length of a tile (in pixels). All tiles are
	 * squares.
	 * @param row The row on the game mesh this tile inhabits.
	 * @param column The column on the game mesh this tile inhabits.
	 */
	public TMGETile(Rectangle tile, int tileLength, int row, int column) {
		this.tile = tile;
		this.row = row;
		this.column = column;
		this.tileLength = tileLength;
	}
	
	
	/**
	 * @return The length (in pixels) of this tile.
	 */
	public int getLength() {
		return this.tileLength;
	}
	
	/**
	 * @return The row number of the game mesh this Tile 
	 * is currently in.
	 */
	public int getRow() {
		return row;
	}
	
	/**
	 * @return The column number of the game mesh this Tile is
	 * currently in.
	 */
	public int getColumn() {
		return column;
	}
	
	/**
	 * Changes this Tile's row position on the game mesh and
	 * its corresponding position on the screen.
	 * @param row The row number of the game mesh.
	 */
	public void setRow(int row) {
		this.row = row;
		this.tile.setY(row * this.tileLength);
	}
	
	/**
	 * Changes this Tile's column position on the game mesh and
	 * its corresponding position on the screen.
	 * @param column The column number of the game mesh.
	 */
	public void setColumn(int column) {
		this.column = column;
		this.tile.setX(column * this.tileLength);
	}
	
	/**
	 * Changes this Tile's row and column positions on the game mesh
	 * and its corresponding position on the screen.
	 * @param row The row number of the game mesh.
	 * @param column The column number of the game mesh.
	 */
	public void setCell(int row, int column) {
		setRow(row);
		setColumn(column);
	}
	
	/**
	 * @return This tile's javafx Rectangle object.
	 */
	public Rectangle getRectangle() {
		return this.tile;
	}
}
