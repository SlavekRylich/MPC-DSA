package Graph;

import java.util.Vector;

public class Node {
	private Vector<Node> nodes = new Vector<Node>();

	public Vector<Node> getNodes() {
		return nodes;
	}

	public void setNodes(Vector<Node> nodes) {
		this.nodes = nodes;
	}
	
	public void addPointerTo(Node node) {
		this.nodes.add(node);
	}	
	
	public void printNodes() {
		for (int i = 0; i < this.nodes.size(); i++) {

			System.out.println(this.nodes.get(i));
		}
	}

	
	
	
	
}
