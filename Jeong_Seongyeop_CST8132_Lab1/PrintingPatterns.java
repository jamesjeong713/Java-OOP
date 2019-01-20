/**
 * this class is main function to print patterns by using for loops
 * @author James for dev
 *
 */
public class PrintingPatterns {
	
	public static void main(String[] args)
	{
		int controlLine = 10;
		
		// first area
		// this loop is to make rows
		for (int line = 0; line < controlLine; line++)
		{
			// when the line variable is 0, ampersands variable increase 10 times 
			// if controlLine variable is 10.
			for (int ampersands = 0; ampersands <= line; ampersands++)
			{
				System.out.print("#");
			}
			System.out.print("\n");
		}
		System.out.print("\n");
		
		// second area
		// this loop is to make rows
		for (int line = 0; line < controlLine; line++)
		{
			// when the controlLine variable is 10 the line variable increase until then.
			// ampersands increase each loop turn to make blank 
			// for example, when line 0, ampersands0. (not output) 
			// -> when line 10, ampersands increase until 9. (output a blank 9 times)
			for (int ampersands = 0; ampersands < line; ampersands++)
			{
				System.out.print(" ");
			}
			// ampersands initiates as controlLine. it is decreased until line variable.
			// for example, when ampersands 10 (declare to controlLine), ampersands is decreased.
			for (int ampersands = controlLine; line < ampersands; ampersands--)
			{
				System.out.print("#");
			}
			System.out.print("\n");
		}
		System.out.print("\n");
		
		// third one
		// this for loop is to make rows
		for (int line = 0; line < controlLine; line++)
		{
			// when the ampersands is 9(10-1), ampersands is decreased until 1.
			// therefore, it shows output 9 times
			for (int ampersands = controlLine-1; ampersands > line; ampersands--)
			{
				System.out.print(" ");
			}
			// when the line variable 0, ampersands is supposed to print a symbol 1 time. 
			// thus, ampersands variable has to less than and equal to line variable.
			for (int ampersands = 0; ampersands <= line; ampersands++)
			{
				System.out.print("#");
			}
			System.out.print("\n");
		}
		System.out.print("\n");
		
		// forth one
		// line variable is 10, and line variable is decreased until 1. (10 times)
		// this loop is to make rows
		for (int line = controlLine; line > 0; line--)
		{
			// if the line variable is 10, ampersands is increased until 9.
			// whenever the line variable is decreased, ampersands variable is increased by that.
			for (int ampersands=0; ampersands < line; ampersands++)
			{
				System.out.print("#");
			}
			System.out.print("\n");
		}
	} // end main method
} // end PrintingPatterns class 
