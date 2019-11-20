package sprint1;
public class Controller {


	private Board board = new Board();
	private Player  player1;
	private Player player2;
	boolean is_player1_turn;
	Gui1 gui;
	PointID pieceID;
	public Controller(Gui1 parentGui) {
		Gui1 gui = parentGui;
	}
	String moveType = "none";
	public void control_game(Gui1 controllerGui) 
	{
		player1 = new Player("black");
		player2 = new Player("white");
		player1.setName("Todd");
		player2.setName("Steve");
		player1.setPhase("placing pieces");
		player2.setPhase("placing pieces");
		is_player1_turn = true;
		board.connectAllPoints();
		board.setPointCoords();
		
		//piece placement start
		while(player1.getPhase() != "moving pieces" || player2.getPhase() != "moving pieces")
		{
			if(is_player1_turn) //player 1's turn
			{

				if(player1.getPiecesLeftToPlace() != 0)
				{
					moveType = "place piece";
					pieceID = getID(gui.xRecieved,gui.yRecieved); //replace placePiece function with getID
					player1.increment_after_piece_played();
				}
				else
				{
					player1.setPhase("moving pieces");
				}
				is_player1_turn = false; //pass turn
			}
			else         //player 2's turn
			{
				if(player2.getPiecesLeftToPlace() != 0)
				{
					pieceID = getID(gui.xRecieved,gui.yRecieved);
					player2.increment_after_piece_played();
				}
				else
				{
					player2.setPhase("moving pieces");
				}
				is_player1_turn = true; //pass turn
			}
		}
		//piece movement start
		while(player1.getPhase() != "flying" || player2.getPhase() != "flying")
		{
			moveType = "move from";
			if(is_player1_turn)
			{
				if(player1.getPiecesOnBoard() > 3)
				{
					pieceID = getID(gui.xRecieved,gui.yRecieved);
				}
				else
				{
					player1.setPhase("flying");
				}
			}
			else //player 2's turn
			{
				moveType = "move from";
				if(player1.getPiecesOnBoard() > 3)
				{
					pieceID = getID(gui.xRecieved,gui.yRecieved);
				}
				else
				{
					player1.setPhase("flying");
				}
			}
		}
	}
	
	public PointID getID(int xcoord, int ycoord) //returns true if the piece that has been placed is in a mill
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
								return PointID.innerSquare_middleLeft;
							}
							else
							{
								return PointID.innerSquare_bottomLeft;
							}
						}
						else
						{
							return PointID.innerSquare_bottomMiddle;
						}
					}
					else
					{
						if(xcoord < 400)
						{
							return PointID.outerSquare_middleLeft;
						}
						else
						{
							return PointID.middleSquare_middleLeft;
						}
					}
				}
				else
				{
					if(ycoord > 500)
					{
						if(xcoord < 440)
						{   
							return PointID.outerSquare_bottomLeft;

						}
						else
						{
							return PointID.outerSquare_bottomMiddle;
						}
					}
					else
					{
						if(xcoord < 500)
						{
							return PointID.middleSquare_bottomLeft;
						}
						else
						{
							return PointID.middleSquare_bottomMiddle;
						}
					}
				}

			} 
			else
			{
				if(xcoord > 550)
				{
					if(ycoord > 200)
					{
						return PointID.innerSquare_topMiddle;
					}
					else
					{
						if(ycoord > 100)
						{
							return PointID.middleSquare_topMiddle;
						}
						else
						{
							return PointID.outerSquare_topMiddle;
						}
					}
				}
				else
				{
					if(ycoord > 200)
					{
						return PointID.innerSquare_topLeft;
					}
					else
					{
						if (move == "place piece") {
						if(ycoord > 100)
						{
							return PointID.middleSquare_topLeft;
							
						}
						else
						{
							return PointID.outerSquare_topLeft;
						}
					}
					}
				}
			}

		}
		else // x > 600
		{
			if(ycoord > 320)
			{
				if(ycoord < 350)
				{
					if(xcoord < 700)
					{
						return PointID.innerSquare_middleRight;
					}
					else
					{
						if(xcoord < 800)
						{
							return PointID.middleSquare_middleRight;
						}
						else
						{
							return PointID.outerSquare_middleRight;
						}
					}
				}
				else
				{
					if(xcoord < 700)
					{
						if(ycoord < 440)
						{
							return PointID.innerSquare_bottomRight;
						}
						else
						{
							return PointID.middleSquare_bottomRight;
						}
					}
					else
					{
						return PointID.outerSquare_bottomRight;
					}
				}
			}
			else // y < 320
			{
				if(xcoord > 700)
				{
					return PointID.outerSquare_topRight;
				}
				else
				{
					if(ycoord > 200)
					{
						return PointID.innerSquare_topRight;
					}
					else
					{
						return PointID.middleSquare_topRight;
					}
				}
			}
		}
		
	}



	


}
