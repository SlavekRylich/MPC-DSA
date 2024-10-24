package zad1;

public class Square extends GraphicalObject {
	private float side;
	


	public Square(int x, int y, float side) {
		super();
		setX(x);
		setY(y);
		setSide(side);
		
	}
	
	

	public float getSide() {
		return side;
	}


	public void setSide(float side) {
		this.side = side;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Ctverec na pozici: " + getX() + "," + getX() + " ma velikost: " + side );
		
	}

}
