package sprint1;



public class Square 
{
  Point topLeft = new Point(true,false); //arguments isCorner = true, isMidpoint = false
  Point middleLeft = new Point(false,true); //arguments alternate, isCorner = false, isMidpoint = true
  Point bottomLeft = new Point(true, false);
  Point bottomMiddle = new Point(false,true);
  Point bottomRight = new Point(true, false);
  Point middleRight = new Point(false,true);
  Point topRight = new Point(true,false);
  Point topMiddle = new Point(false,true);

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

