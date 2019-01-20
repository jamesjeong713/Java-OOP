package lab9;
public class Bicycle extends Vehicle {

	public Bicycle() {
		super("Bicycle", 2);
	}

	public void pushPedal() {
		if (speed < 40)
			speed += 4; // increase 4
	}

	public String makeNoise() {
		return speed == 0 ? "sigh" : "grunt";
	}

}
