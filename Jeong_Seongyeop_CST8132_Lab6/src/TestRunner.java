/**
 * this class is for Junit
 * 
 * @author Seongyeop Jeong (James) for dev
 *
 */

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

	public static void main(String[] args) 
	{   
		Result result = JUnitCore.runClasses(TestSuite.class);

		for (Failure failure : result.getFailures())
		{
			System.out.println(failure.toString());
		}
		
		// outputs true if all tests succeed, false otherwise	
		System.out.println(result.wasSuccessful());
	}
}  