package sprint1;

public class Piece 
{
	private int remainingPieces;
	private PieceColor Color;
    enum PieceColor
    {
    	black, white;
    }
    
 Piece(String color)
 {
	 if(color.toLowerCase() == "black")
	 {
		 Color = PieceColor.black;
	 }
	 else if(color.toLowerCase() == "white")
	 {
		 Color = PieceColor.white;
	 }
	 
	 remainingPieces = 9;
 }

 public void decrement_unplayed_pieces()
 {
	 remainingPieces--;
 }
 
 public int getRemainingpieces()
 {
	 return remainingPieces;
 }
}

