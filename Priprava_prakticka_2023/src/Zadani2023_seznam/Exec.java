package Zadani2023_seznam;

public class Exec {
	public static void main(String[] args) {
		Seznam s = new Seznam();
		s.vloz("E");
		s.vloz("D");
		s.vloz("C");
		s.vloz("B");
		s.vloz("A");
		s.vloz("C");
		
		s.vypis_list();
		
		s.odstranPredposledni();
		s.vypis_list();
		
		s.odstranDuplicty();
		s.vypis_list();

		//A
		//B
	}
}
