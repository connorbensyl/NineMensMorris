package sprint1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PlayerTest {
Player testplayer = new Player();
	@Test
	void testPlayerdefaults() {
		testplayer.setName("Connor");
		assertEquals(testplayer.getName(),"Connor");
		assertEquals(testplayer.getinitialPieceCount(),9);
		assertEquals(testplayer.getNumPiecesPlayed(), 0);
		assertEquals(testplayer.getPiecesOnBoard(),0);
		assertEquals(testplayer.getPiecesLeftToPlace(),9);
	
		
	}
	@Test
	void testplaypieceanddecrement()
	{
		testplayer.playPiece();
		assertEquals(testplayer.getNumPiecesPlayed(),1);
		assertEquals(testplayer.getPiecesOnBoard(),1);
		assertEquals(testplayer.getPiecesLeftToPlace(),8);
		testplayer.decrementpiecesOnBoard();
		assertEquals(testplayer.getPiecesOnBoard(),0);
	}
	@Test
	void testincrementgameswon()
	{
		assertEquals(testplayer.getNumGamesWon(),0);
		testplayer.incrementGamesWon();
	    assertEquals(testplayer.getNumGamesWon(),1);
	}
	
	@Test
	void getPiecesLeftToPlace() {
	testplayer.playPiece();
	assertEquals(testplayer.getPiecesLeftToPlace(), 8);
	}
	
	@Test
	void testcanFly()
	{
		assertEquals(testplayer.canFly(),false);
		for (int i=0;i<9;i++) {
			testplayer.playPiece();	
		}
		for (int j=0;j<6;j++) {
			testplayer.decrementpiecesOnBoard();
		}
		assertEquals(testplayer.canFly(), true);
	}

}
