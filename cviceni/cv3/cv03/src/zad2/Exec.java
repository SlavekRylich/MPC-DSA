package zad2;

import java.util.HashSet;
import java.util.TreeSet;

public class Exec {
	public static void main(String[] args) {
		HraciPole pole1 = new HraciPole();
		HraciPole pole2 = new HraciPole();
		

		HashSet<HraciPole> mnozina = new HashSet<HraciPole>();
		TreeSet<HraciPole> tree = new TreeSet<HraciPole>();
		
		mnozina.add(pole1);
		tree.add(pole2);
		
				
		
		System.out.println(pole1);
		pole1.MoveMnozina(mnozina,pole1,pole1.RIGHT);
		pole2.MoveTree(tree,pole2,pole2.RIGHT);
		
		System.out.println(pole1);
		pole1.MoveMnozina(mnozina,pole1,pole1.DOWN);
		pole2.MoveTree(tree,pole2,pole2.DOWN);
		
		System.out.println(pole1);
		pole1.MoveMnozina(mnozina,pole1,pole1.LEFT);
		pole2.MoveTree(tree,pole2,pole2.LEFT);
		
		System.out.println(pole1);
		pole1.MoveMnozina(mnozina,pole1,pole1.LEFT);
		pole2.MoveTree(tree,pole2,pole2.LEFT);
		
		System.out.println(pole1);
		pole1.MoveMnozina(mnozina,pole1,pole1.UP);
		pole2.MoveTree(tree,pole2,pole2.UP);
		
		System.out.println(pole1);
		pole1.MoveMnozina(mnozina,pole1,pole1.RIGHT);
		pole2.MoveTree(tree,pole2,pole2.RIGHT);
		
		System.out.println(pole1);
		System.out.println(pole2);
		
		System.out.println("Pocet polozek v HashSetu: " + mnozina.size());
		System.out.println("Pocet polozek v TreeSetu: " + tree.size());
		
	}
	

}
