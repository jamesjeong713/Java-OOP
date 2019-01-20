
public class ExerciseTwo extends ExerciseOne {

	//calling objects
	public static void main(String[] args)
	{
		ExerciseTwo e2 = new ExerciseTwo(1);
		e2.printArrayStatement();
		e2.displayArrayTotal();
		e2.printArrayStatement(2);
		e2.displayArrayTotal(2);
	}
	
	//two dimensions global arrays.
	int[][] myArray = new int[8][10];
	
	//constructor
	public ExerciseTwo(int d) {	
		
		super(d); //

		for(int i=0; i<8; i++)
		{
			for(int j=0; j<10; j++)
			{
				myArray[i][j]=i*10+j;
			}
		}
	}

	//to show first one line
	public void printArrayStatement(int d)
	{
		System.out.print("int[] outputArray = { \n");
		for(int i = 0; i < myArray.length; i++)
		{
			System.out.print("    { ");

			for(int j = 0; j < 10; j++)
			{
				System.out.print(myArray[i][j]);
				if(j < 9) //it makes comma put each numbers
				{
					System.out.print(", ");
				}
			}
			System.out.print(" }");
			if(i < 7) //word wrapping; from 7th's comma, comma's supposed to not be 
			{
				System.out.println(",");
			}
		}
		System.out.println("\n},");
	}
	
	//to show total number
	public void displayArrayTotal(int d)
	{
		int sum=0;
		for(int[] i : myArray)
		{
			for(int j : i)
			{
				sum=sum+j;
			}
		}
		System.out.print("The sum total of all elements of myArray is " + sum);
	}
}
