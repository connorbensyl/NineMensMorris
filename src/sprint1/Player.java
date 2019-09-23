package sprint1;

public class Player {

	public int numPieces;
	public int numPiecesPlayed;
	public int numGamesWon;
	public boolean fly;
	public String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getNumPieces() {
		return numPieces;
	}
	
	public int getNumPiecesPlayed() {
		return numPiecesPlayed;
	}
	
	public int piecesLeft() {
		return (numPieces - numPiecesPlayed);
	}
	
	public boolean canFly() {
		return fly;
	}

}
