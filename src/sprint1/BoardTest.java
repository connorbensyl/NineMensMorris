package sprint1;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class BoardTest {
	public Board testboard = new Board();

	@Test
	void testSetUp() {
		fail("Not yet implemented");
	}

	@Test
	void testTearDown() {
		fail("Not yet implemented");
	}

	@Test
	void testConnectIntersquarePoints()
	{
		testboard.connectIntersquarePoints();
		assertEquals(testboard.middleSquare.middleLeft,testboard.outerSquare.middleLeft.lookRight);
	}

	@Test
	void testConnectPoints() 
	{
		testboard.connectPoints();
		assertEquals(testboard.outerSquare.bottomLeft,testboard.outerSquare.middleLeft.lookDown);
	}
	
	

}
