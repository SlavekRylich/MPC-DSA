package folders;

public class Exec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Folder root = new Folder();
		
		Folder f1 = new Folder();
		Folder f2 = new Folder();
		Folder f3 = new Folder();
		Folder f4 = new Folder();
		
		root.subfolder1 = f1;
		root.subfolder2 = f2;
		
		f2.subfolder1 = f3;
		f2.subfolder2 = f4;
		
		
	}

}
