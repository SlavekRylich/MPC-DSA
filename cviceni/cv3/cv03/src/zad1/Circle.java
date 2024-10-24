package zad1;

public class Circle extends GraphicalObject {
	private float radius;
	
	
	
	
	public Circle(int x, int y, float radius) {
		super();
		setRadius(radius);
		setX(x);
		setY(y);
		
	}



	public float getRadius() {
		return radius;
	}



	public void setRadius(float radius) {
		this.radius = radius;
	}



	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Kruh na pozici: " + getX() + "," + getX() + " ma polomer: " + radius);
		
	}
	
}
