package alternative_with_2D_Array;


import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class dummyObject extends GameObject {

	Random r = new Random();
	
	public dummyObject(int x, int y, objectID id) {
		super(x, y, id);
		height = 32;
		width = 32;
	}

	
	public void tick() {
		
	}

	
	public void render(Graphics g) {
		
		g.setColor(Color.red);
		g.fillRect(x,y,width,height);
		
	}

}