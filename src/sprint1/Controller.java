package sprint1;

public class Controller {

	
	private String Phase;
	private Board board = new Board();
	private Player player1;
	private Player player2;
	boolean is_player1_turn;
	
	public void control_game() 
	{
		player1 = new Player();
		player2 = new Player();
		player1.setName("Jim");
		player2.setName("Billy");
		is_player1_turn = true;
		Phase = "Placing Pieces";
		board.connectAllLocalPoints();
		board.connectIntersquarePoints();
		Point iterate = board.outerSquare.topLeft;
		while(player1.getPiecesLeftToPlace() != 0 && player1.getPiecesLeftToPlace() != 0)
		{
			if(is_player1_turn) //player 1's turn
			{
				
				if(player1.getPiecesLeftToPlace() != 0)
				{
			        //if mouseclick, then the following code
					while(iterate.next != board.innerSquare.topLeft)
					{
						if(iterate.get_xcoord() == mousexcoord && iterate.get_ycoord() == mouseycoord)
						{
							placePiece(player1, iterate);
							player1.playPiece();
							iterate = board.outerSquare.topLeft; // reset point iterate
							//code for updating gui to show black piece here.
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
						if(iterate.get_xcoord() == mousexcoord && iterate.get_ycoord() == mouseycoord)
						{
							placePiece(player2, iterate);
							player2.playPiece();
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
					//player 2 code, call PlacePiece function
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
