package zad1;

import java.util.ArrayList;
import java.util.List;

public class Group extends GraphicalObject {
	
	private List<GraphicalObject> objekty = new ArrayList<GraphicalObject>();
	
	
	public void PridejObjekt(GraphicalObject obj) {
		this.objekty.add(obj);
	}
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		for (GraphicalObject go : objekty) {
			System.out.print("Ve sloucenine je: ");
			go.draw();
		}
	}


}
