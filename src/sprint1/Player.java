package sprint1;

public class Player {

	private int initialPieceCount = 9;
	private int numPiecesPlayed = 0;
	private int numGamesWon = 0;
	private int piecesOnBoard = 0;
	private boolean canFly;
	private String name;
	
	public Player() {
		canFly = false;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getinitialPieceCount() {
		return initialPieceCount;
	}
	
	public int getNumPiecesPlayed() {
		return numPiecesPlayed;
	}
	
	public int getPiecesLeftToPlace() {
		return (initialPieceCount - numPiecesPlayed);
	}
	public int getPiecesOnBoard() {
		return piecesOnBoard;
	}
	
	public int getNumGamesWon()
	{
		return numGamesWon;
	}
	
	public void setNumPiecesPlayed(int num) 
	{
		this.numPiecesPlayed = num;
	}
	
	
	
	public void setpiecesOnBoard(int num) //for testing reasons so I don't have to decrement 6 times to test flying
	{
		this.piecesOnBoard = num;
	}
	public
	//Can player fly
	
	boolean canFly() {
		int a = getPiecesLeftToPlace();
		if ((a == 0) && (piecesOnBoard == 3 )) {
			return true;
		}
		else{
			return false;
		}
		
	}
	
	
	
	public void playPiece()
	{
		numPiecesPlayed++;
		piecesOnBoard++;
	}
	
	public void decrementpiecesOnBoard()
	{
		piecesOnBoard--;
	}
	
	public void incrementGamesWon()
	{
		numGamesWon++;
	}
	
	

}
