package guitar;

public class RightHand implements edu.ac.guitarlib.GuitarPlayerRightHand {

	private Guitar guitar;
	
	public RightHand(Guitar g) {
		guitar = g;
	}
	
	public void pause(int milliseconds) {
		try {
			Thread.sleep(milliseconds);
		} catch (Exception e) {
			// do nothing
		}		
	}
	
	public void pluck(int... strings) {
		for(int s : strings) {
			guitar.pluck(s);
		}
	}
	
	public void strum() {
		strum(6);
	}
	
	public void strum(int stringNum) {
		for (int i = stringNum; i > 0; i--) {
			guitar.pluck(i);
			pause(80);
		}		
	}

}
