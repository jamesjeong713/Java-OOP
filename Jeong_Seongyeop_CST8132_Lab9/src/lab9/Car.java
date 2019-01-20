package lab9;

public class Car extends Vehicle {

	public Car() {
		super("Car", 4);
	}

	public void pushPedal() {
		speed += 10;
	}

	public String makeNoise() {
		return speed == 0 ? "purr" : "vroom";
	}

}
