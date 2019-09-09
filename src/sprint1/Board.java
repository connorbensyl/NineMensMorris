

public class Board 
{

	private static final int TotalRows = 7;
	private static final int TotalColumns = 7;
	public enum Cell{
		EMPTY, CROSS, NOUGHT
	}
	
	private Cell [][]grid;
	
	public Board() {
		grid = new Cell[TotalRows][TotalColumns];
		initBoard();
	}
	
	public void initBoard() {
		for (int row = 0; row < TotalRows; ++row) {
			
		}
	}
}
