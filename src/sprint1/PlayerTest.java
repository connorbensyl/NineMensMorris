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
	
	void testplaypieceanddecrement()
	{
		testplayer.playPiece();
		assertEquals(testplayer.getNumPiecesPlayed(),1);
		assertEquals(testplayer.getPiecesOnBoard(),1);
		assertEquals(testplayer.getPiecesLeftToPlace(),8);
		testplayer.decrementpiecesOnBoard();
		assertEquals(testplayer.getPiecesOnBoard(),0);
	}
	
	void testincrementgameswon()
	{
		assertEquals(testplayer.getNumGamesWon(),0);
		testplayer.incrementGamesWon();
	    assertEquals(testplayer.getNumGamesWon(),1);
	}
	
	void testcanFly()
	{
		assertEquals(testplayer.canFly(),false);
		testplayer.setNumPiecesPlayed(6);
		testplayer.setpiecesOnBoard(3);
		assertEquals(testplayer.canFly(), true);
	}

}
