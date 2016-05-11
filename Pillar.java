import java.awt.*;

/**
 * Created by bubblebitoey on 10/5/59.
 */
public class Pillar extends Piece {

	/**
	 * Constructor: a new Pillar at position (x, y) on Map m
	 * with color red if c = 0, green if c = 1, and yellow if c = 2.
	 */
	public Pillar(int c, Map m) {
		super(Piece.PILLAR, m);
		// Complete this
		if (c == 0) super.setColor(Color.RED);
		else if (c == 1) super.setColor(Color.green);
		else if (c == 2) super.setColor(Color.yellow);
	}

	public void color(int c) {
		if (c == 0) super.setColor(Color.RED);
		else if (c == 1) super.setColor(Color.green);
		else if (c == 2) super.setColor(Color.yellow);
	}

	@Override
	public void act() {
		int randColor = (int) Math.round(Math.random() * 2);
		color(randColor);
	}
}
