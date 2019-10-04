package sprint1;

public class Controller {

	
	private String Phase;
	private Board board = new Board();
	private Player player1;
	private Player player2;
	boolean is_player1_turn;
	
	public void control_game() 
	{
		Phase = "Placing Pieces";
		board.connectAllLocalPoints();
		board.connectIntersquarePoints();
		while(player1.getPiecesLeftToPlace() != 0 && player1.getPiecesLeftToPlace() != 0)
		{
			if(is_player1_turn) //player 1's turn
			{
				
				if(player1.getPiecesLeftToPlace() != 0)
				{
					//player 1 turn code, call placePiece function
				}
				is_player1_turn = false; //pass turn
			}
			else         //player 2's turn
			{
				
				if(player2.getPiecesLeftToPlace() != 0)
				{
					//player 2 code, call PlacePiece function
				}
				is_player1_turn = true; //pass turn
			}
		}
		
		Phase = "Moving Pieces";
		

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

<<<<<<< HEAD
			Player.decrement_unplayed_pieces();

			owner_of_piece.decrementpiecesOnBoard();

=======
			owner_of_piece.playPiece();
>>>>>>> 4991125ef44b27048a86863a8a3ee58c44c34b86
			return "Piece placed";
			
		}
		
	}
	


}
