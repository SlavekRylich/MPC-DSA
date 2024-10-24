package cars;

public class Executable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car auto1 = new Car();
		auto1.cena = 1000;
		
		Car auto2 = new Car();
		auto2.cena = 2000;
		
		Car auto3 = auto2;
		
		System.out.println(auto3.cena);
		
		auto2.cena = 0;

		System.out.println(auto3.cena);
		
		
		// dalsi ukol se znackami aut
		
		auto1.brand = "skoda";
		
		
		auto2.brand = "audi";
		
		System.out.println(auto3.brand);
		
		auto1.rightNeighbor = auto2;

		System.out.println(auto1.brand);
		System.out.println(auto1.rightNeighbor.brand);
		
		
		// dalsi ukols mapovanim aut
		
		Map map = new Map();
		
		map.auto1.brand = "bmw";
		map.auto2.brand = "mercedes";
		map.auto3.brand = "opel";
		map.auto4.brand = "citroen";
		
		System.out.println("--------------Namapovane auta:");
		System.out.println(map.auto1.brand);
		System.out.println(map.auto2.brand);
		System.out.println(map.auto3.brand);
		System.out.println(map.auto4.brand);
		
	}

}
