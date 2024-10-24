package zad1;

public class Exec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Canvas platno = new Canvas(800,	800);
		
		platno.PridejObjekt(new Square(0, 0, 10));
		platno.PridejObjekt(new Circle(1, 1, 10));
		platno.PridejObjekt(new Ellipsa(2, 2, 10, 20));
		
		Group group1 = new Group();
		
		group1.PridejObjekt(new Square(5, 5, 50));
		group1.PridejObjekt(new Circle(6, 6, 51));
		
		platno.PridejObjekt(group1);
		
		
		platno.vytvorRastr();
		

	}

}
