package sprint1;

public class Main {

	public static void main(String[] args)
	{
		Board b = new Board();
		b.connectAllLocalPoints();
		b.connectIntersquarePoints();
		b.setSquareCoords();
		b.innerSquare.bottomRight.set_point_state("black");
		b.innerSquare.middleRight.set_point_state("black");
		b.innerSquare.topRight.set_point_state("black");
		System.out.println(b.innerSquare.bottomRight.isPartOfMill());
		
		
	}

}
