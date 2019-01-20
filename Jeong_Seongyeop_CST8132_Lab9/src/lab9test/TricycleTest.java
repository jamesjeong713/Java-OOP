package lab9test;

import lab9.Tricycle;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class TricycleTest {

	Tricycle tricycle;
	int [] speed = {0, 3, 30, 33};
	String [] noise = {"sigh", "grunt"};
	
	@Before
    public void before() throws Exception {
        System.out.println("Running: Car setUp");
        tricycle = new Tricycle();
        assertNotNull(tricycle);
    }
	
	@Test
	public void testTricycleDefaultSpeed() {
		System.out.println("testTricycleDefaultSpeed()");
		assertEquals(speed[0], tricycle.speed);
	}
	
	@Test
	public void testTricycleIncreasedSpeed() {
		System.out.println("testTricycleIncreasedSpeed()");
		System.out.println("tricycle.pushPedal()");
		
		tricycle.pushPedal();
		assertEquals(speed[1], tricycle.speed);
	}
	
	@Test
	public void testTricycleDefaultNoise() {
		System.out.println("testTricycleDefaultNoise()");
		assertTrue(noise[0].equals(tricycle.makeNoise()));
	}
	
	@Test
	public void testTricycleIncreasedNoise() {
		System.out.println("testTricycleIncreasedNoise()");
		System.out.println("tricycle.pushPedal()");
		tricycle.pushPedal();
		assertTrue(noise[1].equals(tricycle.makeNoise()));
	}
	
	@Test
	public void testTricycleMaximumSpeed() {
		System.out.println("testTricycleMaximumSpeed()");
		System.out.println("tricycle.speed = 30");
		System.out.println("tricycle.pushPedal()");
		
		tricycle.speed = 30;
		tricycle.pushPedal();
		assertTrue(speed[3] > tricycle.speed);
	}
	
	@Test
	public void testTricycleMaximumNoise() { 
		System.out.println("testTricycleMaximumNoise()");
		System.out.println("tricycle.speed = 30");
		System.out.println("tricycle.pushPedal()");
		
		tricycle.speed = 30;
		tricycle.pushPedal();
		assertTrue(noise[1].equals(tricycle.makeNoise()));
	}
	@After
	public void after() throws Exception {
        System.out.println("Running: tricycle tearDown");
        tricycle = null;
        assertNull(tricycle);
    }
}
