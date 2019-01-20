package lab3;

import edu.ac.guitarlib.Board;

public class Wire {
	
	//variable 
	private int tension;
	//object
	private Board board;

	//constructor
	public Wire(Board board, int note)
	{
		//declare for valuables
		this.board = board;
		tension = note;
	}
	
	public void vibrate()
	{
		//call soundNote method in board
		board.soundNote(tension);
	}
	
	public void pluck()
	{
		//call the vibrate method 
		vibrate();
	}
	
	public void changeTension(int deltaTension)
	{	
		//control tension variable
		tension += deltaTension;
		//board.soundNote(deltaTension);
	}
}
