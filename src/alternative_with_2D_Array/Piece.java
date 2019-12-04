package alternative_with_2D_Array;


import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Piece extends GameObject {

	Random r = new Random();
	
	public Piece(int x, int y, objectID id) {
		super(x, y, id);
		height = 16;
		width = 16;
	}

	
	public void tick() {
		
	}

	
	public void render(Graphics g) {
		
		g.setColor(Color.black);
		g.fillRect(x,y,width,height);
		
	}

}