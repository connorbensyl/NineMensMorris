package sprint1;
import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
class SquareTest {
Square testSquare = new Square();
	@Test
	void pointExistsTest() {
		Point a = testSquare.bottomLeft;
		assertEquals(a,testSquare.bottomLeft);
	}
	
	@Test
	void lookTest() {
		Point a = testSquare.bottomLeft;
		assertEquals(a,testSquare.bottomLeft);
	}
	
	@Test
	void connectLocalPointsTest() {
		testSquare.connectLocalPoints();
		assertEquals(testSquare.bottomLeft.getUp(),testSquare.middleLeft);
	}

	//Todo: create setnext test
}