package folder_tree;

public class Folder {
	private Folder sub1;
	private Folder sub2;

	
	public Folder getSub1() {
		return sub1;
	}
	public void setSub1(Folder sub1) {
		this.sub1 = sub1;
	}
	public Folder getSub2() {
		return sub2;
	}
	public void setSub2(Folder sub2) {
		this.sub2 = sub2;
	}
	
	@Override
	public String toString() {
		return "Folder [sub1=" + sub1 + ", sub2=" + sub2 + "]";
	}
	
	
	
}
