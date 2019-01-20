package guitar;

import edu.ac.guitarlib.AcousticImagine;
import edu.ac.guitarlib.LeftHand;

public class ImagineTest {
	public static void main(String arg[]) {
		Guitar guitar = new Guitar();
		AcousticImagine acousticImagine = new AcousticImagine(new LeftHand(guitar),
				new RightHand(guitar));
		acousticImagine.play();
	}
}
