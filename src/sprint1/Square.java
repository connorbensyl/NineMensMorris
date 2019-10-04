package sprint1;

import sprint1.Point;

public class Square 
{
	int tempx;
	int tempy;
  Point topLeft = new Point(true,false, tempx, tempy); //arguments isCorner = true, isMidpoint = false
  Point middleLeft = new Point(false,true, tempx, tempy); //arguments alternate, isCorner = false, isMidpoint = true
  Point bottomLeft = new Point(true, false, tempx, tempy);
  Point bottomMiddle = new Point(false,true, tempx, tempy);
  Point bottomRight = new Point(true, false, tempx, tempy);
  Point middleRight = new Point(false,true, tempx,tempy);
  Point topRight = new Point(true,false, tempx, tempy);
  Point topMiddle = new Point(false,true,tempx,tempy);

  public void connectLocalPoints() {
		topLeft.setRight(topMiddle);
		topLeft.setDown(middleLeft);
		topMiddle.setLeft(topLeft);
		topMiddle.setRight(topRight);
		topRight.setLeft(topMiddle);
		topRight.setDown(middleRight);
		middleLeft.setUp(topLeft);
		middleLeft.setDown(bottomLeft);
		middleRight.setUp(topRight);
		middleRight.setDown(bottomRight);
		bottomLeft.setUp(middleLeft);
		bottomLeft.setRight(bottomMiddle);
		bottomMiddle.setLeft(bottomLeft);
		bottomMiddle.setRight(bottomRight);
		bottomRight.setLeft(bottomMiddle);
		bottomRight.setUp(middleRight);
  }
  
}

