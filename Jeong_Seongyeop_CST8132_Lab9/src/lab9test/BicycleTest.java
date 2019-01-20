package lab9test;
import lab9.Bicycle;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class BicycleTest {

	Bicycle bike;
	int[] speed = {0,4, 44};
	String[] noise = {"sigh","grunt"};
   
    @Before
    public void before() throws Exception {
        System.out.println("Running: Bicycle setUp");
        bike = new Bicycle();
        assertNotNull(bike);
    }	
	
	@Test
	public void testBikeDefaultSpeed() {
		System.out.println("Running testBikeDefaultSpeed()");
		assertEquals(speed[0], bike.speed);
   }
	
	@Test
	public void testBikeDefaultNoise() {
		System.out.println("Running testBikeDefaultNoise()");
		assertTrue(noise[0].equals(bike.makeNoise()));
   }
	
	@Test
	public void testBikeIncreasedSpeed() {
		System.out.println("Running testBikeIncreasedSpeed()");
		System.out.println("bike.pushPedal();");
		bike.pushPedal();
		assertEquals(speed[1], bike.speed);
   }
	
	@Test
	public void testBikeIncreasedNoise() {
		System.out.println("Running testBikeIncreasedNoise()");
		System.out.println("bike.pushPedal();");
		bike.pushPedal();
		assertTrue(noise[1].equals(bike.makeNoise()));
   }
	
	@Test
	public void testBikeMaximumSpeed() {
		System.out.println("Running testBikeMaximumSpeed()");
		System.out.println("bike.speed = 40");
		System.out.println("bike.pushPedal()");
		bike.speed = 40;
		bike.pushPedal();
		assertTrue(bike.speed < speed[2]);
	}
	
	@Test
	public void testBikeMaximumNoise() {
		System.out.println("Running testBikeMaximumNoise()");
		System.out.println("bike.speed = 40");
		System.out.println("bike.pushPedal()");
		bike.speed = 40;
		bike.pushPedal();
		assertTrue(noise[1].equals(bike.makeNoise()));
	}
	
    @After
    public void after() throws Exception {
        System.out.println("Running: Bicycle tearDown");
        bike = null;
        assertNull(bike);
    }
	
}
;