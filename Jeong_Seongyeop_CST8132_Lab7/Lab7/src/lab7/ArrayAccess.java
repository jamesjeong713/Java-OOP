package lab7;

public class ArrayAccess implements ArrayAccessIf {

	int[] arrayForAccess = new int[10];

	/**
	 * test1: looping from count = 0 to 10
	 * match to each test1 array values ex) 0:1, 1:2, 2:aaa
	 * "aaa" catch by NumberFormatException -> output "Invalid Number"
	 * test2: looping ten times, but test2 has 11 times' arrays
	 * catch by ArrayIndexOutOfBoundsException -> output "Array out of bounds"
	 * test3: looping ten times, but there's no any problem. -> no output
	 */
	@Override
	public void initArray(String[] initialArray) //overriding ArrayAccessIf interface
	{	
		try 
		{
			for (int count = 0; count < initialArray.length; count++)
			{
				// to change the string value "1", "3"... to value 1, 3
				// has to be used wrapper class
				arrayForAccess[count] = Integer.parseInt(initialArray[count]);
			}

		}
		catch(NumberFormatException NumberFormatException)
		{
			System.err.println("Invalid Number");
		}
		catch (ArrayIndexOutOfBoundsException ArrayIndexOutOfBoundsException)
		{
			System.err.println("Array out of bounds");
		}
	}

	/**
	 * ==>index for: aaa because of test1[2]
	 * arrayForAccess[count] has test1 arrays because of declaring from InitialArray
	 * whenever use input some value, it can find ten times. 
	 * in findIndexFor method, user input test[1] which is "aaa", 
	 * there's no matched numbers (aaa is not number). therefore, it throw to NumberNotFoundException. 
	 * 1st: invalid number(input: aaa) -> throw to NumberFormatException
	 * 2nd: number not found (input: 12) -> throw to NumberNotFoundException
	 * 3rd: 4, index: 3 because count variables is 3 (input: 4) -> no throwing
	 */
	@Override
	public void findIndexFor(String findIndexArray) {
		try
		{
			boolean foundcheck = false;
			
			for(int count = 0; count < arrayForAccess.length ; count++)
			{
				if(Integer.parseInt(findIndexArray) == arrayForAccess[count])
				{
					foundcheck = true;
					System.out.println(findIndexArray + ", index: " + count);
				}
			}
			if (foundcheck == false)
			{
				throw new NumberNotFoundException();
			}
		}
		catch (NumberFormatException NumberFormatException)
		{
			System.err.println("Invalid number");
		}
		catch (NumberNotFoundException NumberNotFoundException)
		{
			System.err.println("Number not found");
		}
	}

	/**
	 * findValueFor 
	 * when user put "aaa", catch NumberFormatException -> invalid number
	 * when user put "-1", catch ArrayIndexOutOfBoundsException -> Array out of bounds
	 * because -1 is negative value. 
	 * when user put "5", it shows you index 5 and number 6 in test3's array[5] 
	 */
	@Override
	public void findValueFor(String findValueArray) {
		try 
		{
			System.out.println("index " + findValueArray + ":" 
		+ arrayForAccess[Integer.parseInt(findValueArray)]);
		}
		catch (NumberFormatException NumberFormatException)
		{
			System.err.println("Invalid number");
		}
		catch (ArrayIndexOutOfBoundsException ArrayIndexOutOfBoundsException)
		{
			System.err.println("Array out of bounds");
		}
	}

}
