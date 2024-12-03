package Zadani2023;

public class Uzel {
	private int hodnota;
	private Uzel levy;
	private Uzel pravy;
	private Uzel rodic;
	
	public Uzel getLevy() {
		return levy;
	}

	public void setLevy(Uzel levy) {
		this.levy = levy;
	}

	public Uzel getPravy() {
		return pravy;
	}

	public void setPravy(Uzel pravy) {
		this.pravy = pravy;
	}

	public Uzel getRodic() {
		return rodic;
	}

	public void setRodic(Uzel rodic) {
		this.rodic = rodic;
	}

	public Uzel(int i) {
		hodnota = i;
	}

	public int getHodnota() {
		return hodnota;
	}

	public void setHodnota(int hodnota) {
		this.hodnota = hodnota;
	}
		
}
