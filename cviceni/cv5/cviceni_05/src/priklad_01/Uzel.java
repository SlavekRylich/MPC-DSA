package priklad_01;

public class Uzel {
	private int data;
	private Uzel levy;
	private Uzel pravy;
	private Uzel parent;
	
	

	public Uzel(int d) {
		data = d; 
	}
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Uzel getLevy() {
		return levy;
	}
	public void setLevy(Uzel levy) {
		this.levy = levy;
	}
	public Uzel getPravy() {
		return pravy;
	}
	public void setPravy(Uzel pravy) {
		this.pravy = pravy;
	}
	
	public Uzel getParent() {
		return parent;
	}

	public void setParent(Uzel parent) {
		this.parent = parent;
	}
	
}
