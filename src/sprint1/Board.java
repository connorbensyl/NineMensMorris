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
	
	
}
