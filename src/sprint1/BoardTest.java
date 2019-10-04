package sprint1;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BoardTest {
	public Board testboard = new Board();


	@Test
	 void connectInterSquarePoints() {
	testboard.connectAllLocalPoints();
	testboard.connectIntersquarePoints();
	assertEquals(testboard.outerSquare.middleLeft,testboard.middleSquare.middleLeft.getLeft());
	}
	
	@Test
	void testConnectAllLocalPoints() {
		testboard.connectAllLocalPoints();
		assertEquals(testboard.outerSquare.bottomLeft,testboard.outerSquare.bottomMiddle.getLeft());
	}
	
	@Test 
	void testConnectLocalPoints() {
		testboard.outerSquare.connectLocalPoints();
		Point a = testboard.outerSquare.bottomLeft;
		assertEquals(a,testboard.outerSquare.bottomMiddle.getLeft());
	}
	
	
	
}
	
	
	
