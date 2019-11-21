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
public int getxCoord(int xgui) //take in raw coordinate x value from gui
{
	if(xgui > 330 && xgui < 850) 
	{
		if(xgui > 330 && xgui < 430)//if x is in 0th column
		{
			return 0; //so the xvalue on the grid of the point that was clicked is 0
		}
		else if(xgui > 430 && xgui < 509)//if x is in 1st column...etc. I add some margin of error so it's not exactly the same as the point coordinates, this will probably need to be adjusted
		{
			return 1; 
		}
		else if(xgui > 509 && xgui < 580)
		{
			return 2;
		}
		else if(xgui > 580 && xgui < 650)
		{
			return 3;
		}
		else if(xgui > 650 && xgui < 730)
		{
			return 4;
		}
		else if(xgui > 730 && xgui < 830)
		{
			return 5;
		}
		else if(xgui > 830 && xgui < 850)
		{
			return 6;
		}
	}
	return -1; // if -1 is returned then they clicked outside the bounds to the left or right
}

public int getyCoord(int ygui)
{
	if(ygui < 580 && ygui > 30)
	{
		if(ygui > 450 && ygui < 580)
		{
			return 0;
		}
		else if(ygui > 377 && ygui < 450)
		{
			return 1;
		}
		else if(ygui > 300 && ygui < 377)
		{
			return 2;
		}
		else if(ygui > 230 && ygui < 300)
		{
			return 3;
		}
		else if(ygui > 150 && ygui < 230)
		{
			return 4;
		}
		else if(ygui > 50 && ygui < 150)
		{
			return 5;
		}
		else if(ygui > 30 && ygui < 50)
		{
			return 6;
		}
		
	}
	return -1; //if -1 is returned then the player clicked outside the bounds on the top or bottom
}

}

