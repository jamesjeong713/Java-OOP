package guitar;

public class Peg {
	
	private Wire wire;
			
	public Peg(Wire w) {
		wire = w;
	}

	public void turn(int deltaTension) {
		wire.changeTension(deltaTension);
	}

}
