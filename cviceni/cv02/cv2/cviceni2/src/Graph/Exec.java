package Graph;

public class Exec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n1 = new Node();
		Node n2 = new Node();
		Node n3 = new Node();
		Node n4 = new Node();
		Node n5 = new Node();
		Node n6 = new Node();
		Node n7 = new Node();
		
		
		n1.addPointerTo(n4);
		n1.addPointerTo(n2);
		n1.addPointerTo(n6);
		n1.addPointerTo(n5);
		
		n2.addPointerTo(n1);
		n2.addPointerTo(n5);
		n2.addPointerTo(n3);
		
		n5.addPointerTo(n4);
		
		n6.addPointerTo(n7);

		System.out.println("1:");
		n1.printNodes();
		System.out.println("2:");
		n2.printNodes();
		System.out.println("3:");
		n3.printNodes();
		System.out.println("4:");
		n4.printNodes();
		System.out.println("5:");
		n5.printNodes();
		
	}
	
	

}
