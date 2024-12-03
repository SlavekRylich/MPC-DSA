package Zadani2023;

public class Prumer {
	private double soucet = 0;
	
	public double VypocetPrumeru(Uzel koren) {
		double pocet = 0;
		pocet = vratPocet(koren);
		return soucet/pocet;
		
	}
	
	private int vratPocet(Uzel u) {
		if (u == null) return 0;
		
		soucet += u.getHodnota();
		int levy = vratPocet(u.getLevy());
		int pravy = vratPocet(u.getPravy());
		
		return 1 + levy + pravy;
	}
}
