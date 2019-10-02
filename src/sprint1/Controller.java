package sprint1;

public class Controller {

	public static void main(String[] args) 
	{
		Board board = new Board();
		Piece Player1_Pieces = new Piece("black");
		Piece Player2_Pieces = new Piece("white");
		
		// TODO Auto-generated method stub

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
			player.removePiece();
			return "Piece placed";
		}
		
	}

}
