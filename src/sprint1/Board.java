package sprint1;


import sprint1.Gui1;

public class Board 
{
	
	Point outerSquare_topLeft = new Point(false,true,PointID.outerSquare_topLeft);
	Point outerSquare_middleLeft = new Point(true,false,PointID.outerSquare_middleLeft);
	Point outerSquare_bottomLeft = new Point(false,true,PointID.outerSquare_bottomLeft);
	Point outerSquare_bottomMiddle = new Point(true, false,PointID.outerSquare_bottomMiddle);
	Point outerSquare_bottomRight = new Point(false,true,PointID.outerSquare_bottomRight);
	Point outerSquare_middleRight = new Point(true,false,PointID.outerSquare_middleRight);
	Point outerSquare_topRight = new Point(false,true,PointID.outerSquare_topRight);
	Point outerSquare_topMiddle = new Point(true,false,PointID.outerSquare_topMiddle);
	
	Point middleSquare_topLeft = new Point(false,true,PointID.middleSquare_topLeft);
	Point middleSquare_middleLeft = new Point(true,false,PointID.middleSquare_middleLeft);
	Point middleSquare_bottomLeft = new Point(false,true,PointID.middleSquare_bottomLeft);
	Point middleSquare_bottomMiddle = new Point(true, false,PointID.middleSquare_bottomMiddle);
	Point middleSquare_bottomRight = new Point(false,true,PointID.outerSquare_bottomRight);
	Point middleSquare_middleRight = new Point(true,false,PointID.outerSquare_middleRight);
	Point middleSquare_topRight = new Point(false,true,PointID.middleSquare_topRight);
	Point middleSquare_topMiddle = new Point(true,false,PointID.outerSquare_topMiddle);
	
	Point innerSquare_topLeft = new Point(false,true,PointID.innerSquare_topLeft);
	Point innerSquare_middleLeft = new Point(true,false,PointID.innerSquare_middleLeft);
	Point innerSquare_bottomLeft = new Point(false,true,PointID.innerSquare_bottomLeft);
	Point innerSquare_bottomMiddle = new Point(true, false,PointID.innerSquare_bottomMiddle);
	Point innerSquare_bottomRight = new Point(false,true,PointID.innerSquare_bottomRight);
	Point innerSquare_middleRight = new Point(true,false,PointID.innerSquare_middleRight);
	Point innerSquare_topRight = new Point(false,true,PointID.innerSquare_topRight);
	Point innerSquare_topMiddle = new Point(true,false,PointID.innerSquare_topMiddle);
	
	
	
	public void connectAllPoints() 
	{
		outerSquare_topLeft.setRight(outerSquare_topMiddle);
		outerSquare_topLeft.setDown(outerSquare_middleLeft);
		outerSquare_middleLeft.setDown(outerSquare_bottomLeft);
		outerSquare_middleLeft.setRight(middleSquare_middleLeft);
		outerSquare_bottomLeft.setRight(outerSquare_bottomMiddle);
		outerSquare_bottomMiddle.setUp(middleSquare_bottomMiddle);
		outerSquare_bottomMiddle.setRight(outerSquare_bottomRight);
		outerSquare_bottomRight.setUp(outerSquare_middleRight);
		outerSquare_middleRight.setLeft(middleSquare_middleRight);
		outerSquare_middleRight.setUp(outerSquare_topRight);
		outerSquare_topRight.setLeft(outerSquare_topMiddle);
		outerSquare_topMiddle.setDown(middleSquare_topMiddle);
		
		middleSquare_topLeft.setRight(middleSquare_topMiddle);
		middleSquare_topLeft.setDown(middleSquare_middleLeft);
		middleSquare_middleLeft.setRight(innerSquare_middleLeft);
		middleSquare_middleLeft.setDown(middleSquare_bottomLeft);
		middleSquare_bottomLeft.setRight(middleSquare_bottomMiddle);
		middleSquare_bottomMiddle.setUp(innerSquare_bottomMiddle);
		middleSquare_bottomMiddle.setRight(middleSquare_bottomRight);
		middleSquare_bottomRight.setUp(middleSquare_middleRight);
		middleSquare_middleRight.setLeft(innerSquare_middleRight);
		middleSquare_middleRight.setUp(middleSquare_topRight);
		middleSquare_topRight.setLeft(middleSquare_topMiddle);
		middleSquare_topMiddle.setDown(innerSquare_topMiddle);
		
		innerSquare_topLeft.setRight(innerSquare_topMiddle);
		innerSquare_topLeft.setDown(innerSquare_middleLeft);
		innerSquare_middleLeft.setDown(innerSquare_bottomLeft);
		innerSquare_bottomLeft.setRight(innerSquare_bottomMiddle);
		innerSquare_bottomMiddle.setRight(innerSquare_bottomRight);
		innerSquare_bottomRight.setUp(innerSquare_middleRight);
		innerSquare_middleRight.setUp(innerSquare_topRight);
		innerSquare_topRight.setLeft(innerSquare_topMiddle);
		
		
		
	}
	
	public void setPointCoords()
	{   
		//coordinates for points on outer square
		outerSquare_topLeft.set_coords(345,65);
		outerSquare_middleLeft.set_coords(345,315);
		outerSquare_bottomLeft.set_coords(345,565);
		outerSquare_bottomMiddle.set_coords(595,565);
		outerSquare_bottomRight.set_coords(845,560);
		outerSquare_middleRight.set_coords(845,315);
		outerSquare_topRight.set_coords(845,65);
		outerSquare_topMiddle.set_coords(595,65);
		
		//coordinates for points on middle square
		middleSquare_topLeft.set_coords(445, 165);
		middleSquare_middleLeft.set_coords(445, 315);
		middleSquare_bottomLeft.set_coords(445, 465);
		middleSquare_bottomMiddle.set_coords(595, 465);
		middleSquare_bottomRight.set_coords(745,560);
		middleSquare_middleRight.set_coords(745, 315);
		middleSquare_topRight.set_coords(745, 65);
		middleSquare_topMiddle.set_coords(595, 165);
		
		
		//coordinates for points on inner square
		innerSquare_topLeft.set_coords(524, 245);
		innerSquare_middleLeft.set_coords(523, 312);
		innerSquare_bottomLeft.set_coords(525, 392);
		innerSquare_bottomMiddle.set_coords(593, 395);
		innerSquare_bottomRight.set_coords(665, 395);
		innerSquare_middleRight.set_coords(665, 315);
		innerSquare_topRight.set_coords(665, 245);
		innerSquare_topMiddle.set_coords(592,245);
	}
	
	
	
}
