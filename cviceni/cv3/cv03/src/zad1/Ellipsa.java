package zad1;

public class Ellipsa extends GraphicalObject {
	private float height;
	private float weight;
	

	public Ellipsa(int x, int y, float height, float weight) {
		super();
		setX(x);
		setY(y);
		this.height = height;
		this.weight = weight;
	}

	
	public float getHeight() {
		return height;
	}


	public void setHeight(float height) {
		this.height = height;
	}


	public float getWeight() {
		return weight;
	}


	public void setWeight(float weight) {
		this.weight = weight;
	}


	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Elipsa na pozici: " + getX() + "," + getX() + " ma vysku a sirku: " + height + "," + weight);
		
	}

}
