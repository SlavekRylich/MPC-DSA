package Zadani2023;

import java.util.ArrayList;

public class Cesty_k_listum {
	private double soucet = 0;
	private double pocet = 0;
	
	public ArrayList<ArrayList<Integer>> cesty_k_listum(Uzel koren) {
		
		ArrayList<ArrayList<Integer>> seznam_cest = new ArrayList<ArrayList<Integer>>();
		if (koren == null) return seznam_cest;
		projdi(koren,new ArrayList<>(),seznam_cest);
		return seznam_cest;
		
	}
	
	private void projdi(Uzel u, ArrayList<Integer> aktualni_cesta, ArrayList<ArrayList<Integer>> seznam_cest) {
		if (u == null) return;
		
		aktualni_cesta.add(u.getHodnota());
		
		if ((u.getLevy() == null) && (u.getPravy() == null)) {
			seznam_cest.add(new ArrayList<Integer>(aktualni_cesta));
		}
		projdi(u.getLevy(), aktualni_cesta, seznam_cest);		
		projdi(u.getPravy(), aktualni_cesta, seznam_cest);
		
		 aktualni_cesta.remove(aktualni_cesta.size() - 1);
	}
	
}
