/**
 * this class is subclass of Vehicle.
 * 
 * @author Seongyeop Jeong (James) for dev
 *
 */
public class Bicycle extends Vehicle {
	
	/**
	 * subclass Bicycle's constructor
	 * 
	 * @param speed
	 * 			speed variables get values from pedal
	 * @param numberOfWheels
	 * 			simple information. nothing function.
	 */
	public Bicycle(int speed, int numberOfWheels)
	{
		super(speed, numberOfWheels);
	}

	/**
	 * @return
	 * 		if the speed is equal to 0, get message "sigh". otherwise it is "grunt"
	 */
	@Override
	public String noise() 
	{
		if (speed == 0)
		{
			return "sigh";
		}
		else
		{
			return "grunt";
		}
	}

	/**
	 * maximum speed for bicycle is by 40km.
	 * if it is over, just plus 0. it means nothing change.
	 */
	@Override
	public void pedal() 
	{
		if (speed < 40)
			speed = speed + 4;
		else
			speed = speed + 0;
	}

}
