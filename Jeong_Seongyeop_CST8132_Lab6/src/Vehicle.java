/**
 * this class is abstract class
 * 
 * @author Seongyeop Jeong (James) for dev
 *
 */
public abstract class Vehicle {

	/**
	 * Except for package, this program is made to restrict access from package. 
	 * To do this, types of variable is protected. 
	 * Therefore, it can access variables (speed and numberOfWheels) from Car and Bicycle.
	 */
	protected int speed;
	protected int numberOfWheels;
	
	/**
	 * Vehicle constructor
	 * 
	 * @param speed
	 * 			superclass's speed variable. this variable gets values from subclasses.
	 * @param numberOfWheels
	 * 			to show the information of wheels. there is nothing function.
	 */
	public Vehicle(int speed, int numberOfWheels)
	{
		this.speed = speed;
		this.numberOfWheels = numberOfWheels;
	}
	
	/**
	 * This String noise abstract method is a part of the Vehicle. 
	 * Every vehicle has noise and pedal. However, they have different functions
	 * Thus, Bicycle and Car share methods.
	 * @return 
	 * 			this return variable is for abstract.
	 * 			actually, return variable will be returned in Bicycle and car class.
	 */
	public abstract String noise();
	
	/**
	 * This pedal abstract method is a part of the Vehicle. 
	 * Every vehicle has noise and pedal. However, they have different functions
	 * Thus, Bicycle and Car share methods.
	 */
	public abstract void pedal();

}
