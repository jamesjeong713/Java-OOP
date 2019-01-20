package guitar;

import edu.ac.guitarlib.Board;

public class GuitarFrame {

	private static GuitarFrame guitarFrame;
	private Board board;
	
	private GuitarFrame() {
		board = new Board();
	}
	
	public static GuitarFrame getInstance() {
		if (guitarFrame == null)
			guitarFrame = new GuitarFrame();
		return guitarFrame;
	}

	public Board getBoard() {
		return board;
	}
	
}
