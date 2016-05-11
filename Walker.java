import java.awt.*;

/**
 * Created by bubblebitoey on 10/5/59.
 */
public class Walker extends Piece {

	/**
	 * Constructor: a new Walker at position (x, y) on Map m
	 * with color red if c = 0, green if c = 1, and yellow if c = 2.
	 */
	public Walker(int x, int y, int c, Map m) {
		super(Piece.WALKER, m);
		setX(x);
		setY(y);
		// Complete this
		if (c == 0) super.setColor(Color.RED);
		else if (c == 1) super.setColor(Color.green);
		else if (c == 2) super.setColor(Color.yellow);
	}

	@Override
	public void act() {
		int rand = (int) Math.round(Math.random() * 3);

		if (rand == 0) {
			if (getMap().isEmpty(getX(), getY() - 1)) {
				getMap().move(getX(), getY(), getX(), getY() - 1);
			}
		} else if (rand == 1) {
			if (getMap().isEmpty(getX(), getY() + 1)) {
				getMap().move(getX(), getY(), getX(), getY() + 1);
			}
		} else if (rand == 2) {
			if (getMap().isEmpty(getX() - 1, getY())) {
				getMap().move(getX(), getY(), getX() - 1, getY());
			}
		} else if (rand == 3) {
			if (getMap().isEmpty(getX() + 1, getY())) {
				getMap().move(getX(), getY(), getX() + 1, getY());
			}
		}
	}
}

