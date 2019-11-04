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
	
	public boolean CheckForMill(int x, int y)
	{
		if(grid[x][y].getUsable() && grid[x][y].get_point_state() != "none")
		{
	    if(rightMill(x,y) || leftMill(x,y) || upMill(x,y) || downMill(x,y) || horizontal_MidpointMill(x,y) || vertical_MidpointMill(x,y))
	    {
	    	return true;
	    }
		}
		
		return false;

	}
	
	public boolean rightMill(int x, int y)
	{
		if(grid[x][y].get_point_state() == grid[x+1][y].get_point_state() && grid[x+1][y].get_point_state() == grid[x+2][y].get_point_state())
		{
			return true;
		}
		else return false;
	}
	
	public boolean leftMill(int x, int y)
	{
		if(grid[x][y].get_point_state() == grid[x-1][y].get_point_state() && grid[x-1][y].get_point_state() == grid[x-2][y].get_point_state())
		{
			return true;
		}
		else return false;
	}
	
	public boolean upMill(int x, int y)
	{
		if(grid[x][y].get_point_state() == grid[x][y+1].get_point_state() && grid[x][y+1].get_point_state() == grid[x][y+2].get_point_state())
		{
			return true;
		}
		else return false;
	}
	
	public boolean downMill(int x, int y)
	{

		if(grid[x][y].get_point_state() == grid[x][y-1].get_point_state() && grid[x][y-1].get_point_state() == grid[x][y-2].get_point_state())
		{
			return true;
		}
		else return false;
	}
	
	public boolean horizontal_MidpointMill(int x, int y)
	{

		if(grid[x][y].get_point_state() == grid[x-1][y].get_point_state() && grid[x][y].get_point_state() == grid[x+1][y].get_point_state())
		{
			return true;
		}
		else return false;
	}
	
	public boolean vertical_MidpointMill(int x, int y)
	{

		if(grid[x][y].get_point_state() == grid[x][y+1].get_point_state() && grid[x][y].get_point_state() == grid[x][y-1].get_point_state())
		{
			return true;
		}
		else return false;
	}

	
}
