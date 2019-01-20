package lab9;
import java.util.Comparator;

/**
 * this class is to implement comparator
 * when we call Collections.sort in Street class, it passes an instance of the street class 
 * @author Seongyeop Jeong (James) for dev
 *
 */
public class VehicleComparator implements Comparator<Vehicle> {

	/**
	 * to compare two object instances by calling comparator in Street class
	 * this compare method is declared in Comparator.class. 
	 * therefore you can just override it.
	 * 
	 * @param v1
	 * 		to compare with v2
	 * @param v2
	 * 		to compare with v1
	 * @return
	 * 		return default value to compare two variables
	 */
	@Override
	public int compare(Vehicle v1, Vehicle v2) 
	{
		// the reason that I chose the ret variables instead of return is that  
		// it is going to cause problems if the program use many returns.
		int ret = 1;
		
		/**
		 * if v1.speed is bigger than v2.speed, return -1
		 * it means that if v1.speed has bigger than v2.speed, 
		 * the object of v1.speed will be first in the ordering.
		 */
		if (v1.speed > v2.speed)
			ret = -1;
		/**
		 * when the v1.speed is less than v2.speed, return 1 
		 * v1.speed will be second than v2.speed in the ordering.
		 */
		else if (v1.speed < v2.speed)
			ret = 1;

		/**
		 * type comparison operator compare the instance with type
		 * when the v1.speed == v2.speed,
		 */
		else if (v2 instanceof Bicycle)
			// there should be only one if (instanceof compare) because it has to be first
			// if Bicycle is v2, return 1. it means v2 will be first (= v1 will be second)
			ret = 1;
		else if (v2 instanceof Car)
		{ 
			// it should be compared car and tricycle 
			if (v1 instanceof Tricycle)
				// if Car is v2, return -1 if v1 is Tricycle. it means Car will be second.
				ret = -1;
			else 
				// otherwise, it will be first
				ret = 1;
		}
		else 
			ret = -1;
		
// DONE for the efficiency
//		else if (
//				((v2 instanceof Car) &&(!(v1 instanceof Tricycle)))
//				||(!(v2 instanceof Bicycle)) 
//				)
//			ret = -1;
		
		return ret;
	} // end comparator
}
