package guitar;

import edu.ac.guitarlib.Board;

/**
 * This class controls wire's tension as fret's number
 *  
 * @author Seongyeop Jeong (James) for dev
 */

public class Wire {

	private int tension;
	private int fretNum = 0;
	private Board board; 
	
	/**
	 * Wire constructor
	 * @param tension
	 * 			initialize tension parameter to this.tension variable
	 */
	public Wire(int tension)
	{
		this.tension = tension;
		board = GuitarFrame.getInstance().getBoard();
		// GuitarFrame object returned by the getInstance() method 
		// is never stored in a variable
	} // end one-argument constructor
	
	/**
	 * changeTension method
	 * @param deltaTension
	 * 			Peg.turn provides variable as a parameter 
	 * 			to add value in tension variable
	 */
	public void changeTension(int deltaTension)
	{
		tension = tension + deltaTension;
	} // end one-argument method changeTension
	
	
	/**
	 * vibrate method
	 */
	public void vibrate()
	{
		board.soundNote(tension + fretNum);
	} // end method vibrate
	
	/**
	 * pluck method
	 */
	public void pluck()
	{
		vibrate();
	} // end method pluck
	
	/**
	 * fret method
	 * @param fretNum
	 * 			the wire is not held against a fret
	 * 			the sound will be given by tension + 0
	 */
	public void fret (int fretNum)
	{
		if (fretNum >= 0)
		{
			this.fretNum = fretNum; 
		}
	} // end one-argument method fret

} // end Wire class
