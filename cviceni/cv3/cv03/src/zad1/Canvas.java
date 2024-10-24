package zad1;

import java.util.ArrayList;
import java.util.List;

public class Canvas {
	private int height;
	private int width;
	
	private List<GraphicalObject> objekty = new ArrayList<GraphicalObject>();
	
	public Canvas(int height, int width) {
		super();
		this.height = height;
		this.width = width;
	}
	
	public void vytvorRastr() {
		for (GraphicalObject go : objekty) {
			go.draw();
		}
	}
	
	public void PridejObjekt(GraphicalObject obj) {
		this.objekty.add(obj);
	}
	
	public List<GraphicalObject> getObjekty() {
		return objekty;
	}
	

	public void setObjekty(List<GraphicalObject> objekty) {
		this.objekty = objekty;
	}


	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
	

}
