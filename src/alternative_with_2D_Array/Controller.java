package alternative_with_2D_Array;



public class Controller{
private Player player1;
private Player player2;
boolean is_player1_turn;
private Board board;
Gui1 gui;
public Controller(Gui1 parentGui) {
	Gui1 gui = parentGui;
}
String moveType = "none";
public void control_game(Gui1 controllerGui) 
{
	
	board = new Board();
	player1 = new Player("black");
	player2 = new Player("white");
	player1.setName("Todd");
	player2.setName("Steve");
	player1.setPhase("placing pieces");
	player2.setPhase("placing pieces");
	is_player1_turn = true;
	
	
	//piece placement start
	while(player1.getPhase() != "moving pieces" || player2.getPhase() != "moving pieces")
	{
		if(is_player1_turn) //player 1's turn
		{

			if(player1.getPiecesLeftToPlace() != 0)
			{
				moveType = "place piece";
				playPiece(player1,moveType, gui.xRecieved,gui.yRecieved);
				player1.increment_after_piece_played();
			}
			else
			{
				player1.setPhase("moving pieces");
			}
			is_player1_turn = false; //pass turn
		}
		else         //player 2's turn
		{
			if(player2.getPiecesLeftToPlace() != 0)
			{
				playPiece(player2,moveType,gui.xRecieved,gui.yRecieved);
				player2.increment_after_piece_played();
			}
			else
			{
				player2.setPhase("moving pieces");
			}
			is_player1_turn = true; //pass turn
		}
	}
	//piece movement start
	while(player1.getPhase() != "flying" || player2.getPhase() != "flying")
	{
		moveType = "move from";
		if(is_player1_turn)
		{
			if(player1.getPiecesOnBoard() > 3)
			{
				playPiece(player1, moveType, gui.xRecieved,gui.yRecieved);
			}
			else
			{
				player1.setPhase("flying");
			}
		}
		else //player 2's turn
		{
			moveType = "move from";
			if(player1.getPiecesOnBoard() > 3)
			{
				playPiece(player2, moveType, gui.xRecieved,gui.yRecieved);
			}
			else
			{
				player1.setPhase("flying");
			}
		}
	}
}
}

