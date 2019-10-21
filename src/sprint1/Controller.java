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
		Phase = "Placing Pieces";
		board.connectAllLocalPoints();
		board.connectIntersquarePoints();
		board.setSquareCoords();
		Point iterate = board.outerSquare.topLeft;
		//piece placement start
		while(player1.getPiecesLeftToPlace() != 0 && player1.getPiecesLeftToPlace() != 0)
		{
			if(is_player1_turn) //player 1's turn
			{
				//player.placepiece(board)
				if(player1.getPiecesLeftToPlace() != 0)
				{
			        //if mouseclick, then the following code
					while(iterate.next != board.innerSquare.topLeft)
					{
						if(iterate.get_xcoord() == gui.xRecieved && iterate.get_ycoord() == gui.yRecieved)
						{
							placePiece(player1, iterate);
							player1.playPiece();
							if(board.outerSquare.topLeft == iterate)
							{
								board.outerSquare.topLeft.set_point_state("black");
							}
							else if(board.outerSquare.middleLeft == iterate)
							{
								board.outerSquare.middleLeft.set_point_state("black");
							}
							else if(board.outerSquare.bottomLeft == iterate)
							{
								board.outerSquare.bottomLeft.set_point_state("black");
							}
							else if(board.outerSquare.bottomMiddle == iterate)
							{
								board.outerSquare.bottomMiddle.set_point_state("black");
							}
							else if(board.outerSquare.bottomRight == iterate)
							{
								board.outerSquare.bottomRight.set_point_state("black");
							}
							else if(board.outerSquare.middleRight == iterate)
							{
								board.outerSquare.middleRight.set_point_state("black");
							}
							else if(board.outerSquare.topRight == iterate)
							{
								board.outerSquare.topRight.set_point_state("black");
							}
							else if(board.outerSquare.topMiddle == iterate)
							{
								board.outerSquare.topMiddle.set_point_state("black");
							}
							else if(board.middleSquare.topLeft == iterate)
							{
								board.middleSquare.topLeft.set_point_state("black");
							}
							else if(board.middleSquare.middleLeft == iterate)
							{
								board.middleSquare.middleLeft.set_point_state("black");
							}
							else if(board.middleSquare.bottomLeft == iterate)
							{
								board.middleSquare.bottomLeft.set_point_state("black");
							}
							else if(board.middleSquare.bottomMiddle == iterate)
							{
								board.middleSquare.bottomMiddle.set_point_state("black");
							}
							else if(board.middleSquare.bottomRight == iterate)
							{
								board.middleSquare.bottomRight.set_point_state("black");
							}
							else if(board.middleSquare.middleRight == iterate)
							{
								board.middleSquare.middleRight.set_point_state("black");
							}
							else if(board.middleSquare.topRight == iterate)
							{
								board.middleSquare.topRight.set_point_state("black");
							}
							else if(board.middleSquare.topMiddle == iterate)
							{
								board.middleSquare.topMiddle.set_point_state("black");
							}
							if(board.innerSquare.topLeft == iterate)
							{
								board.innerSquare.topLeft.set_point_state("black");
							}
							else if(board.innerSquare.middleLeft == iterate)
							{
								board.innerSquare.middleLeft.set_point_state("black");
							}
							else if(board.innerSquare.bottomLeft == iterate)
							{
								board.innerSquare.bottomLeft.set_point_state("black");
							}
							else if(board.innerSquare.bottomMiddle == iterate)
							{
								board.innerSquare.bottomMiddle.set_point_state("black");
							}
							else if(board.innerSquare.bottomRight == iterate)
							{
								board.innerSquare.bottomRight.set_point_state("black");
							}
							else if(board.innerSquare.middleRight == iterate)
							{
								board.innerSquare.middleRight.set_point_state("black");
							}
							else if(board.innerSquare.topRight == iterate)
							{
								board.innerSquare.topRight.set_point_state("black");
							}
							else if(board.innerSquare.topMiddle == iterate)
							{
								board.innerSquare.topMiddle.set_point_state("black");
							}
							
							
							
							iterate = board.outerSquare.topLeft;
							// reset point iterate
							//code for updating gui to show black piece here.
							//mousexcoord and mouseycoord are placeholders because I'm not sure how mouseevents work with the gui - Connor
						}
						
						
						
						if(iterate.next == board.outerSquare.topLeft)
						{
							iterate = board.middleSquare.topLeft;
						}
						
						if(iterate.next == board.middleSquare.topLeft)
						{
							iterate = board.innerSquare.topLeft;
						}
						
						iterate = iterate.next;
					}
					
				}
				is_player1_turn = false; //pass turn
			}
			else         //player 2's turn
			{
				
				if(player2.getPiecesLeftToPlace() != 0)
				{
					//if mouseclick, then the following code
					while(iterate.next != board.innerSquare.topLeft)
					{
						if(iterate.get_xcoord() == gui.xRecieved && iterate.get_ycoord() == gui.yRecieved)
						{
							placePiece(player2, iterate);
							player2.playPiece();
							if(board.outerSquare.topLeft == iterate)
							{
								board.outerSquare.topLeft.set_point_state("white");
							}
							else if(board.outerSquare.middleLeft == iterate)
							{
								board.outerSquare.middleLeft.set_point_state("white");
							}
							else if(board.outerSquare.bottomLeft == iterate)
							{
								board.outerSquare.bottomLeft.set_point_state("white");
							}
							else if(board.outerSquare.bottomMiddle == iterate)
							{
								board.outerSquare.bottomMiddle.set_point_state("white");
							}
							else if(board.outerSquare.bottomRight == iterate)
							{
								board.outerSquare.bottomRight.set_point_state("white");
							}
							else if(board.outerSquare.middleRight == iterate)
							{
								board.outerSquare.middleRight.set_point_state("white");
							}
							else if(board.outerSquare.topRight == iterate)
							{
								board.outerSquare.topRight.set_point_state("white");
							}
							else if(board.outerSquare.topMiddle == iterate)
							{
								board.outerSquare.topMiddle.set_point_state("white");
							}
							else if(board.middleSquare.topLeft == iterate)
							{
								board.middleSquare.topLeft.set_point_state("black");
							}
							else if(board.middleSquare.middleLeft == iterate)
							{
								board.middleSquare.middleLeft.set_point_state("white");
							}
							else if(board.middleSquare.bottomLeft == iterate)
							{
								board.middleSquare.bottomLeft.set_point_state("white");
							}
							else if(board.middleSquare.bottomMiddle == iterate)
							{
								board.middleSquare.bottomMiddle.set_point_state("white");
							}
							else if(board.middleSquare.bottomRight == iterate)
							{
								board.middleSquare.bottomRight.set_point_state("white");
							}
							else if(board.middleSquare.middleRight == iterate)
							{
								board.middleSquare.middleRight.set_point_state("white");
							}
							else if(board.middleSquare.topRight == iterate)
							{
								board.middleSquare.topRight.set_point_state("white");
							}
							else if(board.middleSquare.topMiddle == iterate)
							{
								board.middleSquare.topMiddle.set_point_state("white");
							}
							if(board.innerSquare.topLeft == iterate)
							{
								board.innerSquare.topLeft.set_point_state("white");
							}
							else if(board.innerSquare.middleLeft == iterate)
							{
								board.innerSquare.middleLeft.set_point_state("white");
							}
							else if(board.innerSquare.bottomLeft == iterate)
							{
								board.innerSquare.bottomLeft.set_point_state("white");
							}
							else if(board.innerSquare.bottomMiddle == iterate)
							{
								board.innerSquare.bottomMiddle.set_point_state("white");
							}
							else if(board.innerSquare.bottomRight == iterate)
							{
								board.innerSquare.bottomRight.set_point_state("white");
							}
							else if(board.innerSquare.middleRight == iterate)
							{
								board.innerSquare.middleRight.set_point_state("white");
							}
							else if(board.innerSquare.topRight == iterate)
							{
								board.innerSquare.topRight.set_point_state("white");
							}
							else if(board.innerSquare.topMiddle == iterate)
							{
								board.innerSquare.topMiddle.set_point_state("white");
							}
							iterate = board.outerSquare.topLeft; // reset point iterate
							//code for updating gui to show white piece here.
							//mousexcoord and mouseycoord are placeholders because I'm not sure how mouseevents work with the gui - Connor
							
						}
						
						iterate = iterate.next;
						
						if(iterate.next == board.outerSquare.topLeft)
						{
							iterate = board.middleSquare.topLeft;
						}
						
						if(iterate.next == board.middleSquare.topLeft)
						{
							iterate = board.innerSquare.topLeft;
						}
					
				}
				is_player1_turn = true; //pass turn
			}
		}
		
		Phase = "Moving Pieces";
		}
		

	}
	
	public String placePiece(Player owner_of_piece, Point location)
	{
		
		if(!location.isEmpty())
		{
			return "Point is already occupied by a piece";
		}
		else
		{
			String color_of_piece = location.get_point_state();
			location.set_point_state(color_of_piece);







			owner_of_piece.decrementpiecesOnBoard();
			owner_of_piece.playPiece();



			return "Piece placed";
			
		}
		
	}
	


}
