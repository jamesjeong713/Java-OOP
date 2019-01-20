/**
 * this class is subclass of Vehicle.
 * 
 * @author Seongyeop Jeong (James) for dev
 *
 */
public class Car extends Vehicle {

	/**
	 * subclass Bicycle's constructor
	 * 
	 * @param speed
	 * 			speed variables get values from pedal 
	 * @param numberOfWheels
	 * 			simple information. nothing function.
	 */
	public Car(int speed, int numberOfWheels)
	{
		super(speed, numberOfWheels);
	}

	/**
	 * @return 
	 * 		if the speed is 0, String noise return sigh.
	 * 		otherwise it returns grunt.
	 */
	@Override
	public String noise() 
	{
		if (speed == 0)
		{
			return "purr";
		}
		else
		{
			return "vroom";
		}
	}

	/**
	 * whenever street class call pedal method, 
	 * speed variable increase by 10km.
	 */
	@Override
	public void pedal() 
	{
		speed = speed + 10;
	}

}
