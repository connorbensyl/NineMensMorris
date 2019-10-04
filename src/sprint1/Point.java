package sprint1;

import sprint1.Point;

public class Point 
{
 
 
	 private boolean isCorner;
     private boolean isMidpoint;
     private String pointState;
     private Point lookRight;
     private Point lookLeft;
     private Point lookUp;
     private Point lookDown;
 

 
 public Point(boolean iscorner, boolean ismidpoint)
 {
	 
	 isCorner = iscorner;
	 isMidpoint = ismidpoint;
	 pointState = "none";
	 lookRight = null;
	 lookLeft = null;
	 lookUp = null;
	 lookDown = null;
 }
 
 Point(boolean iscorner, boolean ismidpoint, String point_state) //point occupied by a black piece, a white piece, or none
 {
	 if(point_state.toLowerCase() != "black" && point_state.toLowerCase() != "white" && point_state.toLowerCase() != "none")
	 {
		 System.out.print("point_state invalid argument");
	 }
	 else
	 {
	 pointState = point_state;
	 }
	 
	 isCorner = iscorner;
	 isMidpoint = ismidpoint;
	 lookRight = null;
	 lookLeft = null;
	 lookUp = null;
	 lookDown = null;
 }
 
 public boolean get_isCorner()
 {
	 return isCorner; 

 }
 
 
 public void set_to_Corner()
 {
	 isCorner = true;
	 isMidpoint = false;
 }
 
 public void set_to_Midpoint()
 {
	 isCorner = false;
	 isMidpoint = true;
 }
 
 public boolean get_isMidpoint()
 {
	 return isMidpoint;
 }

 public void set_point_state(String color) //color should be black, white, or none
 {
	 pointState = color.toLowerCase();
 }
 
 public String get_point_state()
 {
	 return pointState;
 }
 
 public boolean isEmpty() {
	 if (pointState=="none")
		 return true;
	 else
		 return false;
 }
 
 public void setLeft(Point left) {
	 lookLeft = left;
 }
 
 public void setRight(Point right) {
	 lookRight = right;
 }
 
 public void setUp(Point up) {
	 lookUp = up;
 }
 
 public void setDown(Point down) {
	 lookDown = down;
 }
 
 public Point getUp()
 {
	 return lookUp;
 }
 
 public Point getLeft()
 {
	 return lookLeft;
 }
 
 public Point getRight()
 {
	 return lookRight;
 }
 
 public Point getDown()
 {
	 return lookDown;
 }
 
}
 