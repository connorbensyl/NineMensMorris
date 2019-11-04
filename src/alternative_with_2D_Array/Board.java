package alternative_with_2D_Array;



public class Board 
{
	Point grid[][];
	
	public Board()
	{
		grid = new Point[6][6];
		grid[0][0].setUsable(true);
		grid[0][1].setUsable(false);
		grid[0][2].setUsable(false);
		grid[0][3].setUsable(true);
		grid[0][4].setUsable(false);
		grid[0][5].setUsable(false);
		grid[0][6].setUsable(true);
		grid[1][0].setUsable(false);
		grid[1][1].setUsable(true);
		grid[1][2].setUsable(false);
		grid[1][3].setUsable(true);
		grid[1][4].setUsable(false);
		grid[1][5].setUsable(true);
		grid[1][6].setUsable(false);
		grid[2][0].setUsable(false);
		grid[2][1].setUsable(false);
		grid[2][2].setUsable(true);
		grid[2][3].setUsable(true);
		grid[2][4].setUsable(true);
		grid[2][5].setUsable(false);
		grid[2][6].setUsable(false);
		grid[3][0].setUsable(true);
		grid[3][1].setUsable(true);
		grid[3][2].setUsable(true);
		grid[3][3].setUsable(false);
		grid[3][4].setUsable(true);
		grid[3][5].setUsable(true);
		grid[3][6].setUsable(true);
		grid[4][0].setUsable(false);
		grid[4][1].setUsable(false);
		grid[4][2].setUsable(true);
		grid[4][3].setUsable(true);
		grid[4][4].setUsable(true);
		grid[4][5].setUsable(false);
		grid[4][6].setUsable(false);
		grid[5][0].setUsable(false);
		grid[5][1].setUsable(true);
		grid[5][2].setUsable(false);
		grid[5][3].setUsable(true);
		grid[5][4].setUsable(false);
		grid[5][5].setUsable(true);
		grid[5][6].setUsable(true);
		grid[6][0].setUsable(true);
		grid[6][1].setUsable(false);
		grid[6][2].setUsable(false);
		grid[6][3].setUsable(true);
		grid[6][4].setUsable(false);
		grid[6][5].setUsable(false);
		grid[6][6].setUsable(true);
		
		
	}

	
}
