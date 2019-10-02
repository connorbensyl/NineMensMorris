package sprint1;

public class Player {

	public int initialPieceCount = 9;
	public int numPiecesPlayed = 0;
	public int numGamesWon = 0;
	public int piecesOnBoard = 0;
	public boolean canFly;
	public String name;
	
	public Player() {
		
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
	
	public int piecesLeftToPlace() {
		return (initialPieceCount - numPiecesPlayed);
	}
	
	//Can player fly
	
	public boolean canFly() {
		if ((piecesLeftToPlace() == 0) && (piecesOnBoard == 3 )) {
			return true;
		}
		else{
			return false;
		}
		
	}

}
