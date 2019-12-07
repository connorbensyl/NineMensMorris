package alternative_with_2D_Array;

import static org.junit.Assert.*;

import org.junit.Test;

public class BoardTest1 {


	@Test
	public void testCheckMill() 
	{
		
		Board b = new Board();
		b.grid[0][0].set_point_state("black");
		b.grid[3][0].set_point_state("black");
		b.grid[6][0].set_point_state("black");
		
		
		assertEquals(true,b.CheckForMill(0, 0));
	}
	
	@Test
	public void testNoValidMove()
	{
		Player player1 = new Player("black","Connor");
		Board b = new Board();
		b.grid[0][3].set_point_state("black");
		b.grid[1][3].set_point_state("black");
		b.grid[2][3].set_point_state("black");
		b.grid[1][5].set_point_state("black");
		b.grid[1][1].set_point_state("black");
		assertFalse(b.checkValidMove_noFlying(1, 3, player1));
	}
	
	@Test
	public void testValidMove()
	{
		Player player1 = new Player("black","Connor");
		Board b = new Board();
		player1.setpiecesOnBoard(5);
		b.grid[1][3].set_point_state("black");
		assertEquals(true, b.checkValidMove_noFlying(1, 3, player1));
		
	}

}

