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
		player1.setName("Jim");
		player2.setName("Billy");
		is_player1_turn = true;
		board.connectAllLocalPoints();
		board.connectIntersquarePoints();
		board.setSquareCoords();
		
		//piece placement start
		while(player1.getPiecesLeftToPlace() != 0 && player1.getPiecesLeftToPlace() != 0)
		{
			if(is_player1_turn) //player 1's turn
			{
				
				if(player1.getPiecesLeftToPlace() != 0)
				{
					playPiece("black",gui.xRecieved,gui.yRecieved);
					
				}
				is_player1_turn = false; //pass turn
			}
			else         //player 2's turn
			{
				
				if(player2.getPiecesLeftToPlace() != 0)
				{
					playPiece("white",gui.xRecieved,gui.yRecieved);
				}
				is_player1_turn = true; //pass turn
			}
		}
		
		
		}
		

	
	
	public void playPiece(String color, int xcoord, int ycoord)
	{
		
		if(xcoord < 600) {
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
							
						}
						else
						{
							board.innerSquare.bottomLeft.set_point_state(color);
							

						}
					}
					else
					{
						board.innerSquare.bottomMiddle.set_point_state(color);
						
					}
				}
				else
				{
					if(xcoord < 400)
					{
						board.outerSquare.middleLeft.set_point_state(color);
						
					}
					else
					{
						board.middleSquare.middleLeft.set_point_state(color);
						
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
					
					}
					else
					{
						board.outerSquare.bottomMiddle.set_point_state(color);
						
					}
				}
				else
				{
					if(xcoord < 500)
					{
						board.middleSquare.bottomLeft.set_point_state(color);
						
						
					}
					else
					{
						board.middleSquare.bottomMiddle.set_point_state(color);
						
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
					board.innerSquare.topMiddle.set_point_state(color);
					
				}
				else
				{
					if(ycoord > 100)
					{
						board.middleSquare.topMiddle.set_point_state(color);
					}
					else
					{
						board.outerSquare.topMiddle.set_point_state(color);
					}
				}
			}
			else
			{
				if(ycoord > 200)
				{
					board.innerSquare.topLeft.set_point_state(color);
				}
				else
				{
					if(ycoord > 100)
					{
						board.middleSquare.topLeft.set_point_state(color);
					}
					else
					{
						board.outerSquare.topLeft.set_point_state(color);
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
				 board.innerSquare.middleRight.set_point_state(color);
			 }
			 else
			 {
				 if(xcoord < 800)
				 {
					 board.middleSquare.middleRight.set_point_state(color);
				 }
				 else
				 {
					 board.outerSquare.middleRight.set_point_state(color);
				 }
			 }
		 }
		 else
		 {
			 if(xcoord < 700)
			 {
				 if(ycoord < 440)
				 {
					 board.innerSquare.bottomLeft.set_point_state(color);
				 }
				 else
				 {
					 board.middleSquare.bottomLeft.set_point_state(color);
				 }
			 }
			 else
			 {
				 board.outerSquare.bottomLeft.set_point_state(color);
			 }
		 }
	 }
	 else // y < 320
	 {
		 if(xcoord > 700)
		 {
			 board.outerSquare.topRight.set_point_state(color);
		 }
		 else
		 {
			 if(ycoord > 200)
			 {
				 board.innerSquare.topRight.set_point_state(color);
			 }
			 else
			 {
				 board.middleSquare.topRight.set_point_state(color);
			 }
		 }
	 }
	}
	}
	


	


}
