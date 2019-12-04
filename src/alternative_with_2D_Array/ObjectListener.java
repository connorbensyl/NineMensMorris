package alternative_with_2D_Array;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

public class ObjectListener implements MouseListener{

	private List<GameObject> gameObjects;
	private GameGuiCanvas gui;
	
	private GameObject gameObject;
	
	
	
	@Override
	public void mouseClicked(MouseEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent event) {
	
	}

	@Override
	public void mouseReleased(MouseEvent event) {
		int x = event.getPoint().x;
		int y = event.getPoint().y;
		
		for (int i = this.gameObjects.size()-1;i>=0;i--) {
			GameObject gameObject =this.gameObjects.get(i);
		}
		
		if( mouseOverObject(gameObject,x,y)) {
			gameObject.select();
		}
		
	}

	private boolean mouseOverObject(GameObject gameObject, int x, int y) {
		if(  gameObject.getx() < x  
		&&   gameObject.getx() + gameObject.getWidth()  >= x
		&&   gameObject.gety() < y
		&&   gameObject.gety() + gameObject.getHeight() >= y)
			 return true;
		else return false;
	}
	
	@Override
	public void mouseEntered(MouseEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent event) {
		// TODO Auto-generated method stub
		
	}
	
}