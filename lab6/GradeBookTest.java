import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {
	//As a private attribute (member) of GradeBookTest
	private GradeBook grade1, grade2;


	@BeforeEach
	void setUp() throws Exception {
		//
		grade1 = new GradeBook(5);
		grade2 = new GradeBook(5);
		
		//  call the addScore method
		grade1.addScore(72);
		grade1.addScore(70);
		grade1.addScore(69);
		grade2.addScore(89);
		grade2.addScore(98);
		
	}

	@AfterEach
	void tearDown() throws Exception {
		grade1 = null;
		grade2 = null;
		
	}

	@Test
	void testGetScoreSize() {
		//fail("Not yet implemented");
		
	}

	@Test
	void testToString() {
		//fail("Not yet implemented");
	}

	@Test
	void testAddScore() {
		//fail("Not yet implemented");
		assertTrue(grade1.toString().equals("72.0 69.0 70.0 0.0 0.0 "));
		assertTrue(grade2.toString().equals("89.0 98.0 0.0 0.0 0.0 "));
		
		assertEquals(3,grade1.getScoreSize(), .0001);
		assertEquals(2,grade2.getScoreSize(), .0001);
		
	}

	@Test
	void testSum() {
		//fail("Not yet implemented");
		assertEquals(211, grade1.sum(), .0001);
		assertEquals(187, grade2.sum(), .0001);
		
	}

	@Test
	void testMinimum() {
		//fail("Not yet implemented");
		assertEquals(69, grade1.minimum(), .0001);
		assertEquals(89, grade2.minimum(), .0001);
	}

	@Test
	void testFinalScore() {
		//fail("Not yet implemented");
		assertEquals(211, grade1.finalScore());
		assertEquals(187, grade2.finalScore());
	}

}
