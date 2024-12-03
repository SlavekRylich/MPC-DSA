package Zadani2023;

public class Prumer_vnitrni_uzly {
	private double soucet = 0;
	private double pocet = 0;
	
	public double VypocetPrumeru(Uzel koren) {
		int po = vratPocet(koren);
		return soucet/pocet;
		
	}
	
	private int vratPocet(Uzel u) {
		if (u == null) return 0;
		
		
		int levy = vratPocet(u.getLevy());
		if ((u.getLevy() != null) || (u.getPravy() != null)) {
			soucet += u.getHodnota();
			pocet += 1;
		}
		int pravy = vratPocet(u.getPravy());
		
		return 1 + levy + pravy;
	}
}
