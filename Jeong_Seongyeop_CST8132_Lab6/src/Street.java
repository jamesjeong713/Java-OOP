import java.util.Random;
/**
 * This class is main.
 * @author Seongyeop Jeong (James) for dev
 *
 */

public class Street {

		private static Random randomNumbers = new Random();
		private Vehicle[] vehicles = new Vehicle[4];
		
		/**
		 * constructor
		 * 		declare four vehicles including 
		 * 		the information which is speed and wheelNumbers.
		 */
		public Street()
		{			
			vehicles = new Vehicle[4];
			vehicles[0] = new Car(0, 4);
			vehicles[1] = new Bicycle(0, 2);
			vehicles[2] = new Car(0, 4);
			vehicles[3] = new Bicycle(0, 2);
		}
		
		/**
		 * whenever it calls to pedal, 
		 * the speed variable in pedal method increases to 10 or 4.
		 * 1 set has eight line's outputs. it show the result car0~bicycle3(4) at first time.
		 * and in the second time, it show the result car0~bicycle3(4) again.
		 * this output repeat 6 times.
		 * I wanted to use array numbers, I could not find the information. 
		 * Thus, I just added number of vehicle with number of for loop.
		 */
		public void simulate()
		{
			
			for (int i = 0 ; i < 6 ; i++) 
			{
				// random number is used for choosing vehicle number
				int random = randomNumbers.nextInt(vehicles.length);

				// Update start:
			    System.out.println("Update on the street:");
			    
			    // Part of the speed
			    // the reason that I separate each other is to give the number of 8 lines output
			    // car0, bicycle1, car2, bicycle3 - 2 set.
				for (int num = 0 ; num < vehicles.length ; num++)
				{
					System.out.println(vehicles[num].getClass().getName() + num + ", " +
				"speed: " + vehicles[num].speed);
				}
				
				// Part of the noise
				for (int num = 0 ; num < vehicles.length ; num++) 
				{
					System.out.println(vehicles[num].getClass().getName() + num + ", " +
				"noise: " + vehicles[num].noise());
				}
				// it has to be placed at here
				// otherwise, the result will be showed with value.
				vehicles[random].pedal();
				// the function of Pedal
				System.out.println("Pedal of " + vehicles[random].getClass().getName() + random
						+ " was pushed\n");
			} // end of the for loop
		} // end of the method 

		public static void main (String[] args) 
		{
			Street thestreet = new Street();
			thestreet.simulate();
		} // end of the main
}
