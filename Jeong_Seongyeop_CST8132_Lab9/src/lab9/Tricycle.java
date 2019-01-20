package lab9;
/**
 * for tricycle class. 
 * @author James for dev
 *
 */

public class Tricycle extends Vehicle {
	public Tricycle() {
		super("Tricycle", 3);
	}

	public void pushPedal() {
		if (speed < 30)
		{
			speed +=3; // increase 3
		}
	}

	public String makeNoise() {
		return speed == 0 ? "sigh" : "grunt";
	}
}
