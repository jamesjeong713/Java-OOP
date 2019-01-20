package guitar;

import edu.ac.guitarlib.Board;

public class Wire {
	
	private Board board;
	private int tension;		
	private int fretNum;

	
	public Wire(int note) {
		board = GuitarFrame.getInstance().getBoard();
		tension = note;
		fretNum = 0;
	}	

	public void changeTension(int deltaTension) {
		tension += deltaTension;
	}

	public void pluck() {
		board.soundNote(tension + fretNum);
	}
	
	public void fret(int fretNum) {
		if (fretNum >= 0) this.fretNum = fretNum;
	}
	
}
