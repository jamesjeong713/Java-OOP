package guitar;

import edu.ac.guitarlib.Board;

/**
 * This class supports the singleton design pattern
 *  
 * @author Seongyeop Jeong (James) for dev
 */

public class GuitarFrame {

	/** 
	 * instantiate as an unique instance  
	 * which is guitarFrame with static for singleton pattern
	 * so that any changes apply to this instance
	 */
	private Board board;
	private static GuitarFrame guitarFrame; 
	
	/**
	 * GuitarFrame constructor
	 * 		to not instantiate it by other class 
	 */
	private GuitarFrame()
	{
		board = new Board();
	} 
	
	/**
	 * Singleton pattern
	 * @return 
	 * 		if guitarFrame is not instantiated, automatically instantiates it. 
	 * 		then pass it.
	 */
	public static GuitarFrame getInstance()
	{
		if(guitarFrame == null)
		{
			guitarFrame = new GuitarFrame();
		}
		return guitarFrame;
	}
	
	/** 
	 * getBoard method to call Board object
	 * @return 
	 * 		returns a reference to board 
	 */
	public Board getBoard()
	{
		return board;
	}
} // end GuitarFrame class
