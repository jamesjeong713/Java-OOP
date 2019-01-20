/**
 * this class is for Junit
 * 
 * @author Seongyeop Jeong (James) for dev
 *
 */

import org.junit.runner.RunWith; // RunWith annotation
import org.junit.runners.Suite;  // Suite annotation

// JUnit Suite Test
@RunWith(Suite.class)

@Suite.SuiteClasses
(
		{CarTest.class, BicycleTest.class}
)

public class TestSuite {

}
