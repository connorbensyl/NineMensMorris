package alternative_with_2D_Array;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.util.Random;


public class Controller extends Canvas implements Runnable{
public static final int WIDTH= 1920, HEIGHT = 1080;
private Thread thread;
boolean running = false;
private Handler handler;
private Player player1;
private Player player2;
boolean is_player1_turn;
private Board board;
Gui1 gui;
Random r;
String moveType = "none";//something
int gridx;
int gridy;

public Controller(Gui1 parentGui) {
	handler = new Handler();
	
	new GameGuiCanvas(WIDTH, HEIGHT, "9-Men's Morris", this);
	Gui1 gui = parentGui;
	
	ObjectListener listener = new ObjectListener(handler.object,this );
	this.addMouseListener(listener);
	
	
	for (int i = 0; i<100;i++) {
		player1 = new Player("black", "Jake");
		player2 = new Player("white", "Jim");
		handler.addObject(new dummyObject(0,0,objectID.dummyObject));
		board = new Board();
		instantiateGame();
		
		
		//piece placement start
		while(player1.getPhase() != "moving pieces" || player2.getPhase() != "moving pieces")
		{
			if(is_player1_turn) //player 1's turn
			{

				if(player1.getPiecesLeftToPlace() != 0)
				{
					gridx = getxCoord(gui.xRecieved);
					gridy = getyCoord(gui.yRecieved);
					
						      playPiece(gridx,gridy,player1.getColor());
						      if(board.CheckForMill(gridx, gridy))
						      {
						    	  gridx = getxCoord(gui.xRecieved);
						    	  gridy = getyCoord(gui.yRecieved);
						    	  if(!board.CheckForMill(gridx, gridy))
						    	  {
						    		  if(board.grid[gridx][gridy].get_point_state() == player2.getColor())
						    		  {
						    		  removeByMill(gridx,gridy);
						    		  player2.decrementpiecesOnBoard();
						    		  }
						    	  }
						    			  
						      }
							
					
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
					gridx = getxCoord(gui.xRecieved);
					gridy = getyCoord(gui.yRecieved);
					
				      playPiece(gridx,gridy,player2.getColor());
				      if(board.CheckForMill(gridx, gridy))
				      {
				    	  gridx = getxCoord(gui.xRecieved);
				    	  gridy = getyCoord(gui.yRecieved);
				    	  if(!board.CheckForMill(gridx, gridy))
				    	  {
				    		  if(board.grid[gridx][gridy].get_point_state() == player1.getColor())
				    		  {
				    		  removeByMill(gridx,gridy);
				    		  player1.decrementpiecesOnBoard();
				    		  }
				    	  }
				    			  
				      }
					
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
		while(player1.getPiecesOnBoard() > 2 && player2.getPiecesOnBoard() > 2)
		{
			
			if(is_player1_turn)
			{
				if(!player1.getCanFly())
				{
					gridx = getxCoord(gui.xRecieved);
					gridy = getyCoord(gui.yRecieved);
					if(board.checkValidMove_noFlying(gridx, gridy, player1))
					{
						playPiece(gridx,gridy,player1.getColor());
					      if(board.CheckForMill(gridx, gridy))
					      {
					    	  gridx = getxCoord(gui.xRecieved);
					    	  gridy = getyCoord(gui.yRecieved);
					    	  if(!board.CheckForMill(gridx, gridy))
					    	  {
					    		  if(board.grid[gridx][gridy].get_point_state() == player2.getColor())
					    		  {
					    		  removeByMill(gridx,gridy);
					    		  player1.decrementpiecesOnBoard();
					    		  }
					    	  }
					    			  
					      }
					}
				}
				else
				{
					gridx = getxCoord(gui.xRecieved);
					gridy = getyCoord(gui.yRecieved);
					if(board.grid[gridx][gridy].get_point_state() == "none")
					{
						playPiece(gridx,gridy,player1.getColor());
						 if(board.CheckForMill(gridx, gridy))
					      {
					    	  gridx = getxCoord(gui.xRecieved); //take in mouseclick for which piece of player 2's player 1 wants to remove
					    	  gridy = getyCoord(gui.yRecieved);
					    	  if(!board.CheckForMill(gridx, gridy))
					    	  {
					    		  if(board.grid[gridx][gridy].get_point_state() == player2.getColor())
					    		  {
					    		  removeByMill(gridx,gridy);
					    		  player2.decrementpiecesOnBoard();
					    		  }
					    	  }
					    			  
					      }
					}
				}
				
				
			}
			else //player 2's turn
			{
				
				if(!player2.canFlyTest())
				{
					gridx = getxCoord(gui.xRecieved);
					gridy = getyCoord(gui.yRecieved);
					if(board.checkValidMove_noFlying(gridx, gridy, player2))
					{
						playPiece(gridx,gridy,player1.getColor());
					      if(board.CheckForMill(gridx, gridy))
					      {
					    	  gridx = getxCoord(gui.xRecieved);
					    	  gridy = getyCoord(gui.yRecieved);
					    	  if(!board.CheckForMill(gridx, gridy))
					    	  {
					    		  if(board.grid[gridx][gridy].get_point_state() == player1.getColor())
					    		  {
					    		  removeByMill(gridx,gridy);
					    		  player1.decrementpiecesOnBoard();
					    		  }
					    	  }
					    			  
					      }
					}
				}
				else
				{
					gridx = getxCoord(gui.xRecieved);
					gridy = getyCoord(gui.yRecieved);
					if(board.grid[gridx][gridy].get_point_state() == "none")
					{
						playPiece(gridx,gridy,player2.getColor());
						 if(board.CheckForMill(gridx, gridy))
					      {
					    	  gridx = getxCoord(gui.xRecieved); //take in mouseclick for which piece of player 1's player 2 wants to remove
					    	  gridy = getyCoord(gui.yRecieved);
					    	  if(!board.CheckForMill(gridx, gridy))
					    	  {
					    		  if(board.grid[gridx][gridy].get_point_state() == player1.getColor())
					    		  {
					    		  removeByMill(gridx,gridy);
					    		  player1.decrementpiecesOnBoard();
					    		  }
					    	  }
					    			  
					      }
					}
				}
			}
		}
	}
		
	}


/*public static void main(String args[]) {
	new Controller();
}*/

private void instantiateGame() {
	player1.setName("Todd");
	player2.setName("Steve");
	player1.setPhase("placing pieces");
	player2.setPhase("placing pieces");
	is_player1_turn = true;
	gridx = -1;
	gridy = -1;
}

public void remove_move(int x, int y, Player player)
{
	if(board.grid[x][y].getUsable() && board.grid[x][y].get_point_state() == player.getColor())
	{
		board.grid[x][y].set_point_state("none");
	}
}
public void removeByMill(int x, int y) 
{
	if(board.grid[x][y].getUsable() && board.grid[x][y].get_point_state() != "none")
	{
		board.grid[x][y].set_point_state("none");
	}
}
protected void playPiece(int x, int y, String color)
{
	if(board.grid[x][y].getUsable())
	{
		if(board.grid[x][y].get_point_state() == "none")
		{
			board.grid[x][y].set_point_state(color);
		}
	}
}
public int getxCoord(int xgui) //take in raw coordinate x value from gui
{
	if(xgui > 330 && xgui < 850) 
	{
		if(xgui > 330 && xgui < 430)//if x is in 0th column
		{
			return 0; //so the x-value on the grid of the point that was clicked is 0
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

@Override
public void run() {
	//game loop start: updates game
	long lastTime = System.nanoTime();
	double amountOfTicks = 60.0;
	double ns = 1000000000/amountOfTicks;
	double delta = 0;
	long timer = System.currentTimeMillis();
	int frames= 0;
	while(running) {
		long now = System.nanoTime();
		delta += (now-lastTime) /ns;
		lastTime = now;
		while(delta >= 1) {
			tick();
			delta--;
		}
		if (running)
			render();
		frames++;
		if (System.currentTimeMillis() - timer > 1000){
			timer+=1000;
			System.out.println("FPS: " + frames);
			frames = 0;
		}
	}
	stop();
}

private void render() {
	BufferStrategy bs = this.getBufferStrategy();
	if (bs ==null) {
		this.createBufferStrategy(3);
		return;
	}
Graphics g = bs.getDrawGraphics();
		
		g.setColor(Color.lightGray);
		g.fillRect(0,0,WIDTH, HEIGHT);
		handler.render(g);
		g.dispose();
		bs.show();
	}


private void tick() {
	handler.tick();
}

public synchronized void start() {
	thread = new Thread(this);
	//this being the current instance of the game class
	thread.start();
	running = true;
}

public synchronized void stop() {
	try {
		thread.join();
		//join kills the thread
		running = false;
	}catch(Exception e) {
		e.printStackTrace();
	}
}
////under construction////
/*
public void main(Strings args[]) {
	new Controller();
}*/

}

