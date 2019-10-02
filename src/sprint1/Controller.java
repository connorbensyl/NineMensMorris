package sprint1;

public class Controller {

	private String Phase;
	Board board = new Board();
	Piece Player1_Pieces = new Piece("black");
	Piece Player2_Pieces = new Piece("white");
	Player player1;
	Player player2;
	
	public static void main(String[] args) 
	{
		
		board.connectPoints(); //need to change this to connect all local points
		board.connectIntersquarePoints();
		
		

	}
	
	public String placePiece(Piece player, Point location)
	{
		
		if(!location.isEmpty())
		{
			return "Point is already occupied by a piece";
		}
		else
		{
			String color_of_piece = location.get_point_state();
			location.set_point_state(color_of_piece);
			player.decrement_unplayed_pieces();
			return "Piece placed";
			
		}
		
	}
	
	Board get_controller_Board()
	{
		return board;
	}
	
	Piece getplayer1pieces()
	{
		return Player1_Pieces;
	}
	
	Piece getplayer2pieces()
	{
		return Player2_Pieces;
	}
	
	Player getPlayer1()
	{
		return player1;
	}
	
	Player getPlayer2()
	{
		return player2;
	}

}
