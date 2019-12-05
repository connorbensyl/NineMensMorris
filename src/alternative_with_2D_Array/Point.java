package alternative_with_2D_Array;

//////under construction//////
import java.awt.Color;
import java.awt.Graphics;

import alternative_with_2D_Array.Point;

public class Point extends GameObject{
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
 
 public Point(boolean usable, int x, int y, objectID id){
	 this.usable = usable;
	 if(usable == false){
		 this.xCoordinate = 0; //coordinates for gui, NOT for board grid!!!
		 this.yCoordinate = 0;
		 pointState = "NOT USABLE";
	 }
	 else {
		 this.height = 32;
		 this.width = 32;
	 }
	 
 }
 

@Override
public void tick() {
	/////
}

@Override
public void render(Graphics g) {
	if (this.usable) {
		
		g.setColor(Color.black);
		g.fillRect(x,y,width,height);
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

 
 public void set_coords(int x, int y){
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
	  