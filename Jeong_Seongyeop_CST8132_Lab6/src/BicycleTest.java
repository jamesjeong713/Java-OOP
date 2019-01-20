/**
 * this class is for Junit
 * 
 * @author Seongyeop Jeong (James) for dev
 *
 */

import org.junit.Test;	// supports @Test annotation
import org.junit.Before;	// supports @Before annotation
import org.junit.After;	// supports @After annotation

// some select assertion tests
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class BicycleTest {
	
	/**
	 * instantiate Vehicle called bicycle to avoid misunderstanding 
	 */
	Vehicle bicycle;
	  
	/**
	 * each test has to be initiated object bicycle.  
	 * @throws Exception
	 * 				to check if the object instance is not null
	 */
	  @Before
	  public void before() throws Exception 
	  {
		  bicycle = new Bicycle(0, 2);
		  assertNotNull(bicycle);
	  }
	  
	  /**
	   * to check if the first of speed variable in bicycle is 0
	   */
	  @Test
	  public void test01() 
	  {
		  assertEquals(bicycle.speed, 0);
	  }
	  
	  /**
	   * to check if bicycle's number of wheels is 2.
	   */
	  @Test
	  public void test02()
	  {
		  assertEquals(bicycle.numberOfWheels, 2);
	  }

	  /**
	   * to check if bicycle's noise is sigh when the speed is 0
	   */
	  @Test
	  public void test03()
	  {
		  assertEquals(bicycle.noise(), ("sigh"));
	  }
	  
	  /**
	   * to check if bicycle's noise is grunt when the speed is bigger than 0
	   */
	  @Test
	  public void test04()
	  {
		  bicycle.pedal();
		  assertTrue(bicycle.noise().equals("grunt"));
	  }
	  
	  /**
	   * when the speed is 20, it checks if the speed increase
	   */
	  @Test
	  public void test05()
	  {
		  bicycle.speed = 20;
		  bicycle.pedal();
		  assertTrue(bicycle.speed <= 40);
	  }
	  
	  /**
	   * when the speed is 40, it checks if the speed does not increase.
	   */
	  @Test
	  public void test06() 
	  { // to check if maximum speed is 40.
		  bicycle.speed = 40;
		  bicycle.pedal();
		  assertTrue(bicycle.speed <= 40);
	  }
	  
	  /**
	   * after finishing this test, bicycle object has to be null to clear memory
	   * 
	   * @throws Exception
	   * 			to check if the object instance is null
	   */
	  @After
	  public void after() throws Exception 
	  {
		  bicycle = null;
		  assertNull(bicycle);
	  }
}
