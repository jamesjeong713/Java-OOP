package lab9test;


import lab9.Street;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class SimulationTest {

	int bicycleSum;
	int carSum;
	
	@Test
	public void test() {
		Street streetTest = new Street(); 
		
		streetTest.parse(new String[] {"car", "car", "car", "bicycle", "bicycle"
		});
		
		streetTest.simulate();
		bicycleSum = streetTest.getSumBicyleSpeeds()/4;
		carSum = streetTest.getSumCarSpeeds()/10;
		assertTrue((bicycleSum+carSum)==6);
	}

	

}