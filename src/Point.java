
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
<<<<<<< HEAD
	 return isCorner; //blah blah blah
=======
	 return isCorner;   
>>>>>>> c948b9563477fcaf7e2c79d5c7a0129bae4a59ba
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
 