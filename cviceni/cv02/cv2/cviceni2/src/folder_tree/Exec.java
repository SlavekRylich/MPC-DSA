package folder_tree;

public class Exec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Folder f1 = new Folder();
		Folder f2 = new Folder();
		Folder f3 = new Folder();
		Folder f4 = new Folder();
		Folder f5 = new Folder();
		
		f1.setSub1(f4);
		f1.setSub2(f2);
		f2.setSub1(f4);
		f2.setSub2(f3);
		
	}

}
