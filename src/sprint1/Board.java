package sprint1;


import sprint1.Gui1;


public class Board 
{
	Square outerSquare = new Square();
	Square middleSquare = new Square();
	Square innerSquare = new Square();
	
	public void connectIntersquarePoints() {
		//outer square + middle square connect
		outerSquare.topMiddle.setDown(middleSquare.topMiddle);
		middleSquare.topMiddle.setUp(outerSquare.topMiddle);
		
		outerSquare.middleLeft.setRight(middleSquare.middleLeft);
		middleSquare.middleLeft.setLeft(outerSquare.middleLeft);
		
		outerSquare.bottomMiddle.setUp(middleSquare.bottomMiddle);
		middleSquare.bottomMiddle.setDown(outerSquare.bottomMiddle);
		
		outerSquare.middleRight.setLeft(middleSquare.middleRight);
		middleSquare.middleRight.setRight(outerSquare.middleRight);
		
		//middle square + inner square connect
		middleSquare.topMiddle.setDown(innerSquare.topMiddle);
		innerSquare.topMiddle.setUp(middleSquare.topMiddle);
		
		middleSquare.middleLeft.setRight(innerSquare.middleLeft);
		innerSquare.middleLeft.setLeft(middleSquare.middleLeft);
		
		middleSquare.bottomMiddle.setUp(innerSquare.bottomMiddle);
		innerSquare.bottomMiddle.setDown(middleSquare.bottomMiddle);
		
		middleSquare.middleRight.setLeft(innerSquare.middleRight);
		innerSquare.middleRight.setRight(middleSquare.middleRight);
	}
	
	public void connectAllLocalPoints() {
		outerSquare.connectLocalPoints();
		middleSquare.connectLocalPoints();
		innerSquare.connectLocalPoints();
	}
	
	public void setSquareCoords()
	{   
		
		//coordinates for points on outer square
		outerSquare.topLeft.set_coords(345,65);
		outerSquare.middleLeft.set_coords(345,315);
		outerSquare.bottomLeft.set_coords(345,565);
		outerSquare.bottomMiddle.set_coords(595,565);
		outerSquare.bottomRight.set_coords(845,560);
		outerSquare.middleRight.set_coords(845,315);
		outerSquare.topRight.set_coords(845,65);
		outerSquare.topMiddle.set_coords(595,65);
		
		//coordinates for points on middle square
		middleSquare.topLeft.set_coords(450, 170);
		middleSquare.middleLeft.set_coords(450, 320);
		middleSquare.bottomLeft.set_coords(450, 470);
		middleSquare.bottomMiddle.set_coords(600,490);
		middleSquare.bottomRight.set_coords(750,480);
		middleSquare.middleRight.set_coords(765, 320);
		middleSquare.topRight.set_coords(750, 170);
		middleSquare.topMiddle.set_coords(600, 95);
		
		//coordinates for points on inner square
		innerSquare.topLeft.set_coords(550, 270);
		innerSquare.middleLeft.set_coords(550, 320);
		innerSquare.bottomLeft.set_coords(550, 370);
		innerSquare.bottomMiddle.set_coords(600, 400);
		innerSquare.bottomRight.set_coords(670, 380);
		innerSquare.middleRight.set_coords(670, 320);
		innerSquare.topRight.set_coords(670, 270);
	}
	
	
}
