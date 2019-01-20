
public class ExerciseOne {
	
	int[] myArray = new int[10];

	// constructor
	public ExerciseOne(int d) 
	{	
		for(d = 0; d < 10; d++)
		{
			myArray[d]=d;
		}
	}
	
	//print Array
	public void printArrayStatement()
	{
		System.out.print("int[] outputArray = {");
		for(int i = 0; i < myArray.length; i++)
		{
			System.out.printf(" %d", myArray[i]=i);
			if (i<myArray.length-1)
			{
				System.out.print(",");
			}
		}
		System.out.println(" };");
	}
	
	// to show totalMethod
	public void displayArrayTotal()
	{
		int sum=0;
		for(int i : myArray)
		{
			sum+=myArray[i];
		}
		System.out.print("The sum total of all elements of myArray is " + sum);
		System.out.println("\n");
	}
}
