package sprint1;

public class Point 
{
 private
	 boolean isCorner;
     boolean isMidpoint;
     boolean isOccupied;
 public
 
 Point(boolean iscorner, boolean ismidpoint)
 {
	 
	 isCorner = iscorner;
	 isMidpoint = ismidpoint;
	 isOccupied = false;
 }
 
 public boolean get_isCorner()
 {
	 return isCorner; 

 }
 
 
 public void set_isCorner()
 {
	 isCorner = true;
	 isMidpoint = false;
 }
 
 public void set_isMidpoint()
 {
	 isCorner = false;
	 isMidpoint = true;
 }
 
 public boolean get_isMidpoint()
 {
	 return isMidpoint;
 }

 public void set_isOccupied(boolean occupied)
 {
	 isOccupied = occupied;
 }
 
 public boolean get_isOccupied()
 {
	 return isOccupied;
 }
 
}
 