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

public class CarTest {

	/**
	 * instantiate Vehicle called car to avoid misunderstanding 
	 */
	Vehicle car;
	  
	/**
	 * each test has to be initiated object car.  
	 * @throws Exception
	 * 				to check if the object instance is not null
	 */
	@Before
	public void before() throws Exception 
	{
		car = new Car(0, 4);
		assertNotNull(car);
	}
	
	/**
	 * to check if the first of speed variable in car is 0
	 */
	@Test
	public void test01() 
	{
		assertEquals(car.speed, 0);
	}

	/**
	 * to check if bicycle's number of wheels is 2.
	 */
	@Test
	public void test02()
	{
		assertEquals(car.numberOfWheels, 4);
	}

	/**
	 * to check if bicycle's noise is purr when the speed is 0
	 */
	@Test
	public void test03()
	{
		assertEquals(car.noise(), ("purr"));
	}
	
	/**
	 * to check if bicycle's noise is vroom when the speed is bigger than 0
	 */
	@Test
	public void test04()
	{
		car.pedal();
		assertTrue(car.noise().equals("vroom"));
	}
	
	/**
	 * to check if bicycle's speed is bigger than 0 if it is pushed.
	 */
	@Test
	public void test05()
	{
		car.pedal();
		assertTrue(car.speed >= 0);
	}
	
	/**
	 * after finishing this test, car object has to be null to clear memory
	 * 
	 * @throws Exception
	 * 			to check if the object instance is null
	 */
	@After
	public void after() throws Exception 
	{
		car = null;
		assertNull(car);
	}
}
