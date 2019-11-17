package alternative_with_2D_Array;

import alternative_with_2D_Array.Point;

public class Point 
{
	 private boolean isCorner;
     private boolean isMidpoint;
     private String pointState;
     int xCoordinate;
     private int yCoordinate;
     private boolean usable;
     
     
     
public Point()
{
    pointState = "none";
}
 
 public Point(boolean usable, int x, int y)
 {
	 
	 
	 
	 this.usable = usable;
	 
	 if(usable == false)
	 {
		 this.xCoordinate = 0; //coordinates for gui, NOT for board grid!!!
		 this.yCoordinate = 0;
		 pointState = "NOT USABLE";
		 
	 }
	 
		 
	 
	 
	 
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
 

 

 
 public void set_coords(int x, int y)
 {
	 this.xCoordinate = x;
	 this.yCoordinate = y;
 }
 

public int get_xcoord()
{
	return xCoordinate;
}

public int get_ycoord()
{
	return yCoordinate;
}

public boolean getUsable()
{
	return usable;
}

public void setUsable(boolean u)
{
	this.usable = u;
	if(usable == false)
	{
		this.pointState = "NOT USABLE";
	}
	else
	{
		this.pointState = "none";
	}
}


 

}
	  