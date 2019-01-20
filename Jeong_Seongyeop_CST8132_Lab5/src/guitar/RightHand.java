package guitar;

import edu.ac.guitarlib.GuitarPlayerRightHand;

/**
 * This class is subclass of GuitarPlayerRightHand
 *  
 * @author Seongyeop Jeong (James) for dev
 */

public class RightHand implements GuitarPlayerRightHand {

	private Guitar guitar;
	
	/**
	 * RightHand constructor
	 * @param guitar 
	 * 			this constructor makes RightHand class connected to Guitar object 
	 * 			because RightHand plays guitar
	 */
	
	public RightHand(Guitar guitar) 
	{
		this.guitar = guitar;
	} // end one-argument constructor

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void pluck(int... strings) 
	{
		for (int count : strings)
		{
			guitar.pluck(count);
		}

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void strum() 
	{
		for (int count = 6; count > 0; count--)
		{
			guitar.pluck(count);
			pause(80);
		}

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void strum(int stringNum) 
	{
		for (; stringNum > 0; stringNum--)
		{
			guitar.pluck(stringNum);
			pause(80);
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void pause(int milliSeconds) 
	{
		try 
		{
			Thread.sleep(milliSeconds);
		} 
		catch (Exception e) 
		{
			
		}
	} 

} // end RightHand class
