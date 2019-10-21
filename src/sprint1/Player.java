package sprint1;

public class Player {

	private int initialPieceCount = 9;
	private int numPiecesPlayed = 0;
	private int numGamesWon = 0;
	private int piecesOnBoard = 0;
	private boolean canFly = false;
	private String name;
	private String phase;
	
	public Player() {
		canFly = false;
		phase = "placing pieces";
	}
	
	public void setPhase(String phase)
	{
		this.phase = phase;
	}
	
	public String getPhase()
	{
		return this.phase;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public int getinitialPieceCount() {
		return initialPieceCount;
	}
	
	public int getNumPiecesPlayed() {
		return numPiecesPlayed;
	}
	
	public int getPiecesLeftToPlace() {
		return (initialPieceCount - numPiecesPlayed);
	}
	public int getPiecesOnBoard() {
		return piecesOnBoard;
	}
	
	public int getNumGamesWon()
	{
		return numGamesWon;
	}
	
	
	public void setNumPiecesPlayed(int num) 
	{
		this.numPiecesPlayed = num;
	}
	
	
	
	public void setpiecesOnBoard(int num) //for testing reasons so I don't have to decrement 6 times to test flying
	{
		this.piecesOnBoard = num;
	}
	public
	//Can player fly
	
	boolean canFly() {
		int a = getPiecesLeftToPlace();
		if ((a == 0) && (piecesOnBoard == 3 )) {
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	
	
	public Board playPiece(Board board, String color, int xcoord, int ycoord)
	{
		if(xcoord < 600)
		{
		if(ycoord > 320)
		{
			if(ycoord < 440)
			{
				if(xcoord > 500)
				{
					if(xcoord < 550)
					{
						if(ycoord < 350)
						{
							board.innerSquare.middleLeft.set_point_state(color);
							return board;
						}
						else
						{
							board.innerSquare.bottomLeft.set_point_state(color);
							return board;

						}
					}
					else
					{
						board.innerSquare.bottomMiddle.set_point_state(color);
						return board;
					}
				}
				else
				{
					if(xcoord < 400)
					{
						board.outerSquare.middleLeft.set_point_state(color);
						return board;
					}
					else
					{
						board.middleSquare.middleLeft.set_point_state(color);
						return board;
					}
				}
			}
			else
			{
				if(ycoord > 500)
				{
					if(xcoord < 440)
					{
						board.outerSquare.bottomLeft.set_point_state(color);
						return board;
					}
					else
					{
						board.outerSquare.bottomMiddle.set_point_state(color);
						return board;
					}
				}
				else
				{
					
				}
			}
			
		} 
		else
		{
			if(ycoord < 320)
			{
				
			}
			else
			{
				
			}
		}
		
	}
		else //if xcoord > 600
		{
			if(ycoord > 320)
			{
				
			}
			else
			{
				
			}
		}
		numPiecesPlayed++;
		piecesOnBoard++;
	}
	public void decrementpiecesOnBoard()
	{
		piecesOnBoard--;
	}
	
	public void incrementGamesWon()
	{
		numGamesWon++;
	}
	
	

}
