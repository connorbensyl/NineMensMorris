package sprint1;
public class Controller {
	
	
	private Board board = new Board();
	private Player player1;
	private Player player2;
	boolean is_player1_turn;
	Gui1 gui;
	public Controller(Gui1 parentGui) {
		Gui1 gui = parentGui;
	}
	
	public void control_game(Gui1 controllerGui) 
	{
		player1 = new Player();
		player2 = new Player();
		player1.setName("Todd");
		player2.setName("Steve");
		player1.setPhase("placing pieces");
		player2.setPhase("placing pieces");
		is_player1_turn = true;
		board.connectAllLocalPoints();
		board.connectIntersquarePoints();
		board.setSquareCoords();
		
		//piece placement start
		while(player1.getPhase() != "moving pieces" || player2.getPhase() != "moving pieces")
		{
			if(is_player1_turn) //player 1's turn
			{
				
				if(player1.getPiecesLeftToPlace() != 0)
				{
					playPiece("black",gui.xRecieved,gui.yRecieved);
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
					playPiece("white",gui.xRecieved,gui.yRecieved);
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
			if(is_player1_turn)
			{
				if(player1.getPiecesOnBoard() > 3)
				{
					
				}
				else
				{
					player1.setPhase("flying");
				}
			}
		}
		
		
		}
		

	
	
	public boolean playPiece(String color, int xcoord, int ycoord) //returns true if the piece that has been placed is in a mill
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
							if(board.innerSquare.middleLeft.isEmpty()) 
							{
							board.innerSquare.middleLeft.set_point_state(color);
							return board.innerSquare.middleLeft.isPartOfMill();
							}
						}
						else
						{
							if(board.innerSquare.bottomLeft.isEmpty()) 
							{
							board.innerSquare.bottomLeft.set_point_state(color);
							return board.innerSquare.bottomLeft.isPartOfMill();
							}
						}
					}
					else
					{
						if(board.innerSquare.bottomMiddle.isEmpty()) 
					{
						board.innerSquare.bottomMiddle.set_point_state(color);
						return board.innerSquare.bottomMiddle.isPartOfMill();
					}
						
					}
				}
				else
				{
					if(xcoord < 400)
					{
						if(board.outerSquare.middleLeft.isEmpty()) 
						{
						board.outerSquare.middleLeft.set_point_state(color);
						return board.outerSquare.middleLeft.isPartOfMill();
						}
					}
					else
					{
						if(board.middleSquare.middleLeft.isEmpty()) 
						{
						board.middleSquare.middleLeft.set_point_state(color);
						return board.middleSquare.middleLeft.isPartOfMill();
						}
					}
				}
			}
			else
			{
				if(ycoord > 500)
				{
					if(xcoord < 440)
					{   
						if(board.outerSquare.bottomLeft.isEmpty()) 
					{
						board.outerSquare.bottomLeft.set_point_state(color);
						return board.outerSquare.bottomLeft.isPartOfMill();
					}
						
					}
					else
					{
						if(board.outerSquare.bottomMiddle.isEmpty()) 
						{
						board.outerSquare.bottomMiddle.set_point_state(color);
						return board.outerSquare.bottomMiddle.isPartOfMill();
						}
						
					}
				}
				else
				{
					if(xcoord < 500)
					{
						if(board.middleSquare.bottomLeft.isEmpty()) 
						{
						board.middleSquare.bottomLeft.set_point_state(color);
						return board.middleSquare.bottomLeft.isPartOfMill();
						}
						
						
					}
					else
					{
						if(board.middleSquare.bottomMiddle.isEmpty()) 
						{
						board.middleSquare.bottomMiddle.set_point_state(color);
						return board.middleSquare.bottomMiddle.isPartOfMill();
						}
						
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
					if(board.innerSquare.topMiddle.isEmpty()) 
					{
					board.innerSquare.topMiddle.set_point_state(color);
					return board.innerSquare.topMiddle.isPartOfMill();
					}
					
				}
				else
				{
					if(ycoord > 100)
					{
						if(board.middleSquare.topMiddle.isEmpty())
						{
						board.middleSquare.topMiddle.set_point_state(color);
						return board.middleSquare.topMiddle.isPartOfMill();
						}
					}
					else
					{
						if(board.outerSquare.topMiddle.isEmpty())
						{
						board.outerSquare.topMiddle.set_point_state(color);
						return board.outerSquare.topMiddle.isPartOfMill();
						}
					}
				}
			}
			else
			{
				if(ycoord > 200)
				{
					if(board.innerSquare.topLeft.isEmpty())
					{
					board.innerSquare.topLeft.set_point_state(color);
					board.innerSquare.topLeft.isPartOfMill();
					}
				}
				else
				{
					if(ycoord > 100)
					{
						board.middleSquare.topLeft.set_point_state(color);
						return board.middleSquare.topLeft.isPartOfMill();
					}
					else
					{
						board.outerSquare.topLeft.set_point_state(color);
						return board.outerSquare.topLeft.isPartOfMill();
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
				 if(board.innerSquare.middleRight.isEmpty()) 
				 {
				 board.innerSquare.middleRight.set_point_state(color);
				 return board.innerSquare.middleRight.isPartOfMill();
				 }
			 }
			 else
			 {
				 if(xcoord < 800)
				 {
					 if(board.middleSquare.middleRight.isEmpty()) 
					 {
					 board.middleSquare.middleRight.set_point_state(color);
					 return board.middleSquare.middleRight.isPartOfMill();
					 }
				 }
				 else
				 {
					 if(board.outerSquare.middleRight.isEmpty())
					 {
					 board.outerSquare.middleRight.set_point_state(color);
					 return board.outerSquare.middleRight.isPartOfMill();
					 }
				 }
			 }
		 }
		 else
		 {
			 if(xcoord < 700)
			 {
				 if(ycoord < 440)
				 {
					 if(board.innerSquare.bottomLeft.isEmpty()) 
					 {
					 board.innerSquare.bottomLeft.set_point_state(color);
					 return board.innerSquare.bottomLeft.isPartOfMill();
					 }
				 }
				 else
				 {
					 if(board.middleSquare.bottomLeft.isEmpty())
					 {
					 board.middleSquare.bottomLeft.set_point_state(color);
					 return board.middleSquare.bottomLeft.isPartOfMill();
					 }
				 }
			 }
			 else
			 {
				 if(board.outerSquare.bottomLeft.isEmpty()) 
				 {
				 board.outerSquare.bottomLeft.set_point_state(color);
				 return board.outerSquare.bottomLeft.isPartOfMill();
				 }
			 }
		 }
	 }
	 else // y < 320
	 {
		 if(xcoord > 700)
		 {
			 if(board.outerSquare.topRight.isEmpty()) 
			 {
			 board.outerSquare.topRight.set_point_state(color);
			 return board.outerSquare.topRight.isPartOfMill();
			 }
		 }
		 else
		 {
			 if(ycoord > 200)
			 {
				 if(board.innerSquare.topRight.isEmpty()) 
				 {
				 board.innerSquare.topRight.set_point_state(color);
				 return board.innerSquare.topRight.isPartOfMill();
				 }
			 }
			 else
			 {
				 if(board.middleSquare.topRight.isEmpty()) 
				 {
				 board.middleSquare.topRight.set_point_state(color);
				 return board.middleSquare.topRight.isPartOfMill();
				 }
			 }
		 }
	 }
	}
		return false;
	}
	
	
	
	public void removePiece(String color, int xcoord, int ycoord)
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
							//cannot remove a piece from a point that is already empty, cannot remove your own piece, and cannot remove a piece that is in a mill
							if(board.innerSquare.middleLeft.get_point_state() != "none" && board.innerSquare.middleLeft.get_point_state() != color && !board.innerSquare.middleLeft.isPartOfMill()) 
							{
								
							board.innerSquare.middleLeft.set_point_state("none");
							}
							
						}
						else
						{
							if(board.innerSquare.bottomLeft.get_point_state() != "none" && board.innerSquare.bottomLeft.get_point_state() != color && !board.innerSquare.bottomLeft.isPartOfMill()) 
							{
								board.innerSquare.bottomLeft.set_point_state("none");
							}
							
							

						}
					}
					else
					{
						if(board.innerSquare.bottomMiddle.get_point_state() != "none" && board.innerSquare.bottomMiddle.get_point_state() != color && !board.innerSquare.bottomMiddle.isPartOfMill()) 
						{
							board.innerSquare.bottomMiddle.set_point_state("none");
						}
						
						
					}
				}
				else
				{
					if(xcoord < 400)
					{
						if(board.outerSquare.middleLeft.get_point_state() != "none" && board.outerSquare.middleLeft.get_point_state() != color && !board.outerSquare.middleLeft.isPartOfMill()) 
						{
							board.outerSquare.middleLeft.set_point_state("none");
						}
						
						
					}
					else
					{
						if(board.middleSquare.middleLeft.get_point_state() != "none" && board.middleSquare.middleLeft.get_point_state() != color && !board.middleSquare.middleLeft.isPartOfMill()) 
						{
							board.middleSquare.middleLeft.set_point_state("none");
						}
						
						
					}
				}
			}
			else
			{
				if(ycoord > 500)
				{
					if(xcoord < 440)
					{
						if(board.outerSquare.bottomLeft.get_point_state() != "none" && board.outerSquare.bottomLeft.get_point_state() != color && !board.outerSquare.bottomLeft.isPartOfMill()) 
						{
							board.outerSquare.bottomLeft.set_point_state("none");
						}
						
					
					}
					else
					{
						if(board.outerSquare.bottomMiddle.get_point_state() != "none" && board.outerSquare.bottomMiddle.get_point_state() != color && !board.outerSquare.bottomMiddle.isPartOfMill()) 
						{
							board.outerSquare.bottomMiddle.set_point_state("none");
						}
						
						
					}
				}
				else
				{
					if(xcoord < 500)
					{
						if(board.middleSquare.bottomLeft.get_point_state() != "none" && board.middleSquare.bottomLeft.get_point_state() != color && !board.middleSquare.bottomLeft.isPartOfMill()) 
						{
							board.middleSquare.bottomLeft.set_point_state("none");
						}
						
						
						
					}
					else
					{
						if(board.middleSquare.bottomMiddle.get_point_state() != "none" && board.middleSquare.bottomMiddle.get_point_state() != color && !board.middleSquare.bottomMiddle.isPartOfMill()) 
						{
							board.middleSquare.bottomMiddle.set_point_state("none");
						}
						
					
						
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
					if(board.innerSquare.topMiddle.get_point_state() != "none" && board.innerSquare.topMiddle.get_point_state() != color && !board.innerSquare.topMiddle.isPartOfMill()) 
					{
						board.innerSquare.topMiddle.set_point_state("none");
					}
					
				
					
				}
				else
				{
					if(ycoord > 100)
					{
						if(board.middleSquare.topMiddle.get_point_state() != "none" && board.middleSquare.topMiddle.get_point_state() != color && !board.middleSquare.topMiddle.isPartOfMill()) 
						{
							board.middleSquare.topMiddle.set_point_state("none");
						}
						
					}
					else
					{
						if(board.outerSquare.topMiddle.get_point_state() != "none" && board.outerSquare.topMiddle.get_point_state() != color && !board.outerSquare.topMiddle.isPartOfMill()) 
						{
							board.outerSquare.topMiddle.set_point_state("none");
						}
						
					}
				}
			}
			else
			{
				if(ycoord > 200)
				{
					if(board.innerSquare.topLeft.get_point_state() != "none" && board.innerSquare.topLeft.get_point_state() != color && !board.innerSquare.topLeft.isPartOfMill()) 
					{
						board.innerSquare.topLeft.set_point_state("none");
					}
					
				}
				else
				{
					if(ycoord > 100)
					{
						if(board.middleSquare.topLeft.get_point_state() != "none" && board.middleSquare.topLeft.get_point_state() != color && !board.middleSquare.topLeft.isPartOfMill()) 
						{
							board.middleSquare.topLeft.set_point_state("none");
						}
						
					}
					else
					{
						if(board.outerSquare.topLeft.get_point_state() != "none" && board.outerSquare.topLeft.get_point_state() != color && !board.outerSquare.topLeft.isPartOfMill()) 
						{
							board.outerSquare.topLeft.set_point_state("none");
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
				 if(board.innerSquare.middleRight.get_point_state() != "none" && board.innerSquare.middleRight.get_point_state() != color && !board.innerSquare.middleRight.isPartOfMill()) 
					{
						board.innerSquare.middleRight.set_point_state("none");
					}
				
			 }
			 else
			 {
				 if(xcoord < 800)
				 {
					 if(board.middleSquare.middleRight.get_point_state() != "none" && board.middleSquare.middleRight.get_point_state() != color && !board.middleSquare.middleRight.isPartOfMill()) 
						{
							board.middleSquare.middleRight.set_point_state("none");
						}
					
				 }
				 else
				 {
					 if(board.outerSquare.middleRight.get_point_state() != "none" && board.outerSquare.middleRight.get_point_state() != color && !board.outerSquare.middleRight.isPartOfMill()) 
						{
							board.outerSquare.middleRight.set_point_state("none");
						}
					
				 }
			 }
		 }
		 else
		 {
			 if(xcoord < 700)
			 {
				 if(ycoord < 440)
				 {
					 if(board.innerSquare.bottomLeft.get_point_state() != "none" && board.innerSquare.bottomLeft.get_point_state() != color && !board.innerSquare.bottomLeft.isPartOfMill()) 
						{
							board.innerSquare.bottomLeft.set_point_state("none");
						}
					
				 }
				 else
				 {
					 if(board.middleSquare.bottomLeft.get_point_state() != "none" && board.middleSquare.bottomLeft.get_point_state() != color && !board.middleSquare.bottomLeft.isPartOfMill()) 
						{
							board.middleSquare.bottomLeft.set_point_state("none");
						}
					
				 }
			 }
			 else
			 {
				 if(board.outerSquare.bottomLeft.get_point_state() != "none" && board.outerSquare.bottomLeft.get_point_state() != color && !board.outerSquare.bottomLeft.isPartOfMill()) 
					{
						board.outerSquare.bottomLeft.set_point_state("none");
					}
				 
			 }
		 }
	 }
	 else // y < 320
	 {
		 if(xcoord > 700)
		 {
			 if(board.outerSquare.topRight.get_point_state() != "none" && board.outerSquare.topRight.get_point_state() != color && !board.outerSquare.topRight.isPartOfMill()) 
				{
					board.outerSquare.topRight.set_point_state("none");
				}
			 
		 }
		 else
		 {
			 if(ycoord > 200)
			 {
				 if(board.innerSquare.topRight.get_point_state() != "none" && board.innerSquare.topRight.get_point_state() != color && !board.innerSquare.topRight.isPartOfMill()) 
					{
						board.innerSquare.topRight.set_point_state("none");
					}
				
			 }
			 else
			 {
				 if(board.middleSquare.topRight.get_point_state() != "none" && board.middleSquare.topRight.get_point_state() != color && !board.middleSquare.topRight.isPartOfMill()) 
					{
						board.middleSquare.topRight.set_point_state("none");
					}
				 
			 }
		 }
	 }
	}
	
	}

	


}
