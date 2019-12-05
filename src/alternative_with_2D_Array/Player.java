package alternative_with_2D_Array;

import java.awt.Graphics;

public class Player extends GameObject{

	private int initialPieceCount = 9;
	private int numPiecesPlayed = 0;
	private int numGamesWon = 0;
	private int piecesOnBoard = 0;
	private boolean canFly = false;
	private String name;
	private String phase;
	private String color;
	
private String playerPhase ="placing pieces";
	
	public Player(String color, String name){
		super();
		this.color = color;
		this.name = name;
		canFly = false;
		phase = "placing pieces";
	}

	@Override
	public void tick() {
		if (this.canFlyTest()) {
			canFly = true;
		}
		
	}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		
	}
	
	public void setInitialPieceCount(int initialPieceCount) {
		this.initialPieceCount = initialPieceCount;
	}

	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPlayerPhase() {
		return playerPhase;
	}

	public void setPlayerPhase(String playerPhase) {
		this.playerPhase = playerPhase;
	}

	public void setNumGamesWon(int numGamesWon) {
		this.numGamesWon = numGamesWon;
	}

	public void setPiecesOnBoard(int piecesOnBoard) {
		this.piecesOnBoard = piecesOnBoard;
	}
	public int getInitialPieceCount() {
		return initialPieceCount;
	}
	
	public void setPhase(String phase){
		this.phase = phase;
	}
	
	public String getPhase(){
		return this.phase;
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
	
	public int getNumGamesWon(){
		return numGamesWon;
	}
	
	public void setNumPiecesPlayed(int num) {
		this.numPiecesPlayed = num;
	}
	
	public void setpiecesOnBoard(int num) {
		this.piecesOnBoard = num;
	}
	public
	//Can player fly
	
	boolean canFlyTest() {
		int a = getPiecesLeftToPlace();
		if ((a == 0) && (piecesOnBoard == 3 )) {
			return true;
		}
		else{
			return false;
		}	
	}
	
	
	public void increment_after_piece_played(){
		this.piecesOnBoard++;
		this.numPiecesPlayed++;
	}
	
	public void decrementpiecesOnBoard(){
		piecesOnBoard--;
	}
	
	public void incrementGamesWon(){
		numGamesWon++;
	}

	public boolean getCanFly() {
		// TODO Auto-generated method stub
		return false;
	}
}