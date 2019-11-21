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
	
	public boolean checkValidMove(int x, int y)
	{
		if(grid[x][y].getUsable() && grid[x][y].get_point_state() != "none")
		{
		if((x == 0 || x == 3 || x == 6) && (y == 0 || y == 3 || y == 6))//outer square
		{
		   if(y == 0 || y == 6)
		   {
			   if(x == 3)
			   {
				   if(grid[x+3][y].get_point_state() == "none" || grid[x-3][y].get_point_state() == "none" || grid[x][y+1].get_point_state() == "none" || grid[x][y-1].get_point_state() == "none")
				   {
					   return true;
				   }
			   }
			   else if(x == 0 || x == 6)
			   {
				 if(grid[x+3][y].get_point_state() == "none" || grid[x-3][y].get_point_state() == "none" || grid[x+3]cd)  
			   }
		   }
		}
		
		}
	}
	
	public boolean CheckForMill(int x, int y)
	{
		if(grid[x][y].getUsable() && grid[x][y].get_point_state() != "none")
		{
		  if((x == 0 || x == 3 || x == 6) && (y == 0 || y == 3 || y == 6))
		  {
			  return CheckForMill_OuterSquare(x,y);
		  }
		  else if((x == 1 || x == 3 || x == 5) && (y == 1 || y == 3 || y == 5))
		  {
			  return CheckForMill_MiddleSquare(x,y);
		  }
		  else if((x == 2 || x == 3 || x == 4) && (y == 2 || y == 3 || y == 4))
		  {
			  return CheckForMill_InnerSquare(x,y);
		  }
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
		if((x == 0 || x == 6) && y == 3)
		{
			if(rightMill(x,y,1) || leftMill(x,y,1))
			{
				return true;
			}
			else if(grid[x][y].get_point_state() == grid[x][y+3].get_point_state() && grid[x][y].get_point_state() == grid[x][y-3].get_point_state())
			{
				return true;
			}
		}
		
		return false; //if none of the above is true then return false
	}
	
	public boolean CheckForMill_MiddleSquare(int x, int y)
	{
		if(x == 1 || x == 5)
		{
			if(y == 1 || y == 5)
			{
				if(upMill(x,y,2) || downMill(x,y,2))
				{
					return true;
				}
				if(rightMill(x,y,2) || leftMill(x,y,2))
				{
					return true;
				}
			}
			else if(y == 3)
			{
				if(horizontal_MidpointMill(x,y,1) || vertical_MidpointMill(x,y,2))
				{
					return true;
				}
			}
			
		}
		else if(x == 3)
		{
			if(y == 1 || y == 5)
			{
				if(horizontal_MidpointMill(x,y,2) || vertical_MidpointMill(x,y,1))
				{
					return true;
				}
					
			}
			
		}
		
		
		return false;
	}
	
	public boolean CheckForMill_InnerSquare(int x, int y)
	{
		if(x == 2 || x == 4)
		{
			if(y == 2 || y == 4)
			{
				if(upMill(x,y,1) || downMill(x,y,1) || leftMill(x,y,1) || rightMill(x,y,1))
				{
					return true;
				}
			}
			else if(y == 3)
			{
				if(leftMill(x,y,1) || rightMill(x,y,1) || vertical_MidpointMill(x,y,1))
				{
					return true;
				}
				
			}
		}
		else if(x == 3)
		{
			if(y == 2 || y == 4)
			{
				if(downMill(x,y,1) || upMill(x,y,1))
				{
					return true;
				}
			}
		}
		
		
		
		
		return false;
	}
	
	public boolean rightMill(int x, int y, int n) //where n is the spacing between valid points which differ depending on which square the point is in
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
