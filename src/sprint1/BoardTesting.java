package sprint1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import sprint1.Board;
import sprint1.Square;

class BoardTesting {

	public Board testboard = new Board();

	@Test
	public void testSetUp() {
		fail("Not yet implemented");
	}

	@Test
	public void testTearDown() {
		fail("Not yet implemented");
	}

	@Test
	public void testConnectIntersquarePoints()
	{
		testboard.connectIntersquarePoints();
		assertEquals(testboard.middleSquare.middleLeft,testboard.outerSquare.middleLeft.lookRight);
	}

	@Test
	public void testConnectPoints() 
	{
		testboard.connectPoints();
		assertEquals(testboard.outerSquare.bottomLeft,testboard.outerSquare.middleLeft.lookDown);
	}
}
