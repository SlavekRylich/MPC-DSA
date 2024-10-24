package zad1;

public abstract class GraphicalObject {
	private int x;
	private int y;
	
	
	public abstract void draw();


	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}
	
			
}
