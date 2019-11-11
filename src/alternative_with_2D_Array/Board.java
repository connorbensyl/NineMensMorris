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
	  
		}
		
		return false;

	}
	
	public boolean CheckForMill_OuterSquare(int x, int y)
	{
		if(y == 0)
		{
			if(x == 3)
			{
				if(upMill(x,y,1))
				{
					return true;
				}
				else if(horizontal_MidpointMill(x,y,3))
				{
					return true;
				}
			}
			else if(upMill(x,y,3))
			{
				return true;
			}
			else if(rightMill(x,y,3) || leftMill(x,y,3))
			{
				return true;
			}
			
			
		}
		else if(y == 6)
		{
			if(x == 3)
			{
				if(downMill(x,y,1))
				{
					return true;
				}
				else if(horizontal_MidpointMill(x,y,3))
				{
					return true;
				}
			}
			else if(downMill(x,y,3))
			{
				return true;
			}
			else if(rightMill(x,y,3) || leftMill(x,y,3))
			{
				return true;
			}
		}
		if(x == 0 || x == 6 && y == 3)
		{
			if(rightMill(x,y,1) || leftMill(x,y,1))
			{
				return true;
			}
		}
		
		
		

		
		return false;
	}
	
	public boolean rightMill(int x, int y, int n) //where n is the spacing between valid points which differ depending on which square it's in
	{
		if(grid[x][y].get_point_state() == grid[x+n][y].get_point_state() && grid[x+n][y].get_point_state() == grid[x+(2*n)][y].get_point_state())
		{
			return true;
		}
		else return false;
	}
	
	public boolean leftMill(int x, int y, int n)
	{
		if(grid[x][y].get_point_state() == grid[x-1][y].get_point_state() && grid[x-1][y].get_point_state() == grid[x-2][y].get_point_state())
		{
			return true;
		}
		else return false;
	}
	
	public boolean upMill(int x, int y, int n)
	{
		if(grid[x][y].get_point_state() == grid[x][y+1].get_point_state() && grid[x][y+1].get_point_state() == grid[x][y+2].get_point_state())
		{
			return true;
		}
		else return false;
	}
	
	public boolean downMill(int x, int y, int n)
	{

		if(grid[x][y].get_point_state() == grid[x][y-1].get_point_state() && grid[x][y-1].get_point_state() == grid[x][y-2].get_point_state())
		{
			return true;
		}
		else return false;
	}
	
	public boolean horizontal_MidpointMill(int x, int y, int n)
	{

		if(grid[x][y].get_point_state() == grid[x-n][y].get_point_state() && grid[x][y].get_point_state() == grid[x+n][y].get_point_state())
		{
			return true;
		}
		else return false;
	}
	
	public boolean vertical_MidpointMill(int x, int y, int n)
	{

		if(grid[x][y].get_point_state() == grid[x][y+1].get_point_state() && grid[x][y].get_point_state() == grid[x][y-1].get_point_state())
		{
			return true;
		}
		else return false;
	}

	
}
