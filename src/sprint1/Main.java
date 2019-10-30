package sprint1;

public class Main {

	public static void main(String[] args)
	{
		Board b = new Board();
		b.connectAllLocalPoints();
		b.connectIntersquarePoints();
		b.setSquareCoords();
		b.innerSquare.bottomLeft.set_point_state("black");
		b.innerSquare.middleLeft.set_point_state("black");
		b.innerSquare.topLeft.set_point_state("black");
		System.out.println(b.innerSquare.bottomLeft.isPartOfMill());
		
		
	}

}
