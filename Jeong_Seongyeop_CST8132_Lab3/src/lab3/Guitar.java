package lab3;

import edu.ac.guitarlib.Board;
import edu.ac.guitarlib.Midi;

public class Guitar {
	
	//guitar has a board, or guitar is reference to board
	Board board;
	
	//guitar has wires and pegs
	Wire[] Wire;
	Peg[] Peg;

	public Guitar()
	{
		board = new Board();
		
		//guitar has six wires and six pegs
		Wire = new Wire[6];
		Peg = new Peg[6];
		
		// to declare wire[i] and peg[i] six times
		for (int i = 0; i < Wire.length; i++)
		{
			// declare from wire[1] to wire[6] with parameter board and mid table 1~6
			Wire[i] = new Wire(board, Midi.GUITAR_TABLE[i]);
			// peg[1] is allocated with wire[1~6]
			// it means that peg has wires
			Peg[i] = new Peg(Wire[i]);
		}
	}
	
	//which wire was plucked
	public void pluck(int wireNum) 
	{
		//this method is reference to pluck method in wire class.
		Wire[wireNum-1].pluck();
	}
	
	public void turn(int pegNum, int deltaTension) 
	{
		//get values from main class
		Peg[pegNum-1].turn(deltaTension);
	}
	
	public void close()
	{
		//finish program
	}
}
