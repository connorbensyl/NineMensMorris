package sprint1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BoardTesting {

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
