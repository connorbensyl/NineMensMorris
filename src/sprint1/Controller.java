@@ -1,5 +1,6 @@
package sprint1;
public class Controller {

	
	private String Phase;
	private Board board = new Board();
@ -36,7 +37,12 @@ public class Controller {
					{
						if(iterate.get_xcoord() == gui.xRecieved && iterate.get_ycoord() == gui.yRecieved)
						{
<<<<<<< HEAD
							placePiece(player1, iterate);
=======
							
							playPiece(player1, iterate);
>>>>>>> baa7f2af9c50e7fa2f62c0f1475018138d631384
							player1.playPiece();
							if(board.outerSquare.topLeft == iterate)
							{
@ -207,7 +213,7 @@ public class Controller {
							}
							else if(board.middleSquare.topLeft == iterate)
							{
								board.middleSquare.topLeft.set_point_state("white");
							}
							else if(board.middleSquare.middleLeft == iterate)
							{
@ -298,34 +304,50 @@ public class Controller {

	}
	
	public String placePiece(Board board, Player owner_of_piece, int xcoord, int ycoord)
	{
		
		if(xcoord < 600)
		{
			
		if(ycoord < 320)
		{
			
			if(ycoord < 200)
			{
				
			}
			else
			{
				
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
		else
		{
			if(ycoord < 320)
			{
				
			}
			else
			{
				
			}
		}
		owner_of_piece.increment_piece_values();
		return "Piece placed";
	}
	

