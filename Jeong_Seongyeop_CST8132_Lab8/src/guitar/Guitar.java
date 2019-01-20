package guitar;

import edu.ac.guitarlib.Midi;

public class Guitar implements edu.ac.guitarlib.LeftSideOfGuitar {

	private Wire[] wire;
	private Peg[] peg;

	public Guitar() {

		wire = new Wire[6];
		peg = new Peg[6];
		
		for (int i = 0; i < peg.length; i++) {
			wire[i] = new Wire(Midi.GUITAR_TABLE[i]);
			peg[i] = new Peg(wire[i]);
		} 
		
	}
	
	public void pluck(int wireNum) {
		wire[wireNum - 1].pluck();
	}
	
	public void turn(int pegNum, int deltaTension) {
		peg[pegNum - 1].turn(deltaTension);
	}
	
	public void close() {
		// do nothing
	}
	
	public void fret(int wireNum, int fretNum) {
		wire[wireNum - 1].fret(fretNum);
	}
	
	public void hammerOn(int wireNum, int fretNum) {
		fret(wireNum, fretNum);
		pluck(wireNum);
	}
}
