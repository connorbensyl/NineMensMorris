package sprint1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PointTest {
	int x; 
	int y;
	Point testpoint = new Point(true,false,x,y);

	@Test
	void test_is_point_corner() 
	{
		testpoint.set_to_Corner();
		assertEquals(testpoint.get_isCorner(),true);
		assertEquals(testpoint.get_isMidpoint(),false);
	}
	
	void test_is_point_midpoint()
	{
		testpoint.set_to_Midpoint();
		assertEquals(testpoint.get_isMidpoint(),true);
		assertEquals(testpoint.get_isCorner(),false);
		
	}
	
	void test_is_point_empty()
	{
		assertEquals(testpoint.isEmpty(),true);
		
	}
	
	void test_is_point_occupied()
	{
		testpoint.set_point_state("black");
		assertFalse(testpoint.isEmpty());
	}
	
	void testreturnsErrorOnInvalidPointState()
	{
		testpoint.set_point_state("none");
		testpoint.set_point_state("hello");
		assertEquals(testpoint.get_point_state(),"none");
	}
	
     

	@Test
	void testAdjacentPoints() {
		testpoint = new Point(false,true,x,y);
		assertEquals(testpoint.get_isMidpoint(),true);
		Point downpoint = new Point(true,false,x,y);
		Point leftpoint = new Point(false,true,x,y);
		Point rightpoint = new Point(false,true,x,y);
		Point uppoint = new Point(true,false,x,y);
		testpoint.setDown(downpoint);
		assertEquals(testpoint.getDown(),downpoint);
		testpoint.setLeft(leftpoint);
		assertEquals(testpoint.getLeft(),leftpoint);
		testpoint.setRight(rightpoint);
		assertEquals(testpoint.getRight(),rightpoint);
		testpoint.setUp(uppoint);
		assertEquals(testpoint.getUp(),uppoint);
		
	}

	

}
