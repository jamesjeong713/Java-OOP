package guitar;

/**
 * This class is Peg class to control changeTnesion method with wire class
 *  
 * @author Seongyeop Jeong (James) for dev
 */

public class Peg {
	
	private Wire wire;
	
	/**
	 * constructor
	 * @param wire 
	 * 			initialize wire parameter to this.wire variable
	 */
	public Peg(Wire wire)
	{
		this.wire = wire;
	} // end one-argument constructor 
	
	/**
	 * turn method
	 * @param deltaTension
	 * 			control the deltaTension variable in changeTension method
	 */
	public void turn(int deltaTension)
	{
		wire.changeTension(deltaTension);
	} // end one-argument constructor

} // end class
