package Hra;

import java.util.HashSet;

public class Exec {
	public static void main(String[] args) {
		HraciPole pole1 = new HraciPole();
		HraciPole pole2 = new HraciPole();
		

		HashSet<HraciPole> mnozina = new HashSet<HraciPole>();
		
		mnozina.add(pole1);
		
		mnozina.add(pole2);
		

		System.out.println(pole1);
		
		pole1.move(pole1.UP);
		
		System.out.println(pole1);
		pole1.move(pole1.RIGHT);
		
		System.out.println(pole1);
		pole1.move(pole1.UP);
		
		System.out.println(pole1);
		pole1.move(pole1.RIGHT);
		
		System.out.println(pole1);
		pole1.move(pole1.DOWN);
		System.out.println(pole1);
		
		pole1.move(pole1.LEFT);
		System.out.println(pole1);
		
		pole1.move(pole1.LEFT);
		System.out.println(pole1);
		
		pole1.move(pole1.LEFT);
		System.out.println(pole1);
	}

}
