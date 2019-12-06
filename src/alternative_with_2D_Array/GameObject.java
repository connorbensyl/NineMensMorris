package alternative_with_2D_Array;


import java.awt.Graphics;

public abstract class GameObject {

	protected int x,y,height,width;
	protected objectID id;
	boolean selected = false;
	
	public GameObject() {
		
	}
	
	public GameObject(int x, int y, objectID id) {
		this.x = x;
		this.y=y;
		this.id=id;
	}
	


	public abstract void tick();
	public abstract void render(Graphics g);

	public int getx() {
		return x;
	}

	public void setx(int x) {
		this.x = x;
	}

	public int gety() {
		return y;
	}

	public void sety(int y) {
		this.y = y;
	}

	public void setCoords(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public objectID getId() {
		return id;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setId(objectID id) {
		this.id = id;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
	
	public void select() {
		selected = true;
	}
	
	public void deselect() {
		selected = false;
	}
}
