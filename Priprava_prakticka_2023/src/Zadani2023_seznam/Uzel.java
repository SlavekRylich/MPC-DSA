package Zadani2023_seznam;

public class Uzel {
	private String hodnota;
	private Uzel dalsi;
	
	

	public Uzel(String string) {
		hodnota = string;
	}

	public String getHodnota() {
		return hodnota;
	}



	public void setHodnota(String hodnota) {
		this.hodnota = hodnota;
	}



	public Uzel getDalsi() {
		return dalsi;
	}



	public void setDalsi(Uzel dalsi) {
		this.dalsi = dalsi;
	}
	
	
	
}
