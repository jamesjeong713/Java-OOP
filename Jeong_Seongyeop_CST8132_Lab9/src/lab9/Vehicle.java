package lab9;


public abstract class Vehicle {

	protected final String VEHICLE_NAME;
	public int speed;
	protected int wheels;
	private static int index = 0;
	
	public Vehicle(String n, int w) {
		speed = 0;
		wheels = w;
		this.VEHICLE_NAME = n + index++;
	}
	
	public abstract void pushPedal();
	
	public abstract String makeNoise();

}
