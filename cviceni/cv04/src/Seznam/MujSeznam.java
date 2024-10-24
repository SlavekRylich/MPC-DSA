package Seznam;

public class MujSeznam {
	private Uzel prvni;
	private Uzel posledni;
	private int velikost;

	public boolean jePrazdny() {
		// TODO Auto-generated method stub
		return prvni == null;
	}
	
	
	public void pridej(int hodnota) {
		Uzel novy = new Uzel();
		novy.setData(hodnota);
		novy.setDalsi(prvni);
		
		// provede se pouze nazacatku
		if (jePrazdny()) {
			posledni = novy;
		}
		
		if(prvni != null) {
			prvni.setPredchozi(novy);
		}
		
		prvni = novy;
		
		setVelikost(getVelikost() + 1);
		
	}
	
	public void vypisHodnoty() {
		Uzel tmp = prvni;
		while (tmp != null) {
			System.out.println(tmp.getData());
			tmp = tmp.getDalsi();
		}
	}
	
	public boolean obsahuje(int hodnota) {
		Uzel tmp = prvni;
		while (tmp != null) {
			if (tmp.getData() == hodnota) {
				return true;
			}
			tmp = tmp.getDalsi();
		}
		return false;
	}
	
	public int smazatPrvni() {
		if (prvni == posledni) {
			posledni = null;
		}
		int hodnota = prvni.getData();
		prvni = prvni.getDalsi();
		prvni.setPredchozi(null);
		setVelikost(getVelikost() - 1);
		return hodnota;
	}
	
	public void reverse() {
		Uzel odzacatku = this.prvni;
		Uzel odkonce = this.posledni;

		if (odzacatku == odkonce) return;
		for (;;) {
			int tmp = odzacatku.getData();
			odzacatku.setData(odkonce.getData());
			odkonce.setData(tmp);
			
			odzacatku = odzacatku.getDalsi();
			if (odzacatku == odkonce) return;
			
			odkonce = odkonce.getPredchozi();
			if (odzacatku == odkonce) return;
		}
	}


	public int getVelikost() {
		return velikost;
	}


	public void setVelikost(int velikost) {
		this.velikost = velikost;
	}
	
}
