package guitar;

import edu.ac.guitarlib.LeftSideOfGuitar;
import edu.ac.guitarlib.Midi;
import edu.ac.guitarlib.RightSideOfGuitar;

/**
 * This class is subclass of LeftSideOfGuitar and RightSideOfGuitar
 * 
 * @author Seongyeop Jeong (James) for dev
 */

public class Guitar implements LeftSideOfGuitar, RightSideOfGuitar {

	private Wire[] wire;
	private Peg[] peg;

	/**
	 * Guitar constructor
	 */
	public Guitar()
	{
		// guitar has six wires and six pegs
		wire = new Wire[6];
		peg = new Peg[6];
		
		// allocate memory six times to each address of objects
		for (int i = 0; i < wire.length; i++)
		{
			//declaration six times with guitar table in Midi class
			wire[i] = new Wire(Midi.GUITAR_TABLE[i]);
			//declaration and allocation memory peg objects six times 
			peg[i] = new Peg(wire[i]);
		}
	} // end Guitar constructor
	
	/**
	 * {@inheritDoc}
	 */
	
	@Override
	public void fret (int wireNum, int fretNum)
	{
		wire[wireNum - 1].fret(fretNum);
	}
	
	/**
	 * {@inheritDoc}
	 */
	
	@Override
	public void hammerOn(int wireNum, int fretNum)
	{
		fret(wireNum, fretNum);
		pluck(wireNum);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public void pluck(int wireNum) 
	{
		// this method is reference to pluck method in wire class.
		wire[wireNum - 1].pluck();
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public void turn(int pegNum, int deltaTension) 
	{
		// get values from main class
		peg[pegNum - 1].turn(deltaTension);
	}
	
	/**
	 * close method
	 * 		GuitarFrame object returned by three method calls
	 * 		which are getInstance(), getBoard() and close()
	 */
	public void close()
	{
		// Question to professor, 
		// I don't understand how it can call close method from board class.
		GuitarFrame.getInstance().getBoard().close();
	}
} // end Guitar class
