import java.awt.*;
import java.util.*;

/**
 * Created by bubblebitoey on 10/5/59.
 */

public class Block extends Piece {

	/**
	 * Constructor: a new Block at position (x, y) on Map m
	 * with color white
	 */
	public Block(int x, int y, Map m) {
		super(Piece.BLOCK, m);
		// Complete this
		super.setColor(Color.WHITE);
	}

	@Override
	public void act() {
		return;
	}
}
