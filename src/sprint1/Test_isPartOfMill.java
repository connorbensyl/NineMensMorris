package sprint1;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_isPartOfMill {

	@Test
	public void testIsPartOfMill() 
	{
		Board board = new Board();
		board.connectAllLocalPoints();
		board.connectIntersquarePoints();
		board.setSquareCoords();
		board.outerSquare.middleRight.set_point_state("black");
		board.middleSquare.middleRight.set_point_state("black");
		board.innerSquare.middleRight.set_point_state("black");
		assertEquals(true,board.innerSquare.middleRight.isPartOfMill());
	}

}
