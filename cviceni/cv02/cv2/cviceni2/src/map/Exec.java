package map;

public class Exec {
	
	public static void main(String[] args) {
		Map map = new Map();
		map.addCar(new Car());
		
		map.getCar(0).setBrand("Skoda");
		
		System.out.println(map.getCar(0).getBrand());
		
	}

}
