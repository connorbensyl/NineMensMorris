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
	
	//Can player fly
	
	public void notFly() {
		if(numPieces >= 1) {
			fly = false;
		}
	}
	
	public void canFly() {
		if (numPieces == 0 && numPiecesPlayed == 3) {
			fly = true;
		}
	}
	
	public boolean canPlayerFly() {
		return fly;
	}

}
