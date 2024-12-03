package Zadani2023_seznam;

import java.util.HashSet;

public class Seznam {
	private Uzel prvni;
	

	public void vloz(String string) {
		Uzel novy = new Uzel(string);
		
		if (prvni == null) {
			prvni = novy;
			return;
		}
		
		Uzel tmp = prvni;
		
		novy.setDalsi(prvni);
		
		prvni = novy;
		
		
	}
	
	public void vypis_list() {
		Uzel tmp = prvni;
		while (tmp != null) {
			System.out.print(tmp.getHodnota());
			tmp = tmp.getDalsi();
		}
		System.out.println();
	}

	public void odstranPredposledni() {
		Uzel tmp = prvni;
		while (tmp != null) {
			if (tmp.getDalsi().getDalsi().getDalsi() == null) {
				tmp.setDalsi(tmp.getDalsi().getDalsi());
				return;
			}
			tmp = tmp.getDalsi();
		}
		
		
	}

	public void odstranDuplicty() {
		Uzel tmp = prvni;
		HashSet<String> set = new HashSet<>();
		while (tmp != null) {
			set.add(tmp.getHodnota());
			if (tmp.getDalsi() == null) return;
			if (set.contains(tmp.getDalsi().getHodnota())) {
				tmp.setDalsi(tmp.getDalsi().getDalsi());
			}
			tmp = tmp.getDalsi();
		}
		tmp = prvni;
			
	}
	


}
