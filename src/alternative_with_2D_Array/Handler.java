package alternative_with_2D_Array;

import java.awt.Graphics;
import java.util.LinkedList;

public class Handler {
//maintains, updates, and renders objects
	
	LinkedList<GameObject> object = new LinkedList<GameObject>();
	
	public void tick() {
		for (int i=0;i<object.size();i++) {
			GameObject tempObject = object.get(i);
			//gets id of current object in linked list
			tempObject.tick();
		}
		
	}

	public void render(Graphics g) {
		for (int i = 0;i<object.size();i++) {
			GameObject tempObject = object.get(i);
			//gets id of current object in linked list
			tempObject.render(g);
		}
		
	}
	
	public void addObject(GameObject object) {
		this.object.add(object);
	}
	
	public void removeObject(GameObject object) {
		this.object.remove(object);
	}
}
