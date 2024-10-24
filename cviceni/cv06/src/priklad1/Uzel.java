package priklad1;

import java.util.LinkedList;

public class Uzel {
	private String id;
	private LinkedList<Uzel> sousedi = new LinkedList<Uzel>();
	private int barva;
	

	public Uzel(String id) {
		super();
		this.id = id;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public LinkedList<Uzel> getSousedi() {
		return sousedi;
	}

	public void setSousedi(LinkedList<Uzel> sousedi) {
		this.sousedi = sousedi;
	}

	public int getBarva() {
		return barva;
	}

	public void setBarva(int barva) {
		this.barva = barva;
	}

	@Override
	public String toString() {
		return id;
	}

	
	
	
	
}
