package priklad_01;

public class MujStrom {
	private Uzel koren = null;

	
	public void vlozit(int hodnota) {
		Uzel novy = new Uzel(hodnota);
		
		if (koren == null) {
			koren = novy;
			return;
		}
		Uzel tmp = koren;
		
		for (;;) {
			if (tmp.getData() < novy.getData()) {
				if (tmp.getPravy() == null) {
					tmp.setPravy(novy);
					return;
					
				} else {
					tmp = tmp.getPravy();
				}
				
			} else {
				if (tmp.getLevy() == null) {
					tmp.setLevy(novy);
					return;
					
				} else {
					tmp = tmp.getLevy();
				}
			}
		}
		
		
	}
	
	public int vypisStrom() {
		int pocet = vypisStrom(koren);
		return pocet;
	}
	
	private int vypisStrom(Uzel u) {
		if (u == null) return 0;
		
		System.out.println(u.getData());
		int levy = vypisStrom(u.getLevy());
		int pravy = vypisStrom(u.getPravy());
		return 1 + levy + pravy;
	}

	
	// pruchod linearnim seznamem - nutno umet ke zkousce!!!
	  public Uzel nejvetsi() {
		  if (koren == null) return null;
		  Uzel tmp = koren;
		  		  
		  while (tmp.getPravy() != null) {
				tmp = tmp.getPravy();
			}
		  	return tmp;
		  }
	 
	 
	

	public Uzel getKoren() {
		return koren;
	}

	public void setKoren(Uzel koren) {
		this.koren = koren;
	}
	
	
}
