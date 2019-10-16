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
		middleSquare.topLeft.set_coords(445, 165);
		middleSquare.middleLeft.set_coords(445, 315);
		middleSquare.bottomLeft.set_coords(445, 465);
		middleSquare.bottomMiddle.set_coords(595, 465);
		middleSquare.bottomRight.set_coords(845,560);
		middleSquare.middleRight.set_coords(745, 315);
		middleSquare.topRight.set_coords(845, 65);
		middleSquare.topMiddle.set_coords(595, 165);
		
		
		//coordinates for points on inner square
		innerSquare.topLeft.set_coords(524, 245);
		innerSquare.middleLeft.set_coords(523, 312);
		innerSquare.bottomLeft.set_coords(525, 392);
		innerSquare.bottomMiddle.set_coords(593, 395);
		innerSquare.bottomRight.set_coords(665, 395);
		innerSquare.middleRight.set_coords(665, 315);
		innerSquare.topRight.set_coords(665, 245);
		innerSquare.topMiddle.set_coords(592,245);
	}
	
	public void possibleMills() {
		
	}
}
