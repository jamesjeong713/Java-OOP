package lab9test;

import lab9.Car;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class CarTest {

	Car car;
	int[] speed = {0,10};
	String[] noise = {"purr","vroom"};
   
    @Before
    public void before() throws Exception {
        System.out.println("Running: Car setUp");
        car = new Car();
        assertNotNull(car);
    }	
	
	@Test
	public void testCarDefaultSpeed() {
		System.out.println("Running testCarDefaultSpeed()");
		assertEquals(speed[0], car.speed);
   }
	
	@Test
	public void testCarDefaultNoise() {
		System.out.println("Running testCarDefaultNoise()");
		assertTrue(noise[0].equals(car.makeNoise()));
   }
	
	@Test
	public void testCarIncreasedSpeed() {
		System.out.println("Running testCarIncreasedSpeed()");
		System.out.println("car.pushPedal();");
		car.pushPedal();
		assertEquals(speed[1], car.speed);
   }
	
	@Test
	public void testCarIncreasedNoise() {
		System.out.println("Running testCarIncreasedNoise()");
		System.out.println("car.pushPedal();");
		car.pushPedal();
		assertTrue(noise[1].equals(car.makeNoise()));
   }
	
	
    @After
    public void after() throws Exception {
        System.out.println("Running: Car tearDown");
        car = null;
        assertNull(car);
    }
	
}
;